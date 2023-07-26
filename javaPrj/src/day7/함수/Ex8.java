package day7.함수;

public class Ex8 {

	public static void main(String[] args) {
		
		
		int result6=f(1,5);
		System.out.println(result6);
		
		result6=f(2,7);
		System.out.println(result6);
		
		result6=f(5,10);
		System.out.println(result6);
		
	}
	
	public static int f(int a,int b) {
		int sum=a+b;
		return sum;
	}
	

}
