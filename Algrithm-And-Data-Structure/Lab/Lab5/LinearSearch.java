public class LinearSearch {
   public static void main(String args[]){
      int arr[] = {1, 2, 5, 3, 9, 7};
      int value = 9;
      int len = arr.length;

      for (int i=0 ;i < len; i++){
         if(arr[i]==value)
         System.out.println("Element found index is :"+ i);  
      }
   }
}