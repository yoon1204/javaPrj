package day7.함수;

public class Ex9 {

	public static void main(String[] args) {
		
		
		System.out.println(sum(2,5));
		
		
	}
	
	public static int sum(int a,int b) {
		int sum=0;
		for(int i=a; i<=b; i++) {
			sum=sum+i;	
		}
		return sum;
		
	}
	

}
