import java.util.*;
import java.util.Random;
public class InfixtoPostfix extends StackArray{
   StackArray stack = new StackArray();
   private String infix;
   public InfixtoPostfix(String infix)       {this.infix = infix;}
   
   private boolean isOperator(char ch)       {return ch=='+'||ch=='_'||ch=='*'||ch=='/' || ch == '^' ;}
   private boolean isLowerPrecedence(char a, char b){
      switch (a){
         case '+':case '_': return !((b=='+') || (b=='_'));
         default: return false;
      }
   }
   private boolean isSpace(char ch)           {return ch==' ';}
   public String convert(){
      StringBuffer sb = new StringBuffer();
       if(!infix.equals("")){
         java.util.StringTokenizer st = new java.util.StringTokenizer(infix,"*_/+^", true);
         
         while(st.hasMoreTokens()){
         String token = st.nextToken();
         char ch = token.charAt(0);
          
         if(isOperator(ch)){
            
            while(!stack.isEmpty() && !isLowerPrecedence(stack.peek().toString().charAt(0),ch)){
               sb.append(stack.pop()).append(" ");
            }
            String cha = String.valueOf(ch);
            stack.push(cha);
           }
           else sb.append(token).append(" ");
         }
         while(!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
         }
       }
      
     return sb.toString();
   }
      public double compute(){
      
         InfixtoPostfix itf = new InfixtoPostfix(infix);
         String postfix = itf.convert();
         double result = 0.0;
         
         java.util.StringTokenizer st = new java.util.StringTokenizer(postfix," ", true);
        try{
         while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.equals(" "))
            continue;
            
           
           char ch = token.charAt(0);
           if(ch == '\u03C0')
            token = "3.14";
       
           if(isOperator(ch)){  
            double b = Double.parseDouble(stack.pop().toString());
            double a = Double.parseDouble(stack.pop().toString());
            double y = 0.0;
            switch(ch){
               case '+':
                     y = a+b;
               break;
               case '_':
                     y = a-b;
               break;
               case '*':
                     
                     y = a*b;
                     
               break;
               case '/':{
                     y = a/b;
                     }
               break;
               case '^':
                     y = Math.pow(a, b);
               break;
            }
            String x = String.valueOf(y);
            stack.push(x);
          }else
            stack.push(token);
         }
        
         result = Double.parseDouble(stack.peek().toString());
         }
     catch(Exception e){
        return 0;
         }
           return Math.round(result*100.0)/100.0;
      }
   static public void main(String... args){
      
      String infix = "1_2*3+4";
      InfixtoPostfix itf = new InfixtoPostfix(infix);
      System.out.println("Infix: "+infix);
      String postfix = itf.convert();
      System.out.println("Postfix: "+postfix);
      System.out.println("Result: "+itf.compute());
   }
}//end of class
 

