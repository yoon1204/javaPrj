package algoPrj.day11.quiz;

import java.util.Random;

public class 자바라이브러리테스트 {

	public static void main(String[] args) {
		
		int result=Math.abs(-5);
		System.out.println(result);
		
		double result2=Math.random();
		
		System.out.println(result2);
		
		Random r= new Random();
		int result3=r.nextInt(100);
		
		System.out.println(result3);
	}

}
