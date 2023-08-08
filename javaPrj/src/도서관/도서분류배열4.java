package 도서관;
import java.util.Scanner;

public class 도서분류배열4 {
    public static void main(String[] args) {
    	 String[][][] booklist = {
    	  {{"새들이 울었던 자리가 있다"}, {"주희"}, {"해움"}, {"000"}},
          {{"마음이 살짝 기운다"}, {"나태주"}, {"알에이치케이"}, {"001"}},
          {{"아버지도 나를 슬퍼했다"}, {"김지훈"}, {"꿈공장"}, {"002"}},
          {{"하늘과 바람과 별과 시"}, {"윤동주"}, {"오늘부터출판사"}, {"003"}},
          {{"꽃을 보듯 너를 본다"}, {"나태주"}, {"지혜"}, {"004"}},
          // 소설
          {{"하얼빈"}, {"김훈"}, {"문학동네"}, {"010"}},
          {{"모순"}, {"양귀자"}, {"쓰다"}, {"011"}},
          {{"유리알유희"}, {"헤르만헤세"}, {"민음사"}, {"012"}},
          {{"아버지의 해방일지"}, {"정지아"}, {"창비"}, {"013"}},
          {{"파친코"}, {"이민진"}, {"인플루엔셜"}, {"014"}},
//외국어      // 영어
          {{"Who Moved My Cheese?"}, {"Dr.Spencer Johnson"}, {"Vermilion"}, {"015"}},
          {{"Tuesdays with Morrie"}, {"Mitch Albom"}, {"Bantam Books"}, {"016"}},
          {{"Matilda"}, {"Roald Dahi"}, {"Puffin Books"}, {"017"}},
          {{"Wonder"}, {"R.J.Palacio"}, {"Corgi Books"}, {"018"}},
          {{"Flipped"}, {"Wendelin Van Draanen"}, {"Ember "}, {"019"}},
          //일본어
          {{"일본어 무작정 따라하기"}, {"후지이아사리"}, {"길벗"}, {"020"}},
          {{"한권으로 끝내기"}, {"이치우"}, {"다락원"}, {"021"}},
          {{"굿모닝 독학 일본어 첫걸음"}, {"정선영"}, {"동양books"}, {"022"}},
          {{"민나노 독학 일본어 공부"}, {"조수진,장성숙,임성훈"}, {"시사일본어사"}, {"023"}},
          {{"일본어 어휘의 달인이 되는법"}, {"강성광"}, {"사람in"}, {"024"}},
//철학	  //동양
          {{"논어"}, {"공자"}, {"서울대학교출판문화원"}, {"025"}},
          {{"맹자"}, {"맹자"}, {"서울대학교출판문화원"}, {"026"}},
          {{"순자"}, {"순자"}, {"을유문화사"}, {"027"}},
          {{"대학, 중용"}, {"주희"}, {"홍익출판사"}, {"028"}},
          {{"도덕경"}, {"노자"}, {"현암사"}, {"029"}},
          //서양
          {{"철학의 역사"}, {"나이절워버턴"}, {"소소의책"}, {"030"}},
          {{"짧고 깊은 철학 50"}, {"톰 버틀러 보던"}, {"흐름출판"}, {"031"}},
          {{"너 자신을 알라"}, {"리하르트 다비트 프레히트"}, {"열린책들"}, {"032"}},
          {{"러셀 서양 철학사"}, {"버트런드 러셀"}, {"을유문화사"}, {"033"}},
          {{"소피의 세계"}, {"요슈타인 가아더"}, {"현암"}, {"034"}},
//취미	  //음식
          {{"홈메이드 천연효모로 빵 만들기"}, {"데라모토 고로/야스코"}, {"도림북스"}, {"035"}},
          {{"살 만한 것 같다가도 아닌 것 같은"}, {"삼각커피"}, {"상상출판"}, {"036"}},
          {{"위대한 중서부의 부엌들"}, {"J.라이언 스트라돌"}, {"열린책들"}, {"037"}},
          {{"바베트의 만찬"}, {"노에미비야무사"}, {"문학동네"}, {"038"}},
          {{"Food Anatomy/음식해부도감"}, {"줄리아 로스먼"}, {"더숲"}, {"039"}},
          //스포츠
          {{"철학의 역사"}, {"나이절워버턴"}, {"소소의책"}, {"040"}},
          {{"짧고 깊은 철학 50"}, {"톰 버틀러 보던"}, {"흐름출판"}, {"041"}},
          {{"너 자신을 알라"}, {"리하르트 다비트 프레히트"}, {"열린책들"}, {"042"}},
          {{"러셀 서양 철학사"}, {"버트런드 러셀"}, {"을유문화사"}, {"043"}},
          {{"소피의 세계"}, {"요슈타인 가아더"}, {"현암"}, {"044"}},
// 미성년    //아동
          {{"야옹이 수영 교실"},{"신현경"},{"북스그라운드"}, {"045"}},
          {{"긴긴밤"},{"루리"},{"문학동네"}, {"046"}},
          {{"하하 자매 떡집"},{"김리리"},{"비룡소"}, {"047"}},
          {{"5번 레인"},{"은소홀"},{"문학동네"}, {"048"}},
          {{"기소영의 친구들"}, {"정은주"}, {"사계절"}, {"049"}},
          //청소년
          {{"나는 거꾸로 된 나무입니다"},{"배진시"},{"책과나무"}, {"050"}},
          {{"소여동의 빛"},{"최이랑"},{"책담"}, {"051"}},
          {{"은유법"},{"복일경"},{"세종마루"}, {"052"}},
          {{"라인"},{"기특"},{"숨쉬는책공장"}, {"053"}},
          {{"소년이 있었다"},{"윤혜숙"},{"서해문집"}, {"054"}},
      };
    	 
        Scanner sc = new Scanner(System.in);
    
        //비교했을때 일치하는 것 조회(카테고리 또는 번호)
        boolean found = false;
      
        loop : while(true){
            System.out.println("찾고싶은 도서의 카테고리 또는 도서번호를 입력하세요(문학,외국어,철학,취미,미성년 또는 도서번호)\n이전단계로 돌아가길 원하시면 '이전' 을 입력해주세요");
            String input = sc.nextLine();

        	
		      switch (input) {
		            case "문학":
		                System.out.println("시집은 0번, \n 소설은 1번을 선택하세요");
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
		                break;
		
		            case "외국어":
		                System.out.println("영어(2) 또는 일본어(3)을 선택하세요:");
		                InputNumber = sc.nextLine();
		                InputChange = Integer.parseInt(InputNumber);
		
		                if (InputChange == 2 || InputChange == 3) {
		                    for (int i = InputChange*5; i < InputChange*5+5; i++) {
		                        System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0]);
		                        System.out.println("도서 번호 : " + booklist[i][3][0] + "\n");
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
		                        System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0]);
		                        System.out.println("도서 번호 : " + booklist[i][3][0] + "\n");
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
		                        System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0]);
		                        System.out.println("도서 번호 : " + booklist[i][3][0] + "\n");
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
		                        System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0]);
		                        System.out.println("도서 번호 : " + booklist[i][3][0] + "\n");
		                    }
		                    found = true;
		                }
		                break;
		                
		            case "이전":
		            	System.out.println("이전단계로 돌아갑니다");
		                InputNumber = sc.nextLine();
		                break loop;
		
		            default:
		                for (int i = 0; i < booklist.length; i++) {
		                    if (booklist[i][0][0].equalsIgnoreCase(input) || booklist[i][3][0].equals(input)) {
		                        System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0]);
		                        System.out.println("도서 번호 : " + booklist[i][3][0] + "\n");
		
		                        found = true;
		                    }
		                    
		                    if (!found) {
		    		            System.out.println("해당 카테고리 또는 도서 번호의 도서를 찾을 수 없습니다.");
		    		            break;
		                }	                
		        	}	        
		        }			        
        }
		        sc.close();
    }
}





