package Multithread;

public class Demo extends Thread{

	public static void main(String[] args) {
		Demo d = new Demo();
		d.start();
		d.start();
		Thread t1=new Thread();
		t1.start();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		System.out.println("Run()");
		// TODO Auto-generated method stub
		
	}

}
