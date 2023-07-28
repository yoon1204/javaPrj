package 연습;

import java.util.Scanner;

public class 연습1 {

	public static void main(String[] args) {
		
		
		
	//  좋아하는거 저장할 배열만들기
		String[] str = new String[5];

	//  키보드로 부터 입력받을 준비를 한다
		Scanner sc = new Scanner(System.in);
		
	// 메뉴를 보여주기(계속해서 메뉴보여주기)
		while( true) {
			//선택메뉴 보여주기
			System.out.println("메뉴 : 1.등록 2.조회 5.종료");
			String menu_ = sc.nextLine();  // 입력한 내용 한 줄 읽어오기 (문자열로 읽어옴) "1"
			int menu = Integer.parseInt(menu_);   // "1" =>1  
			
			
			if( menu ==1) {
				System.out.println("등록합니다");				
			}else if( menu ==2) {				
				System.out.println("조회합니다");
			}else if( menu ==5) {
				System.out.println("종료합니다");
				break;
			}			
			
			System.out.println("종료");
			
		}		

	}

}
 