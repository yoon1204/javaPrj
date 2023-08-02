package algoPrj.day12.실습;

public class Ex01_참치김밥 extends Ex01_김밥{

	@Override
	public void 김밥재료() {
		System.out.println("참치김밥재료");
		this.김();
		this.밥();
		this.우엉();
		this.당근();
		this.햄();
		this.단무지();
		this.추가재료();
		System.out.println();
	} 
	
	@Override
	public void 추가재료() {
		System.out.println("돈가스");
	}
	
	
}
