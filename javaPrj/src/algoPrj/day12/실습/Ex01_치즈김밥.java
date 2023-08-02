package algoPrj.day12.실습;

public class Ex01_치즈김밥 extends Ex01_김밥{

	public void 김밥재료() {
		System.out.println("치즈김밥재료");
		this.밥();
		this.김();
		this.햄();
		this.추가재료();
		System.out.println();
	}
	
	public void 추가재료() {
		System.out.println("치즈");
		System.out.println("시금치");
		System.out.println("소금");
		System.out.println("참기름");
	}
		

	

}
