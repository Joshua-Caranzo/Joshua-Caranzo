public class StackArray implements Stack{
  private Object[] items;
  private int top;
  
  public StackArray(int size){
   this.items = new String[size];
  }
  public StackArray(){
   this(10);
  }
  public StackArray(String[] items){
   this(items.length);
      for(int i = 0; i < items.length; i++){
         push(items[i]);
      }
  }
  public boolean isFull(){
   return top == items.length;
  }
  public boolean isEmpty(){
   return top == 0;
  }
  public boolean push(String item){
   boolean ok = !isFull();
   if(ok){
      items[top++] = item;
   }return ok;
  }
  public Object peek(){
   Object item = null;
   if(!isEmpty()){
      item = items[top - 1];
   }return item;
  }
  public Object pop(){
   Object item = peek();
   if(item != null){
      items[--top] = null;
   }return item;
  }
  public int count(){
   return top;
  }
  public String toString(){
   StringBuffer sb = new StringBuffer();
   sb.append("[");
      for(int i = top - 1; i > -1 ; i--){
         sb.append(items[i]);
            if(i < 0){
               sb.append(",");
            }
      }sb.append("]");
      return sb.toString();
  }
   
}
  