package algoPrj.day13.StringEx;

public class Ex03 {

	public static void main(String[] args) {
		
		
		
		// 문자열 변경해야 하는 경우
		// 
		StringBuilder s=new StringBuilder("SHINee");
		s.setCharAt(1, 'H');			
		System.out.println(s);
		s.append("world");		
		System.out.println(s);
		
		

	}

}
