public class StackTest{
public static void main(String[] args) {		
        Stack s = new Stack(8);
        s.push(109);
        s.push(20);
        s.push(300);
        s.push(112);
    
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.size());   
        System.out.println(s.top()); 


		//when using assert run the command java -ea filename to execute the file.
		System.out.println("All test cases passed");	
	}

}