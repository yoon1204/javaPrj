package 도서관;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

class Member {
    String name; // 이름
    String contact; // 연락처
    String email; // 이메일
    String username; // 아이디
    String password; // 비밀번호

    public Member(String name, String contact, String email, String username, String password) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "이름: " + name + "\n연락처: " + contact + "\n이메일: " + email + "\n아이디: " + username;
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Member> List = new ArrayList<>();
        
        

        while (true) {
            System.out.println("도서관 회원 관리");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 목록");
            System.out.println("3. 회원 조회");
            System.out.println("4. 종료");
            System.out.print("원하는 기능을 선택해주세요: ");

            int choice = sc.nextInt();
            

            switch (choice) {
            
            	// 회원 등록
                case 1:

                    System.out.print("이름을 입력하세요: ");
                    String name = sc.nextLine();

                    System.out.print("연락처를 입력하세요: ");
                    String contact = sc.nextLine();

                    System.out.print("이메일을 입력하세요: ");
                    String email = sc.nextLine();
                    
                    System.out.print("아이디를 입력하세요: ");
                    String username = sc.nextLine();
                    
                    System.out.print("비밀번호를 입력하세요: ");
                    String password = sc.nextLine();

                    Member newMember = new Member(name, contact, email, username, password);
                    List.add(newMember);

                    System.out.println("회원 등록이 완료되었습니다.");
                    break;
                    
                // 등록된 회원 목록 출력
                case 2:

                    if (List.isEmpty()) {
                        System.out.println("등록된 회원이 없습니다.");
                    } else {
                        System.out.println("등록된 회원 목록:");

                        for (Member member : List) {

                            System.out.println(member);

                            System.out.println("--------------------");

                        }

                    }

                    break;
                
                // 조회할 회원의 아이디 입력
                case 3:
                	
                    System.out.print("조회할 회원의 아이디를 입력하세요: ");
                    String id = sc.nextLine();
                    boolean inquiryMember = false;
                    
                    for (Member member : List) {
                        if (member.username.equals(id)) {
                            System.out.println("조회 결과:");
                            System.out.println(member);
                            inquiryMember = true;
                            break;
                        }
                    }
                    if (!inquiryMember) {
                        System.out.println("등록된 회원 정보가 없습니다.");
                    }
                    break;

                // 회원 조회 종료
                case 4:

                    System.out.println("회원 조회를 종료합니다.");
                    sc.close();
                    System.exit(0);

                default:
                	
                    System.out.println("다시 선택해주세요.");

                    try {
            			
           FileInputStream fis=new FileInputStream("res/text.txt");
            			
           while(true) {
           int su;
           su=fis.read();
           if(su==-1)break;
           System.out.print((char)su);
           }
            			
            			
           } catch (FileNotFoundException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
           } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
           }
            		
                    
           }

        }

    }

}