package algoPrj.day11.quiz;

import java.util.Scanner;

public class 민규님_Mile_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("마일을 입력하세요 자동으로 km로 변환됩니다.");
		Scanner sc = new Scanner(System.in);
		int mile = sc.nextInt();
		민규님_Mile ab = null;
		ab = new 민규님_Mile();  // Mile  type(자료형)  변수만들기
		
		
		//ab.calCulator(mile);
		//double result  = ab.getKiloMeter();
		
		//System.out.println( result);
		double result2= ab.getKiloMeter();
		System.out.println( result2);
		
	
		//
		//System.out.println(ab.kiloMeter + "km");
	
	
		
	}

	
}
