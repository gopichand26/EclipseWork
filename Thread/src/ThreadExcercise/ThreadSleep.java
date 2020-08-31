package ThreadExcercise;

public class ThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello java");
		Thread t1 = Thread.currentThread();
		for(int c=0; c<5 ;c++)
		{
			System.out.println(c);
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		t1.setName("gopi's Thread");
		t1.setPriority(5);
		System.out.println(t1);
System.out.println("End of the program");
	}

}
