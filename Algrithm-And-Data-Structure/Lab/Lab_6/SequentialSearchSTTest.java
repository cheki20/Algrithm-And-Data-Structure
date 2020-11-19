public class SequentialSearchSTTest{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();
		obj.put("a",9);
		obj.put("b",4);
		obj.put("c",1);
		obj.put("a",8);
		obj.delete("a");
		System.out.println(obj.keys());

		 
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());



	}
}