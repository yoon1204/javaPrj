package algoPrj.day3;

public class 구구단출력 {

	public static void main(String[] args) {
		
		
	//2단~4단 출력
		
		//2단
		for(int i=1; i<=9; i++) {
			System.out.println(2*i);
		}
		
		//3단
		/*System.out.println(3*1);
		System.out.println(3*2);
		System.out.println(3*3);
		System.out.println(3*4);
		System.out.println(3*5);
		System.out.println(3*6);
		System.out.println(3*7);
		System.out.println(3*8);
		System.out.println(3*9);
		*/
		for(int i=1; i<=9; i++) {
			System.out.println(3*i);
		}
		//4단 출력
		
		for(int i=1; i<=9; i++) {
			System.out.println(4*i);
		}
		
		
		///
		//5단 출력
		
		for(int i=1; i<=9; i++) {
			System.out.println(5*i);
		}
		
		
		//6단 출력
		for(int i=1; i<=9; i++) {
			System.out.println(6*i);
		}
		
		//7단 출력
		for(int i=1; i<=9; i++) {
			System.out.println(7*i);
		}
		
		//8단 출력
		for(int i=1; i<=9; i++) {
			System.out.println(8*i);
		}
		
		//9단 출력		
		System.out.println("<<9단>>");
		for(int i=1; i<=10; i++) {
			System.out.println(9*i);
		}
		
		//
		for(int j=1; j<=8; j++) { //8번 반복제어변수이면서 구구단의 단정보를 만들어내는 변수			
			//8단
			for(int i=2; i<=8; i++) {
				System.out.println(j*i);
			}				
		}
		
		
	}
}
	
	
