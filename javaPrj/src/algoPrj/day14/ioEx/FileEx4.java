package algoPrj.day14.ioEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx4 {

	public static void main(String[] args) {
	 
		
		try {
			BufferedReader bf = new BufferedReader( new FileReader("res/acorn.txt"));
			String data = bf.readLine();
			System.out.println( data);
		
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

		
	}

}
