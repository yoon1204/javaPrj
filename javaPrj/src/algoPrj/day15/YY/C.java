package algoPrj.day15.YY;

public class C implements MYCoffeeYY{

	@Override
	public int YYcompare(Object o1, Object o2) {
		
		Coffee c1 = (Coffee)o1;
		Coffee c2 = (Coffee)o2;
		
		return c1.getKal()-c2.getKal();
	}

}
