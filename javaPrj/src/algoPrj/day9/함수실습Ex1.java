package algoPrj.day9;

import java.util.Scanner;

public class 함수실습Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] favorite = new String[5];
		int fav_cnt = 0;

		System.out.println("메뉴 : 1.등록, 2.조회, 3.종료");

		loop: while (true) {
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("등록할 일정을 입력하세요.");
				favorite[fav_cnt] = sc.next();
				fav_cnt++;
				break;
			case 2:
				System.out.println("조회합니다.");
				for (int i = 0; i < fav_cnt; i++) {
					System.out.println(i+1 + "." + favorite[i]);
				}
				break;
			case 3:
				System.out.println("종료합니다.");
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;

			}
		}

	}

}
