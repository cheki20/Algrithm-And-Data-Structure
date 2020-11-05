// Create Stack Using Linked list 
public class StackLinkedlist { 
    int top;
    Node head;
    Node tail;
    int size;
    int[] arr;

    // Constructor 
    public StackLinkedlist(int x) 
    {
        head = null;
        tail = null;
        size = 0;
        top = -1;
        arr = new int[x];
    } 
    public  boolean isEmpty(){
        if (size==0) {
            return true;  
        }
            return false;
    }
    public  int size(){
        return size;
    }

    //
    public  int top(){
        if (isEmpty()) {
            return 0;
        }
            return arr[top];
    }
    //
    public void push(int n){
        Node newest = new Node();
        if (size==0) {
            head = newest;
            tail = newest;
        }
        else {
            newest.setNext(head);
            head = newest;
        }
        size = size + 1;
    }
    // 
    public int pop() // remove at the beginning 
    {
        if (isEmpty()) { 
            return 0; 
        } 
        else{
            top = top - 1;// point top to the next node
        }
        size = size - 1;
        return arr[top + 1];
    }

}
class Node{
    int element;
    Node next;

    public void setNext(Node n){
        next = n;

    }
}

  
   
    
    
  
   


