import java.util.*;
public class SeparateChainingHashSTTest{
	public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        st.put("Cheki", 1);
        st.put("Lhamo", 2);
        st.put("Dorji", 3);
        st.put("Wangmo", 4);
        
        System.out.println("isEmpty: " +st.isEmpty());
        System.out.println("Get cheki: " +st.get("Cheki"));
        st.put("Galey", 12);
        System.out.println("contains Lhamo: " +st.contains("Lhamo"));
        System.out.println("Size: " +st.size());
        st.delete("Wangmo");
        System.out.println("Size After deletion: " +st.size());

        System.out.println("contains check: " +st.contains("Chek"));
    }
}