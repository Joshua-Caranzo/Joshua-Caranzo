public class StackLinked extends Node{
  private Node top;
  private int count, Max = 10;
  
  public boolean isFull(){
   return count == Max;
  }
  public boolean isEmpty(){
   return count == 0;
  }
  
  public boolean push(Object item){
   boolean ok = !isFull();
   Node node = new Node(item);
   if(!isEmpty()){
      node.setNext(top);
   }top = node;
   count++;
   return ok;
  }
  public Object peek(){
   Object item = null;
   if (!isEmpty()){
      item = top.getItem();
   }return item;
  }
  public Object pop(){
   Object item = peek();
   if(item != null){
      Node temp = top;
      top = temp.getNext();
      temp = null;
      count--;
   }return item;
  }
  public String toString(){
   StringBuffer sb = new StringBuffer();
   Node temp = top;    
       while(temp != null){
         sb.append(top.getNext());
       }sb.append(top.getItem());
       return sb.toString();
  }
}