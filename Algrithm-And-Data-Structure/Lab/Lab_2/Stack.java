public class Stack{
	int[] arr;
	int top;
	int size;

    //Constructor 
	public Stack(int x){
        size = 0;
        top = -1;
        arr = new int[x];
    }

    //
    public  boolean isEmpty(){
        if (size==0) {
            return true;  
        }
        return false;
    }
    //
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

    public  void push(int n){
        top = top + 1;
        if (isEmpty()){
            arr[0] = n;
            top = arr[0];
            top = 0;

        }
        else
        {
            arr[top] = n;
        }
        size = size + 1;

    }

    public  int pop(){
        if (isEmpty()) {
            return 0;
        }
        else{

            top = top - 1;
        }
        size = size - 1;
        return arr[top + 1];
    }
}
	
