package algoPrj.day10.quiz;

public class 블랙커피2 {
	
	int 물=10000;
	int 원두=1000;
	int 매출금액=0;
	
	public void fillcoffee(){
		this.물+=1000;
		this.원두+=100;	
	}
	
	public void printinfo(){
		System.out.println("블랙커피 정보");
		System.out.println(this.물);
		System.out.println(this.원두);
		System.out.println(this.매출금액);
	}
	
	public String 블랙커피만들기(int 돈){
		if(돈==100) {
			System.out.println("블랙커피만들기");
				this.물=this.물-10;
				this.원두-=10;
				return "블랙커피";
		}
		return "금액이 부족합니다";
	}
	{
		

	}

}
