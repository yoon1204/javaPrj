package algoPrj.day13.ObjectEx;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


/*
 * 
 * 1. �뿩�� ���� å���� ����
 * 2. �ݺ� (�޴��� ���ᰡ �ƴ� ����)
 *     - �޴�����
 *     - �뿩
 *        - �뿩��ȣ, ������ȣ�Է�
 *        - ������ �뿩���ɻ������� �Ǵ�
 *          - ���� �뿩����
 *             :�������� �뿩������ ����
 *             :�ݳ�����, �뿩���ڻ���
 *             :�뿩����Ʈ�� �߰� 
 *          - ���� �뿩 �Ұ���
 *            : �����Ұ��� �޽���       
 *     - �ݳ�
 *        -�뿩��ȣ �Է�
 *        -�ݳ����º���
 *        -������ ���¸� �뿩�������� ����
 *     - ��ȸ
 *       - �뿩����Ʈ ��ü ��ȸ * 
 * 
 */
public class BookProgram {
	  

	public static void main(String[] args) { 	 
		
		//å���� ����		
		ArrayList<Book>  books = new ArrayList<>(); 		
		Scanner sc = new Scanner(System.in);
		
		books.add( new Book("b001" ,"����ִ� å" , "��ȣ��"));
		books.add( new Book("b002" ,"����ִ� å" , "��ҿ�"));
		books.add( new Book("b003" ,"����ִ� å" , "ȫ����"));
		books.add( new Book("b004" ,"����ִ� å" , "������"));
		books.add( new Book("b005" ,"����ִ� å" , "����ȣ"));
		books.add( new Book("b006" ,"����ִ� å" , "�ӿ���"));
	 			
		// �뿩����  (�޴�����) 		
		ArrayList<Lend> lendList = new ArrayList<>();
		
		loop1 :while( true) {
			
			System.out.println("1.�뿩  2. ��ȸ   3.�ݳ�   4. ����");
			int menu = sc.nextInt();			
			switch( menu) {			
			case 1:
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
						book.setState(0);  // �뿩��					 
						flag=true; 
						break;  // �����߰��ϸ� �ݺ��� ����
					}					
				}				
				
				if(flag) {
					
					//�뿩��, �ݳ��� ���ϱ�
					Calendar cal = Calendar.getInstance();
					SimpleDateFormat  sf = new SimpleDateFormat("yyyy-MM-dd");		
					 
					String lendDate =sf.format(cal.getTime());
					// 14���� 2�� �� , �� ����
					cal.add(Calendar.DATE ,14);		 
					String returnDate =sf.format(cal.getTime());
					
					
					Lend lend = new Lend(  lendId, lendDate, returnDate,  book );
					lendList.add(lend);
					System.out.println( lend);
					System.out.println( "�뿩�Ǿ����ϴ�");
					
				}else {
					System.out.println("�뿩�Ұ���" );
				}			
			        
				break;
			case 2:
				
				for(int i=0; i< lendList.size() ; i++) {
					System.out.println( lendList.get(i));
				}				
				break;
			case 3:
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
				
				
				break;
			case 4:
				System.out.println(" ����");
				break loop1;
			default:
				
			}
			
		} 
		
	}

	 

}
