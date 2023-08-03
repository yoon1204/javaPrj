package algoPrj.day13.ObjectEx;

public class 이윤테스트 {

	public static void main(String[] args) {


		이윤  a = new  이윤();
		
		String str  = a.toString();
		
		System.out.println(  str);
		
		
		Object o= a;    //  가능합니다.    Object    이윤   ( 상속관계입니다)
		
		//  Object로 다루면  Object만큼만 해석이 가능하다
		
		
		// 다운캐스팅은  실체  new 된 객체 실체가 중요합니다
		
		//이윤정 b = (이윤정)o;   //다운캐스팅 잘못된
		
		이윤 b = ( 이윤)o;   //다운캐스팅 잘못된
		 b.커피를잘만든다();
		
		
		
		
	}

}
