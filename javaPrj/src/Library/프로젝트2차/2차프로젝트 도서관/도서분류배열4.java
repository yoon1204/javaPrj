package 프로젝트2차;
import java.util.Scanner;

public class 도서분류배열4 extends bookList{
    public static void aaa( ) {
    	
    	 
        Scanner sc = new Scanner(System.in);
    
        //비교했을때 일치하는 것 조회(카테고리 또는 번호)
        boolean found = false;
      
        while(true){
            System.out.println("찾고싶은 도서의 카테고리 또는 도서번호를 입력하세요(문학, 외국어, 철학, 취미, 미성년) \n이전단계로 돌아가길 원하시면 '이전' 을 입력해주세요");
            String input = sc.nextLine();

        	
		      a: switch (input) {
		            case "문학":
		                System.out.println("시집은 0번, 소설은 1번을 선택하세요");
		                String InputNumber = sc.nextLine();
		                int InputChange = Integer.parseInt(InputNumber);
		
		                if (InputChange == 0 || InputChange == 1) {
		                    for (int i = InputChange*5; i < InputChange*5+5; i++) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");		                        
		                    }
		                    found = true;
		                }
		                break;
		
		            case "외국어":
		                System.out.println("영어는 2번, 일본어는 3번을 선택하세요:");
		                InputNumber = sc.nextLine();
		                InputChange = Integer.parseInt(InputNumber);		
		                if (InputChange == 2 || InputChange == 3) {
		                    for (int i = InputChange*5; i < InputChange*5+5; i++) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");		                        
		                    }
		                    found = true;
		                }
		                break;
		                
		            case "철학":
		                System.out.println("동양(4) 또는 서양(5)을 선택하세요:");
		                InputNumber = sc.nextLine();
		                InputChange = Integer.parseInt(InputNumber);		
		                if (InputChange == 4 || InputChange == 5) {
		                    for (int i = InputChange*5; i < InputChange*5+5; i++) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");		                        
		                    }
		                    found = true;
		                }
		                break;
		                
		            case "취미":
		                System.out.println("음식(6) 또는 스포츠(7)을 선택하세요:");
		                InputNumber = sc.nextLine();
		                InputChange = Integer.parseInt(InputNumber);		
		                if (InputChange == 6 || InputChange == 7) {
		                    for (int i = InputChange*5; i < InputChange*5+5; i++) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");		                        
		                    }
		                    found = true;
		                }
		                break;
		                
		            case "미성년":
		                System.out.println("아동(8) 또는 청소년(9)을 선택하세요:");
		                InputNumber = sc.nextLine();
		                InputChange = Integer.parseInt(InputNumber);		
		                if (InputChange == 8 || InputChange == 9) {
		                    for (int i = InputChange*5; i < InputChange*5+5; i++) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");		                        
		                    }
		                    found = true;
		                }
		                break;
		                
		            case "이전":
		            	System.out.println("이전단계로 돌아갑니다");
		                InputNumber = sc.nextLine();
		                break a;
		
		            default:
		                for (int i = 0; i < booklist.length; i++) {
		                    if (booklist[i][0][0].equalsIgnoreCase(input) || booklist[i][3][0].equals(input)) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");                    
		                        found = true;
		                    }		                    
		                    if (!found) {
		    		            System.out.println("해당 카테고리 또는 도서 번호의 도서를 찾을 수 없습니다.");
		    		            break;
		                }	                
		        	}	        
		        }			        
        }
		       
    }
}





