public class Selection{
	public static void SelectionSort(int[] arr1){
		int n = arr1.length;
		for(int i = 0; i < n - 1; i++){
			int smallest = i;

			for(int j = i + 1; j < n; j++){
				if (arr1[j] < arr1[smallest]){  
                   smallest = j;//searching for lowest index  
                }  
            }  
            int temp = arr1[smallest];   
            arr1[smallest] = arr1[i];  
            arr1[i] = temp; 
			}
		}
	
	public static void main(String[] args) {
		int[] arr = {5,2,3,8,1,4,7,6};

		System.out.print("Array Before Sorting: ");
		for (int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i]);
		}

		SelectionSort(arr);
		System.out.println();

		System.out.print("After Selection Sort: ");  
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]);  
        }
        System.out.println();
	}
}


