package algoPrj.day14.ioEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileEx8 {

	public static void main(String[] args) {
		 
	 
			try {
				ObjectInputStream oi=new ObjectInputStream(new FileInputStream("res/output2.txt"));
				
				Score s=(Score)oi.readObject();
				System.out.println( s);
				
				
				s=(Score)oi.readObject();
				System.out.println( s);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
