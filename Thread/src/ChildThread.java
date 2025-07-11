
public class ChildThread {

	public ChildThread(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ChildThread c=new ChildThread(10, "Hello");
		ChildThread c1=new ChildThread(5, "TNSIF");
		
		c.start();
		c1.start();
		System.out.println("End of the Program");

	}

	void start() {
		// TODO Auto-generated method stub
		
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}

}