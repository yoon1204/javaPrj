package algoPrj.day6;

public class 합계구하기 {

	public static void main(String[] args) {


		// for문
		int sum= 0 ; //1~10까지 합계를 구할 변수 
		
		for( int i=1; i<=10; i++) {			
			sum = sum + i;
			System.out.println( "sum="+ sum);
		}
		//
		// i =1     i=2       i=3     i=4      i=5       i=6      i=7     i=8      i=9       i=10   i= 11(x)
		// sum =1   sum=3     sum=6   sum=10   sum=15    sum=21   sum=28  sum=36   sum =45   sum=55
		System.out.println( sum);	
		
		 

	}

}
