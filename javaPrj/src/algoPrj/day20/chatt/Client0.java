package algoPrj.day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client0 {

	Socket s;
	
	DataInputStream dis;
	DataOutputStream dos;
	
	// 생성자
	public Client0() {
		try {
			s = new Socket("localHost", 5500);
			System.out.println("서버에 요청");
			
			
			// 보내기
			dataSend();
			
			// 받기
			dataRecv();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	private void dataRecv() {
		
	}



	private void dataSend() {
		
	}



	public static void main(String[] args) {

		Client0 c = new Client0();
	}

}
