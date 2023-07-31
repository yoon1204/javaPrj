package algoPrj.day10.quiz;

import java.util.Scanner;

import day10.classType.LeapYear;

public class 재열님_apyeartest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하시오");
		int year = sc.nextInt();

		
		String result = LeapYear.leapYearCheck(year);
		System.out.println(result);

	}

}
