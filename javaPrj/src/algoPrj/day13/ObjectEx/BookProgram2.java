package algoPrj.day13.ObjectEx;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class BookProgram2 {
	ArrayList<Book>  books ;
	ArrayList<Lend> lendList;
    Scanner  sc = new Scanner(System.in); 
	
    
    
    BookProgram2(){    	
    	books = new ArrayList<>();
    	lendList = new ArrayList<>();
    	loadBookInfo();
    }
    
    	
	private void loadBookInfo() {
		
		books.add( new Book("b001" ,"����ִ� å" , "��ȣ��"));
		books.add( new Book("b002" ,"�ų���  å" , "��ҿ�"));
		books.add( new Book("b003" ,"����ִ� å" , "ȫ����"));
		books.add( new Book("b004" ,"����ִ� å" , "������"));
		books.add( new Book("b005" ,"����ִ� å" , "����ȣ"));
		books.add( new Book("b006" ,"����ִ� å" , "�ӿ���"));
	}	
	
	
	private void run() {
		loop1 :while( true) {
					
					System.out.println("1.�뿩  2. ��ȸ   3.�ݳ�   4. ����");
					int menu = sc.nextInt();			
					switch( menu) {			
					case 1:						
					    lend();   
						break;
					case 2:
						searchAll();
						break;
					case 3:					
						returnBook();						
						break;
					case 4:
						System.out.println(" ����");
						break loop1;
					default:
						
					}
		}
	}
	
	
	
	private void searchAll() {		
		for(int i=0; i< lendList.size() ; i++) {
			System.out.println( lendList.get(i));
		}		
	}
	
	private void lend() {
		System.out.println();
		System.out.println("�뿩�ڵ��Է�");
		String lendId= sc.next(); 
		
		
		System.out.print("�����ڵ��Է�");
		String bookId = sc.next();
		
	 
		boolean flag=false;
		// å �뿩���ɿ��� , å���� ��
		Book book=null;
		for(int i=0 ; i< books.size(); i++) {
			 book = books.get(i);
			if(book.getBookId().equals(bookId) && book.getState() ==1  ) {		
				book.setState(0);  // �뿩�Ұ��� ���·� ���� 				 
				flag=true; 
				break;
			}					
		}				
		
		
		if(flag) {
			String lendDate = getLendDate();			
			String returnDate = getReturnDate();		
			Lend lend = new Lend(  lendId, lendDate, returnDate,  book );
			lendList.add(lend);
			System.out.println( lend);
			System.out.println( "�뿩�Ǿ����ϴ�");
			
		}else {
			System.out.println("�뿩�Ұ���" );
		}		
	}
	
	
	
	private void  returnBook() {
		System.out.println("�ݳ��� �뿩��ȣ�� �Է��ϼ���");
		String idLend = sc.next();
		//�����ΰ��
		
		//�뿩����  ����ϱ�
		for( int i=0 ; i< lendList.size() ; i++) {
			Lend lend = lendList.get(i);
			if(  lend.lendId.equals( idLend)) {
				lend.setReturnFlag(true);
				lend.book.setState(1);
				System.out.println("�ݳ��Ǿ����ϴ�");
				System.out.println("�ݳ�����" +  lend);
				break;
			}
		}
	}
	
	
	
	private String getReturnDate( ) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat  sf = new SimpleDateFormat("yyyy-MM-dd");	
		// 14����  , �� ���� + 14 		
		cal.add(Calendar.DATE, 14);
		String returnDate =sf.format(cal.getTime());		
		return   returnDate;
		
	}
	
	private String getLendDate() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat  sf = new SimpleDateFormat("yyyy-MM-dd");	
		//�������� ������ ��������		 
		String lendDate =sf.format(cal.getTime());		
		return   lendDate;
		
	}
		
	public static void main(String[] args) { 	 
			 new BookProgram2().run();			 
			 
			 // BookProgram2  program = new BookProgram2();
			 // program.run();
	} 
		
	 

	 

}
