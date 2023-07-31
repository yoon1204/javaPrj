package algoPrj.day10.quiz;

import java.util.Scanner;

public class 정훈님_라이브러리연습Test {

	public static void main(String[] args) {

		정훈님_라이브러리연습 cal = new 정훈님_라이브러리연습();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산기 : 예) 23 + 12");
		int a = sc.nextInt();
		String c_ = sc.next();   // "2"   ->  '2'
		char c  = c_.charAt(0);		// Sanner는 char를 못 받음
		
		int b = sc.nextInt();
		
		cal.input(a, b, c);
		cal.print();
		
		
	}

}
