package algoPrj.day20.thread;
////////////////////////////
public class SleepEx {

	public static void main(String[] args) {	
		
		SThread th1=new SThread();
		th1.start();
		
		SThread2 th2=new SThread2();
		th2.start();
	

		
	}
}
////////////////////
class SThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(1000);
				System.out.println((i+1)+"hi ^^");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
}
///////////////////////

class SThread2 extends Thread{
	@Override
	public void run() {	
		for(int i=0; i<100; i++) {
			try {
				sleep(200);
				System.out.println((i+1)+"hi ^^");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
