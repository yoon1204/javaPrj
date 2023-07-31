package algoPrj.day10.quiz;

import java.util.Scanner;

import day10.라이브러리연습;

public class 단야님_라이브러리연습test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("더하고 싶은 숫자를 하나 적으세요");
		Scanner sa = new Scanner(System.in);
		int a = sa.nextInt();
		System.out.println("더하고 싶은 숫자 나머지를 적으세요");
		Scanner sb = new Scanner(System.in);
		int b = sb.nextInt();
		
		
		int result = 라이브러리연습.twoSum(a, b);
	
		
		
		System.out.println(result);
		
	}

}
