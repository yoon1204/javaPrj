package algoPrj.day11.inheritance.실습;

public class Ex01 {

	public static void main(String[] args) {
	
		
		Jonghyun j=new Jonghyun();
		
		Key k=new Key();
		
		Minho m=new Minho();
		
		Taemin t=new Taemin();
		
		
		print(j);
		print(k);
		print(m);
		print(t);
	}
	

	public static void print(Jonghyun jonghyun) {
		jonghyun.종현();
	}
	
	public static void print(Key key) {
		key.키();
	}
		
	public static void print(Minho minho) {
		minho.민호();
	}
	
	public static void print(Taemin taemin) {
		taemin.태민();
	}
		
	
	

}
