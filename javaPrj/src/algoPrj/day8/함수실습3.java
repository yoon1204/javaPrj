package algoPrj.day8;

public class 함수실습3 {

	public static void main(String[] args) {
		
		 // 원하는 별을 출력하는 함수 만들기

		/*1.for(int i=1; i<=5; i++) {		//*****
				for(int j=1; j<=5; j++) {	//*****
					System.out.print("*");	//*****
			}								//*****
			System.out.println();			//*****
		}*/
		
		/*2.for(int i=1; i<=5; i++) {		//*
				for(int j=1; j<=i; j++) {	//**
					System.out.print("*");	//***
			}								//****	
			System.out.println();			//*****
		}*/
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
				
		/*for(int i=1;i<=5; i++) {
			for(int j=1; i<=5; i++){
				System.out.print("*");
			}
			System.out.println(); 		//*****
		}*/
		
		/*for(int i=2;i<=5; i++) {		//*****
			for(int j=1; j<=5; j++) {	//*****
				System.out.print("*");	//*****											
			}							//*****
			System.out.println();
		}*/
		
		/*for(int i=3;i<=5; i++) {		//*****
		for(int j=1; j<=5; j++) {		//*****
			System.out.print("*");		//*****											
			}							
		System.out.println();
		}*/
		
		/*for(int i=4;i<=5; i++) {		//*****
		for(int j=1; j<=5; j++) {		//*****
			System.out.print("*");													
			}							
		System.out.println();
		}*/
		
		/*for(int i=5;i<=5; i++) {		//*****
		for(int j=1; j<=5; j++) {		
			System.out.print("*");													
			}							
		System.out.println();
		}*/
		
		/*for(int i=1; i<=5; i++) {		//****
			for(int j=2; j<=5; j++) {	//****
				System.out.print("*");	//****
			}							//****
			System.out.println();		//****
		}*/
		
		/*for(int i=1; i<=5; i++) {		//***
			for(int j=3; j<=5; j++) {	//***
				System.out.print("*");	//***
			}							//***
			System.out.println();		//***
		}*/
		
		/*for(int i=1; i<=5; i++) {		//**
			for(int j=4; j<=5; j++) {	//**
				System.out.print("*");	//**
			}							//**
			System.out.println();		//**
		}*/
		
		/*for(int i=1; i<=5; i++) {		//*
			for(int j=5; j<=5; j++) {	//*
				System.out.print("*");	//*
			}							//*
			System.out.println();		//*
		}*/
		
		
		
		
}

}
