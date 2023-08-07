package algoPrj.day15.인터페이스;
public class TeacherProgram {	
	MyRunnable r;	
	public void setR(MyRunnable r) {
		this.r = r;
	}	
	public void run() {
		r.run();
	}
	public static void main(String[] args) {	 
		System.out.println("학생들이 작성한 코드를 실행시켜드립니다");
		TeacherProgram p = new TeacherProgram();
		p.setR(new MyRunnable() {
			@Override
			public void run() {
			     System.out.println("윤코드 실행합니다");				
			}} );
		p.run();
		
		//실행코드
		p.setR(new Leeyoon());
		p.run();
		
		//은경님 실행코드
		p.setR(new Ek());
		p.run();		
		
		//재혁님 실행코드
		p.setR(new JHStar());
		p.run();
		
		//지원님 실행코드
		p.setR(new Jiwon());
		p.run();
		
		//병진님 실행코드
		p.setR(new KBJ());
		p.run();
		
		//재열님 실행코드
		p.setR(new Kjy());
		p.run();
		
		//정훈님 실행코드
		p.setR(new LJH());
		p.run();
		
		//민규님 실행코드
		p.setR(new MinGyu());
		p.run();
		
		//단야님 실행코드
		p.setR(new multi_kdy());
		p.run();
		
		//나정님 실행코드
		p.setR(new NaJeong());
		p.run();
		
		//예진님 실행코드
		p.setR(new SYJ());
		p.run();
		
		//태민님 실행코드
		p.setR(new Taemin());
		p.run();
		
		//민지님 실행코드
		p.setR(new 김민지클래스());
		p.run();
		
		
	}
}
