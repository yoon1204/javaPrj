package algoPrj.day4;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		// 입력 : 임의의 수 : su
		// 출력 : 입력받은 수 중에서 짝수의 합 : even_sum
		// 처리 : 반복제어변수 : i
		
		/*
		 * 처리과정
		 * 1. 반복 (10번 반복)
		 *    수를입력
		 *    짝수인 경우만 누적한다.
		 * 2. 누적합을 출력   
		 * 3. 종료  
		 */
		
		
		Scanner sc=new Scanner(System.in);
		
		int su;
		int even_sum=0; // 초기화
		for(int i=1; i<=10; i++) {
			su=sc.nextInt();
			even_sum+=su;
			if(su%2==0) {
				even_sum+=su;
			}
		}
		
		System.out.println(even_sum);
	}

}
