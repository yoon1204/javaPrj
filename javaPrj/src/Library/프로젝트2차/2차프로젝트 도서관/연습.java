package 프로젝트2차;

import java.util.Scanner;

public class 연습 {
	
	    public static void main(String[] args) {
	    	 String[][][] booklist = {
	    	  {{"새들이 울었던 자리가 있다"}, {"주희"}, {"해움"}, {"000"}},
	          {{"마음이 살짝 기운다"}, {"나태주"}, {"알에이치케이"}, {"001"}},
	          {{"아버지도 나를 슬퍼했다"}, {"김지훈"}, {"꿈공장"}, {"002"}},
	          {{"하늘과 바람과 별과 시"}, {"윤동주"}, {"오늘부터출판사"}, {"003"}},
	          {{"꽃을 보듯 너를 본다"}, {"나태주"}, {"지혜"}, {"004"}},};
	          
	    	 Scanner sc = new Scanner(System.in);
	    	    
	         //비교했을때 일치하는 것 조회(카테고리 또는 번호)
	         boolean found = false;

	       
	         loop : while(true){
	             System.out.println("찾으려는 도서의 카테고리 또는 도서 번호를 입력하세요(1.문학, 2.외국어, 3.철학, 4.취미, 5.미성년 또는 도서 번호):");
	             String input = sc.nextLine();

	         	
	 		      switch (input) {
	 		            case "문학":
	 		                System.out.println("시집(0) 또는 소설(1)을 선택하세요:");
	 		                String InputNumber = sc.nextLine();
	 		                int InputChange = Integer.parseInt(InputNumber);
	 		
	 		                if (InputChange == 0 || InputChange == 1) {
	 		                    for (int i = InputChange*5; i < InputChange*5+5; i++) {
	 		                        System.out.println("도 서 명 : " + booklist[i][0][0]);
	 		                        System.out.println("저   자 : " + booklist[i][1][0]);
	 		                        System.out.println("출 판 사 : " + booklist[i][2][0]);
	 		                        System.out.println("도서 번호 : " + booklist[i][3][0] + "\n");
	 		                    }
	 		                    found = true;
	 		                }
	 		                break ;
	    	 }
	         }
	         }
	    
}