package algoPrj.day11.quiz;

public class 태민님_박태민_mall {

	public static void main(String[] args) {

		System.out.println("주문번호, 아이디, 날짜, 이름, 품번, 주소");
		
		태민님_박태민_mall_class order = 
				new 태민님_박태민_mall_class(2038914, "tmpark11", 20230801, "박태민", "acorn-123", "서울시 영등포구");

		String result = order.toString();
		System.out.println(result);
	}

}
