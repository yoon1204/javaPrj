package algoPrj.day5;

public class Array3Ex3 {

	public static void main(String[] args) {

                           
		int[][] even= {
				{2,4,6},
				{8,10,12},
				{14,16,18}
		} ; 		                           
	  
		
		int[][] odd = {
				 {1,3,5},
				 {7,9,11},
				 {13,15,17}
		 };   
		 
		 
		//면 행 열 
		int[][][] numbers = {
			
				 {
						{2,4,6},
						{8,10,12},
						{14,16,18}
				 } ,
				 
				 {
						 {1,3,5},
						 {7,9,11},
						 {13,15,17}
				 }
				 
		 };
		 
		  //  10  ,   15 출력
		 
		 System.out.println(numbers[0][1][1]);
		 System.out.println(numbers[1][2][1]);
		 
		 String[][][]color= {
				 {
	
			{"빨강색","주황색","노랑색"},
			{"초록색","파랑색","검정색"},
			{"보라색","청록색","분홍색"}
		},
		 
				 {
			{"흰색","연두색","회색"},
			{"갈색","자주색","황토색"},
			{"살구색","멜론색","민트색"}
		}
	};
		 System.out.println(color[0][1][2]);
		 System.out.println(color[1][0][0]);
				 
		 
		 
		 
		 
		 
		

	}

}
