package algoPrj.day5;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		int sum=0;
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
		
		
	}

}
