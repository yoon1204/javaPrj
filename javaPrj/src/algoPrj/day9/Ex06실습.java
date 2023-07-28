package algoPrj.day9;

import java.util.Scanner;

public class Ex06실습 {

	public static void main(String[] args) {
		
		String[] program=new String[5];	// 
		
		Scanner sc=new Scanner(System.in);
		int play;
		int index=0;
		loop:while(true) {
			System.out.print("메뉴선택 : 1.등록, 2.조회 5.종료");
			
			String play_=sc.nextLine();
			play=Integer.parseInt(play_);
			
			switch(play) {
			case 1 :
				System.out.println("등록 합니다");
				break;
			case 2:
				System.out.println("조회합니다");
				break;	
			case 5:
				System.out.println( "종료합니다.");
				break loop;				 
			}
			
			
		}

	}

}
