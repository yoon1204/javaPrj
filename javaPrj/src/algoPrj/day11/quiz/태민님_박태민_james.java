package algoPrj.day11.quiz;

public class 태민님_박태민_james {

	public static void main(String[] args) {
		
		System.out.println("나이 이름 성별 결혼여부 자식수");
		
		태민님_박태민_james_class manInfo = new 태민님_박태민_james_class(20, "james", "male", true, 3);
		String result = manInfo.toString();
		System.out.println(result);
		//
		
		태민님_박태민_james_class a=new 태민님_박태민_james_class(0, result, result, false, 0);
		String result2=manInfo.toString();
		System.out.println(result);
	}

}
