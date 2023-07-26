package day7.함수;

public class Ex07 {

	public static void main(String[] args) {
		
		int result=a(5);
		System.out.println(result);
		
		int result2=b('a');
		System.out.println(result2);
		
		char result3=c(5);
		System.out.println(result3);
		
		double result4=d();
		System.out.println(result4);
		
		String result5=e();
		System.out.println(result5);
		
		int result6=f(1,5);
		System.out.println(result6);
	}
	
	public static int a(int a) {
		System.out.println("a 호출");
		return 3;
	}
	
	public static int b(char a) {
		return 4;
	}
	
	public static char c(int a) {
		 return 'c';
	}
	  
	public static double d(){
	     return 2.5;
	}

	public static String e(){
	   return "안녕" ;
	}
	
	public static int f(int a,int b) {
		int sum=a+b;
		return sum;
	}
	

}
