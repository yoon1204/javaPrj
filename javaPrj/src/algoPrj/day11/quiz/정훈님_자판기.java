package algoPrj.day11.quiz;;

public class 정훈님_자판기 {
	int 콜라=1000;
	int 사이다=1000;
	int 물=700;
	int 커피=800;
	int 이온음료=1100;
	
	public void priceIncrease(int 콜라,int 사이다 ,int 물,int 커피,int 이온음료) {
		this.콜라 +=콜라;
		this.사이다 +=사이다;
		this.물 +=물;
		this.커피 +=커피;
		this.이온음료 +=이온음료;
	}
	public void priceReduction(int 콜라,int 사이다 ,int 물,int 커피,int 이온음료) {
		this.콜라 -=콜라;
		this.사이다 -=사이다;
		this.물 -=물;
		this.커피 -=커피;
		this.이온음료 -=이온음료;
	}
	public void buy(int money) {
		콜라buy(money);
		사이다buy(money);
		물buy(money);
		커피buy(money);
		이온음료buy(money);
	}
	
	
	public void 콜라buy(int m) {
		if(this.콜라 <= m) {
			System.out.println("콜라 구매가능 ");
		}else{
			System.out.println("콜라 구매불가능 ");
		}
	}
	public void 사이다buy(int m) {
		if(this.사이다 <= m) {
			System.out.println("사이다 구매가능 ");
		}else{
			System.out.println("사이다 구매불가능 ");
		}
	}
	public void 물buy(int m) {
		if(this.물 <= m) {
			System.out.println("물 구매가능 ");
		}else{
			System.out.println("물 구매불가능 ");
		}
	}
	public void 커피buy(int m) {
		if(this.커피 <= m) {
			System.out.println("커피 구매가능 ");
		}else{
			System.out.println("커피 구매불가능 ");
		}
	}
	public void 이온음료buy(int m) {
		if(this.이온음료 <= m) {
			System.out.println("이온음료 구매가능 ");
		}else{
			System.out.println("이온음료 구매불가능 ");
		}
	}
}
