package algoPrj.day12.quiz;

public class 병진님_Dog extends 병진님_Animal {
	
	public void 집을지킨다() {
		System.out.println( "집을 지킨다");
	}
	
	//부모의 매서드를 재정의 할 수 있다.
	//부모의 매서드를 재정의 할 떄는 반드시 입력, 반환정보 모두 같아야한다.
	@Override
	public void 짖는다() {
		System.out.println("멍멍");
	}
}
