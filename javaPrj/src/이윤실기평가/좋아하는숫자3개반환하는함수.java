package 이윤실기평가;

import java.util.Scanner;

public class 좋아하는숫자3개반환하는함수 {

	public static void main(String[] args) {
		
		/*Scanner sc=new Scanner(System.in);
		
		int[] a=new int[3];		
		
		a[0]=9;
		a[1]=11;
		a[2]=2;
		
		출력(a);*/
		
		int result2= 좋아하는숫자구하기();	
		int[] result3 = 좋아하는숫자구하기2();	
		
		System.out.println( result3[0]);
		System.out.println( result3[1]);
		System.out.println( result3[2]);	
	}

	private static int[] 좋아하는숫자구하기2() {
		// TODO Auto-generated method stub
		
		int[] arr= new int[3];
		arr[0]=5;
		arr[1]=9;
		arr[2]=10;
		
		return arr;		
	}

	private static int 좋아하는숫자구하기() {
		// TODO Auto-generated method stub	
		return 1;		
	}
	
	public static void 출력(int[] a) {
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}	
	
	 
}

