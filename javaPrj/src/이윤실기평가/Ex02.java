package 이윤실기평가;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int su;
		Scanner sc=new Scanner(System.in);
		su=sc.nextInt();
		
		getTotal(su);
		int result  =getTotal2(5);
		
		System.out.println( result + 5 );
		
		
		String str="l like";
		char result2  =str.charAt(0);
		
		System.out.println( result2);
		

	}

	public static void getTotal(int su) {
		int sum=0;
		for(int i=1;i<=su;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}
	
	
	public static int getTotal2(int su) {              // su=5
		int sum=0;
		for(int i=1;i<=su;i++) {   // i = 1    2   3   4   5
			sum+=i;                // sum  =1  3   6   10  15
		}
	
		 return sum;
	}

}
