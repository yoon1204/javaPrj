package algoPrj.day11.inheritance.실습;

public class Ex02 {

	public static void main(String[] args) {
		
		Crump c=new Crump();
		
		KneeKick k=new KneeKick();
		
		Poppin p=new Poppin();
		
		Wave w=new Wave();
		
		print(c);
		print(k);
		print(p);
		print(w);
		
		
		}
	
	public static void print(Crump crump) {
		crump.크럼프();
	}
	
	public static void print(KneeKick kneekick) {
		kneekick.니킥();
	}
	
	public static void print(Poppin poppin) {
		poppin.팝핀();
	}
	
	public static void print(Wave wave) {
		wave.웨이브();
	}

}
