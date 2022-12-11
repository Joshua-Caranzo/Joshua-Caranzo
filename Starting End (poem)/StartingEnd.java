import java.util.*;
public class StartingEnd{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String[] a = {"", "This is the start of my love story." ,"I became the man with everything" ,  "Love, Happiness, Strength, Stability", "She came to me when I, mean nothing.", "",
                  "A pleasing lady glowed in so bright.", "Days have gone by, the atmosphere shuffled;",  "Drowned deep in the sea, hit by the light.", "Nobody's saving while I'm dazzled.", "",
                   "Truth is that love saves and heals the heart.", "Love will always hurt and pain us but,","This poem tells everybody that;",  "Ending is the most exciting part.", "" };
     System.out.println("--------The Starting End--------");
     for(int i = 0 ; i <= a.length-1; i++){
      System.out.println(a[i]);
     }
      System.out.println("Press r to reverse!");
      String ar = scan.nextLine();
      char ch = ar.charAt(0);
     if(ch == 'r'){
      System.out.println("--------The Starting End--------");
     for(int i = a.length-1; i>=0; i--){
      System.out.println(a[i]);
      }
      }
     else
      System.out.print("Error");

      
   }
}