package algoPrj.day20.thread;

public class Ex04 {

	public static void main(String[] args) {
		/*
		for(int i=0; i<100; i++)
			System.out.println((i+1)+"hi ^^");
		
		*/
		
		//수행할 코드를 작성해서 인자정보로 넘겨줘야 함
		//Runnable 인터페이스로 약속되어 있음(void run())
		
		
		Thread th1=new Thread(new RunnableImp());
		th1.start();
		
		/*
		for(int i=0; i<100; i++)
			System.out.println((i+1)+"bye ^^");
		*/
		//Thread th2=new Thread(new Runnable() {}); 
		Thread th2=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<100; i++)
					System.out.println((i+1)+"bye ^^");
			
		}});
		th2.start();
		
		/*
		 * interface Runnable{
		 * void run();
		 * }
		 * 
		 * 
		   Thread(Runnable r);
		  
		   1.인터페이스를 이름있는 클래스로 작성해서 사용
		   2.익명클래스를 사용
		 */
		
		
	}
}

// Runnable 인터페이스를 구현한 이름있는 클래스 작성
class RunnableImp implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<100; i++)
			System.out.println((i+1)+"hi ^^");
		
	}
}
