package algoPrj.day14.ioEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx6 {

	public static void main(String[] args) {
		
		try {
			//기반스트림 얻어오기
			//파일
			FileWriter w=new FileWriter("res/output.txt");
			w.write("안녕하세요");
			w.flush();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
