package 도서관;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import algoPrj.day14.ioEx.Score;

public class Library회원등록 {

	public static void main(String[] args) {
		

		ArrayList<Customer> list = new ArrayList<>();
		
//		list.add(new Customer("abc"));
//		list.add(new Customer("def","010-7890-7890","def@naver.com"));
//		list.add(new Customer("ghi","010-4321-4321","ghi@daum.com"));
		
	 
		
		for( Customer lib  : list ) {
			System.out.println( lib);
			
		}
		
		
	}

}


	
