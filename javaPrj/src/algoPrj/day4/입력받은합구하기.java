package algoPrj.day4;

import java.util.Scanner;

public class 입력받은합구하기 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		for(int i=1; i<=3; i++) {
			int a=sc.nextInt();
			sum=sum+a;
	}
		System.out.println(sum);
	}
}
