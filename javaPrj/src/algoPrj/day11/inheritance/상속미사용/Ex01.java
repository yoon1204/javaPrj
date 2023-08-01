package algoPrj.day11.inheritance.상속미사용;

public class Ex01 {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.쥐를잡는다();
		c.먹는다();
		
		Animal a = c; // 가능하다.   업캐스팅 (  가능하다 , 자동형변환 )		
		//  animal 다르면 해석정보 축소 (부모형으로 ) 쥐를잡는다는 기능 안보인다.
		
		
		
 		Cat c2 = (Cat)a; // 가능하다. 다운캐스팅  왜 가능하냐면 원래 실체가 Cat이니까 
 		                 // 명시적형변환을 해야 함 
 		
 		c2.쥐를잡는다();
 		
		
	}

}
