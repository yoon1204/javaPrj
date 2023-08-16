package algoPrj.day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client00 {

	Socket s;
	
	
	DataInputStream dis;
	DataOutputStream dos;
	
	// 생성자
	public Client00() {
		try {
			s = new Socket("61.73.130.228", 6100);
			System.out.println("server 요청");
			
			// 소켓 두 개의 기반 스트림이 존재
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			
			
			dataSend();
			dataRecv();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	private void dataSend() {
		Scanner sc = new Scanner(System.in);
		/*
		while(true) {
		try {
			System.out.println("메시지를 작성: ");
			String message = sc.nextLine();
			dos.writeUTF(message); // message를 내보내는 것
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		*/
		
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					System.out.println("메시지를 작성: ");
					String message = sc.nextLine();
					try {
						dos.writeUTF(message); // message를 내보내는 것
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
			}});
		t.start();
		
	}

	private void dataRecv() {
		
		/*
		while(true) {
				String message;
				try {
					message = dis.readUTF();
					System.out.println(message);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		*/
		
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				String message;
				while(true) {
					try {
						message = dis.readUTF();
						System.out.println(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}});
		t.start();
		
	}



	public static void main(String[] args) {

		Client00 c = new Client00();
	}

}
