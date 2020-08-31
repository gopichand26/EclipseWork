package ThreadExcercise;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int c=0; c<10; c++)
		{
			System.out.println("Inside of child Thread"+c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("End of child Thread");
		}

	}


