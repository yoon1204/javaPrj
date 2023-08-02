package algoPrj.day12.quiz;

public class 예진님_LibraryTest {

	public static void main(String[] args) {
	
		예진님_자바의정석 J = new 예진님_자바의정석();
		예진님_부의인문학 M = new 예진님_부의인문학();
		
		J.already_B();
		M.already_R();
		
		예진님_Library Li = J; // 업캐스팅
//		자바의 정석 already_B 보이지 않음
		
		예진님_자바의정석 Ja =(예진님_자바의정석)Li; //다운캐스팅
		Ja.already_B();
	}

}
