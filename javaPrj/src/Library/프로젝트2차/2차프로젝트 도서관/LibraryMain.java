package 프로젝트2차;

import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {
           
        도서분류배열4 bookList = new 도서분류배열4();
        project_taemin03 hopelist = new project_taemin03();
        
       loop:while (true) {
            System.out.println("1. 도서리스트");
            System.out.println("2. 회원가입");
            System.out.println("3. 로그인");
            System.out.println("4. 책 안읽고 나가기");
        
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    //도서 리스트 구역
                    bookList.aaa();
                    break;
                case 2:
                    //회원가입 구역
                    break;
                case 3:
                    //로그인 구역
                	hopelist.hope();
                    break;
                case 4:
                    System.out.println("책을 안읽고 나갑니다.");
                    System.out.println("책도 안읽고 ㅉㅉ.");
                    break loop;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                    break;
            }
        }
    }
}
