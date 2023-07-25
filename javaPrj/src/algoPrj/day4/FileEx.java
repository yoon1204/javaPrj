package algoPrj.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin=new FileInputStream("res/data.txt");
		FileOutputStream fout=new FileOutputStream("res/dataCopy.txt");
		
		int x;
		
		x=fin.read();
		fout.write(x);
		System.out.println(x);
		x=fin.read();
		fout.write(x);
		System.out.println(x);
		x=fin.read();
		fout.write(x);
		System.out.println(x);
		x=fin.read();
		fout.write(x);
		System.out.println(x);
		x=fin.read();
		fout.write(x);
		System.out.println(x);
		x=fin.read();
		fout.write(x);
		System.out.println(x);
		x=fin.read();
		fout.write(x);
		System.out.println(x);
		x=fin.read();
		fout.write(x);
		System.out.println(x);
		x=fin.read();System.out.println(x);
		fout.write(x);
		System.out.println(x);
		x=fin.read();
		fout.write(x);
		System.out.println(x);
		
	}

}
