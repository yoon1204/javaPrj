package algoPrj.day11.quiz;

public class 예진님_MovieTest2 {

	public static void main(String[] args) {

		//생성자는 함수, 매서드동일 , 특별한 매서드
		//이름이없는 매서드입니다. 
		// 단 한번 new 객체를 생성할 때 객체의 초기화를 담당하는 역할을 가진다.
		{
			예진님_MovieClass M = new 예진님_MovieClass("분노의 질주: 라이드 오어 다이", "action", "2시간 21분", "15세이상");
			M.printInfo();	
		
		}
		예진님_MovieClass M2 = new 예진님_MovieClass("쥬라기 월드: 도미니언", "action/SF", "2시간 27분", "12세 이상");
		예진님_MovieClass M3 = new 예진님_MovieClass("쥬라기 월드: 도미니언", "action/SF", "2시간 27분", "12세 이상");
		 
 //		M.printInfo();		
	 	M2.printInfo();		
	 	M3.printInfo();
		
	}

}
