package 도서관;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class 회원가입4 {
	   public static void main(String[] args) throws IOException{
		   
		  System.out.println("새로운 아이디를 적어주세요\r\n");
		  Scanner sc=new Scanner(System.in);
	      String  id = sc.nextLine();
			  
	      String filePath = "res/aaa.txt";
	      String content = id;
	      
	      Library2 search = new Library2();
	      
	      
	     
	        try {           
	            FileWriter fileWriter = new FileWriter(filePath, true);
	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	           
	           // bufferedWriter.write(content);
	           // bufferedWriter.newLine();
	            
	            
	            
	            if(!search.joinId(content)) {  // 
	          
			            bufferedWriter.close();
			            fileWriter.close();
	            }
           
	            System.out.println("회원가입 되었습니다.");
	          } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}