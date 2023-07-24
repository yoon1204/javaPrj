package algoPrj.day3;

public class 전체구구단반복문 {

	public static void main(String[] args) {
		//
		for(int j=1; j<=9; j++) { //9번 반복제어변수이면서 구구단의 단정보를 만들어내는 변수		
			System.out.println(j+"단 출력");
			
			//9단
			for(int i=1; i<=9; i++) {
				System.out.println(j+" * "+i+" = "+j*i);
			}				
		}
		
		
	}

}
