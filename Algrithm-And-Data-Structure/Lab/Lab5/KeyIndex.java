public class KeyIndex {
	void Sort(int a[], int R, int n, int count[], int aux[]){
		// Compute frequency counts.
		for (int i = 0; i < n; i++)
			count [a[i]+1]++;

		// Transform counts to indices.
		for (int r = 0; r < R; r++)
			count[r+1] += count[r];

		// Distribute the records.
		for (int i = 0; i < n; i++)
			aux[count[a[i]]++] = a[i];

		// Copy back.
		for (int i = 0; i < n; i++)
			a[i] = aux[i];

	}
    public static void main(String[] args) {
    	KeyIndex obj = new KeyIndex();
    	int a[]={1,3,1,5,7,4,9,3,1,0};
    	int R = 10;
    	int n = a.length;
        int count[]=new int[R+1];
        int[] aux = new int[n];

        System.out.println("Before Sorting: ");
		for (int i = 0; i<n ;i++ ) {
			System.out.print(" "+a[i]);	
		}
		System.out.println("");

        obj.Sort(a,R,n,count,aux);
        
       	System.out.println("After Sorting: ");
		for (int i = 0; i<n ;i++ ) {
			System.out.print(" "+a[i]);	
		}
		System.out.println("");

    }
}
