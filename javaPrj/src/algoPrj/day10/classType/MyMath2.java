package algoPrj.day10.classType;

public class MyMath2 {

	public static int add(int b, int c){
		return(b+c);
	}
	
	public static int abs(int e) {
		int result=0;
		if(e>0) {
			result=e;
		}else if(e<0) {
			result=-e;		
		}
		return result;
	}
}
