public class QueueTest{
public static void main(String[] args) {		
        Queue s = new Queue(8);
        s.enqueue(109);
        s.enqueue(20);
        s.enqueue(300);
        s.enqueue(112);
    
        System.out.println(s.isEmpty());
        System.out.println(s.len());
        System.out.println(s.first());
        System.out.println(s.dequeue());
        System.out.println(s.len());        

		//when using assert run the command java -ea filename to execute the file.
		System.out.println("All test cases passed");	
	}

}