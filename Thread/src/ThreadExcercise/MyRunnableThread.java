package ThreadExcercise;

public class MyRunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable runnable = new MyRunnable();
				Thread t1 = new Thread(runnable);
		t1.start();
		for ( int c=0; c<10; c++)
		{
			System.out.println("Inside of main Thread"+c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("End of main Thread");

	}

}
