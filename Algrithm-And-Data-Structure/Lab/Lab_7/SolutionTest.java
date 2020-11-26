public class SolutionTest{
	public static void main(String[] args) {
		Solution<Integer, String> obj = new Solution<Integer, String>();
		obj.put(1, "A");
		obj.put(2, "B");
		obj.put(3, "C");
		obj.put(4, "D");
		System.out.println(obj.isEmpty());
		System.out.println(obj.get(1));
		System.out.println(obj.size());
		System.out.println(obj.floor(1));
		System.out.println(obj.select(3));
		System.out.println(obj.keys(1,3));

	}
}