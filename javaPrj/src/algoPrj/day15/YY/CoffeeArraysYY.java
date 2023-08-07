package algoPrj.day15.YY;

public class CoffeeArraysYY {

	public static void sort(Object[]obj,MYCoffeeYY c) {
		
		for(int i=0;i<obj.length-1;i++) {
			for(int j=i+1;j<obj.length;j++) {
				if(c.YYcompare(obj[i], obj[j])>0) {
					Object tmp;
					tmp = obj[i];
					obj[i]=obj[j];
					obj[j]=tmp;
				}
			}
		}
	}
}
