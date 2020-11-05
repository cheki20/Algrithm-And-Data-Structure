public class Merge{  
	void merge(int a[], int beginning, int middle, int ending){  
  		int l = middle - beginning + 1;  
		int r = ending - middle;  
  
		int LeftArray[] = new int [l];  
		int RightArray[] = new int [r];  
  
		for (int i=0; i<l; ++i)  
			LeftArray[i] = a[beginning + i];  
  
		for (int j=0; j<r; ++j)  
			RightArray[j] = a[middle + 1+ j];  
  
		int i = 0, j = 0;  
		int k = beginning;  

		while (i<l && j<r){  
			if (LeftArray[i] <= RightArray[j]){  
				a[k] = LeftArray[i];  
				i++;  
			}  
			else {  
				a[k] = RightArray[j];  
				j++;  
			}  
			k++;  
		}  
		while (i<l) {  
			a[k] = LeftArray[i];  
			i++;  
			k++;  
		}  
  
		while (j<r) {  
			a[k] = RightArray[j];  
			j++;  
			k++;  
		}  
	}  
  
	void sort(int a[], int beginning, int ending){  
		if (beginning<ending){  
			int middle = (beginning+ending)/2;  
			sort(a, beginning, middle);  
			sort(a, middle+1, ending);  
			merge(a, beginning, middle, ending);  
		}  
	}  

	public static void main(String args[]){  
		int a[] = {9, 1, 3, 2, 4, 0, 5, 6, 8, 7}; 

		System.out.println("Before Sorting");
		for(int i=0; i < a.length; i++){  
        	System.out.print(a[i] + " ");  
        }
        System.out.println();

        System.out.println("After Sorting"); 

		Merge ob = new Merge();  
		ob.sort(a, 0, a.length-1);  //sorting a elements using merge sort 

		for(int i=0; i<a.length; i++){  
    		System.out.print(a[i] + " ");  
		}
		System.out.println();
	}  
}  