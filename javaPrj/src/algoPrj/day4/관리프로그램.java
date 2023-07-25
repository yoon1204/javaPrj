package algoPrj.day4;

import java.util.Scanner;

public class 관리프로그램 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int program;
		System.out.println("1.등록, 2.조회, 3.변경, 4.삭제");
		
		while(true) {
			program=sc.nextInt();
			switch(program) {
				case 1:
					System.out.println("등록");
					break;
				case 2:
					System.out.println("조회");
					break;
				case 3:
					System.out.println("변경");
					break;
				case 4:
					System.out.println("삭제");
					break;
				default:
					System.out.println("잘못된 선택");
					break;
			}
			
		}

	}

}
