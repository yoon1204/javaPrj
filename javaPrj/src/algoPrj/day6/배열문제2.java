package algoPrj.day6;

public class 배열문제2 {

	public static void main(String[] args) {
		
		//                  0  1  2  3  4  5  6  7  8  9  10 11 12 13
		int[] temperatures={27,27,28,29,30,33,32,33,32,31,31,33,33,31};
		

		System.out.println(temperatures[13]);
		System.out.println(temperatures[12]);
		System.out.println(temperatures[11]);
		System.out.println(temperatures[10]);
		System.out.println(temperatures[9]);
		System.out.println(temperatures[8]);
		System.out.println(temperatures[7]);
		System.out.println(temperatures[6]);
		System.out.println(temperatures[5]);
		System.out.println(temperatures[4]);
		System.out.println(temperatures[3]);
		System.out.println(temperatures[2]);
		System.out.println(temperatures[1]);
		System.out.println(temperatures[0]);
		
		
		
		for(int i=temperatures.length-1; i>=0; i--) {
			System.out.println(temperatures[i]);
			
			
		}
	}
}
