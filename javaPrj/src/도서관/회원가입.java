package 도서관;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class 회원가입 {
	   public static void main(String[] args) throws IOException {
		   
		  System.out.println("새로운 아이디를 적어주세요\r\n");
		  Scanner sc=new Scanner(System.in);
	      String a = sc.nextLine();
			  
		  BufferedReader br = new BufferedReader(new FileReader("res/library.txt"));
		  while(true) {
	            String line = br.readLine();
	            if (line==null) break;
	            System.out.println(line);
	        }
	        br.close();
	        
		  byte[] b = new byte[1024];
		  FileInputStream input = new FileInputStream("res/library.txt");
		  input.read(b);
		  System.out.println(new String(b));
		  input.close();
		  
		  
	
		  PrintWriter pw = new PrintWriter("res/library.txt");
		  for(int i=1; i<=50; i++) {
	            String data = i+"아이디: ";
	            pw.println(data);
	        }
	      pw.close();
	      
	      PrintWriter pw2 = new PrintWriter(new FileWriter("res/library.txt", true));
	        for(int i=20; i<=50; i++) {
	            String data = i+"아이디: ";
	            pw2.println(data);
	        }
	        pw2.close();
		
		    }
		}

	

