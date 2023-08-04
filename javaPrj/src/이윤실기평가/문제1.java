package 이윤실기평가;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		구구단출력하기();

	}

	private static void 구구단출력하기() {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(a);
		for(int i=1;i<=9;i++) {
			System.out.println(a*i);
		}
		
	}

}
