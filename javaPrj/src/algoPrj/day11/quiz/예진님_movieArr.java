package algoPrj.day11.quiz;

public class 예진님_movieArr {

	public static void main(String[] args) {

		예진님_MovieClass[] M = new 예진님_MovieClass[3];
		
		M[0]=new 예진님_MovieClass();
		M[0].input("분노의 질주: 라이드 오어 다이","action","2시간 21분","15세이상");
		M[1]=new 예진님_MovieClass();
		M[1].input("쥬라기 월드: 도미니언","action/SF","2시간 27분","12세 이상");
		M[2]=new 예진님_MovieClass();
		M[2].input("서치2","thriller","1시간 51분","12세 이상");
		
		M[0].printInfo();
		M[1].printInfo();
		M[2].printInfo();
		
		
		
		
	}

}
