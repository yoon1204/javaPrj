package algoPrj.day4;

import java.util.Scanner;

public class 고객정보 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String id=sc.next();
		String name=sc.next();
		int age=sc.nextInt();
		int height=sc.nextInt();
		
		System.out.println("아이디=" + id);
		System.out.println("이름=" + name);
		System.out.println("나이=" + age);
		System.out.println("키=" + height);
		

	}

}
