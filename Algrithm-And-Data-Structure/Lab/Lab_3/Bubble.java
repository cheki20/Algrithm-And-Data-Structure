public class Bubble{
	public static void BubbleSort(int[] array){
		int n = array.length;

		for (int i = 0; i < n; i++ ) {
			for (int j = 0; j< n-1; j++ ) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
			
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,2,3,8,1,4,7,6};
		int n = arr.length;

		System.out.print("Array Before Sorting: ");
		for (int i = 0; i < n; i++ ) {
			System.out.print(arr[i]);
		}	
		BubbleSort(arr);	
		System.out.println("");
		System.out.print("Array After Sorting: ");
		for (int i = 0; i < n; i++ ) {
			System.out.print(arr[i]);
		}	
		System.out.println("");	
	}
}