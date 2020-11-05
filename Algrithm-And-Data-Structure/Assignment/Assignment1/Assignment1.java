import java.util.*;
public class Assignment1{
	public static void main(String[] args) {
		int ini_size = 10; // giving an initial array size
		ArrayList obj = new ArrayList(ini_size); //creating array object

		//adding element to the array
		obj.add(1);
		obj.add(2);
		obj.add(4);
		obj.add(8);
		obj.add(5);

		//printing the array 
		System.out.print("Size and elements of array: ");
		for (int i = 0; i < obj.size; i++) { 
			System.out.print(obj.arr[i] + " "); 
		}
		
		//it removes the last element of the array
		obj.pop();

		//printing elements after pooping the last element
		System.out.print("\nElements after removing the last element:" );
		for (int i = 0; i < obj.size; i++) { 
			System.out.print(obj.arr[i] + " "); 
		}

		//resizing the elements using given conditions in the  method
		obj.resize();
		//size of the element after resizing
		if(obj.size!=ini_size){

			for (int i = 0; i < obj.size; i++) { 
				System.out.print(obj.arr[i] + " "); 
			}

			System.out.println("Array size changed"+obj.size);
			}

		else{

			for (int i = 0; i < obj.size; i++) { 
				//System.out.print(obj.arr[i] + " "); 
			}

			System.out.println("\nSame array size that is "+obj.size);
		}

		//printing the size of the array
		System.out.println("Size of Array: " +obj.size());

		//printing the array that is converted to string.
		System.out.println("Array as String: " +obj.toString());
	}
}
//Creating Another class 
class ArrayList{
	//Declaring variables
	int size;
	int count;
	int size1;
	int size2;
	int[] arr;

	//Constructor
	public ArrayList(int length){
		//initializing values
		count = 0;
		size = length;
		arr = new int[size];
		size1 = Math.round((25*length)/100);
		size2 = Math.round((75*length)/100);
	}

	//will add new element in the array
	public void add(int ele)
	{
		arr[count] = ele;
		count++;
	}
	//remove the last element
	public void pop()
	{
		if(count > 0){
            arr[count-1] = 0; 
            count--; 
        } 	
	}

	//resize the size of array to double if array is full by 75% and half if 25% full
	public void resize()
	{
		if(count == size1){
			int[] newArr = new int[size/2];

			for(int i=0;i<count;i++){
				newArr[i]=arr[i];
			}

			size = size/2;
			arr = newArr;
		}

		if(count == size2){

			int[] newArr = new int[size*2];

			for(int i=0;i<count;i++){
				newArr[i]=arr[i];
			}

			size = size*2;
			arr = newArr;
		}
	}
	//getting the size of the array
	public int size(){
		return count;
	}

	//Converting the array to string
	public String toString()
	{
		String str=Arrays.toString(arr);
		return str;
	} 
}
