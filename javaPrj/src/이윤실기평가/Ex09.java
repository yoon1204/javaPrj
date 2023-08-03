package 이윤실기평가;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		double avg;
		double kor_avg, math_avg, eng_avg;
		
		String name;
		int kor, math, eng;
		
		int sum;
		int kor_sum=0, math_sum=0, eng_sum=0;
		
		final int SUBJECT=3;
		final int MAX=5;
		
		Scanner sc=new Scanner(System.in);
		for(int i=1; i<=MAX; i++) {
			name=sc.next();
			kor=sc.nextInt();
			math=sc.nextInt();
			eng=sc.nextInt();
			sum=kor+math+eng;
			avg=(double)sum/SUBJECT;
			
			kor_sum+=kor;
			math_sum+=math;
			eng_sum+=eng;
			
			
			
			
			
		}
		

	}

}
