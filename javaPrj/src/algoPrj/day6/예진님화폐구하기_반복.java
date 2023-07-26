package algoPrj.day6;

import java.util.Scanner;

public class 예진님화폐구하기_반복 {

	public static void main(String[] args) {

	System.out.println("출장비 입력");
		
	Scanner sc = new Scanner(System.in);
	
	//  오만원화폐매수
	//  만원화폐매수
	//  오천원매수
	//  천원
	//  오백원
	//  백원
	// 오십원
	// 십원
	
	//int money = sc.nextInt();	
		int money=312510; 
		 // 오만원권 구하기
	
	int[] moneys=new int[8];	// 고액권부터 화폐매수 저장
	int[] unit= {50000,10000,5000,1000,500,100,50,10};
	// 화폐매수
	// 0  1   2   3  4   5   6   7 => 배열의 index(첨자)
	// 6  1   0   0  0   0   0   0 => moneys
	
	// 오만 만 오천원 천원 오백원 백원 오십원 십원 => unit
	
	for(int i=0; i<8; i++) {	// i=>0
		int money2=money/unit[i];	// unit[i]=>50000	// moneys[i]=>6
		money=money-(unit[i]*money2);	// money=> 312510-(50000*6)
			  // 312510-(50000*6)
	}
	
	
	// i=>1
	// moneys[i]=>12510/10000
	// money=>12510-(10000*1)
	// money=>2510
	
	// i=>2
	// moneys[i]=>2510/5000=>0
	// money=>2510-(5000*0)=>2510
	
	
	// i=>3
	// moneys[i]=>2510/1000=>2
	// money=>2510-(1000*2)=>510
	
	
	// i=>4
	// money[i]=>510/500=>1
	// money=>510-(500*1)=>10
	
	// i=>5
	// money[i]=>10/100=>0
	// money=> 10-(100*0)=>10
	
	
	// i=>6
	// money[i]=>10/50=>0
	// money=>10-(50*0)=>10
	
	
	// i=>7
	// money[i]=>10/10=>1
	// money=>10-(10*1)=>0
	
	// i=>8
	
	
	for(int i=0; i<moneys.length; i++) {
		System.out.print(moneys[i]+" ");
	}
	
	/*
	int money1 = money/50000;   // ( / ) 정수 / 정수   => 정수  10/3 =>3
	money=money-(50000*money1);
 
	
 
	int money2 = money/10000;
	money= money-(10000*money2);
	 
	
 
	int money3 = money/5000;
	money= money-(5000*money3);
	
	//money=2510
	int money4 = money/1000;    
	money=money-(1000*money4);
	
	 
	 
	int money5 = money/500;    
	money=money-(500*money5);   
 
	
	int money6 = money/100;  
	money=money-(100*money6);
 
	
	int money7 = money/50;  
	money=money-(50*money7);  
	 
	 
	int money8 = money/10;  
	money=money-(10*money8);  
	
	
	System.out.println("50000=>"+money1+" 10000=>"+money2+" 5000=>"+money3+" 1000=>"+money4+" 500=>"+money5+" 100=>"+money6+" 50=>"+money7+" 10=>"+money8);
	
	*/	

	}

}
