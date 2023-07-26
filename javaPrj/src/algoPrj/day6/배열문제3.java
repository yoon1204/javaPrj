package algoPrj.day6;

public class 배열문제3 {

	public static void main(String[] args) {

		// 					  0  1  2  3  4  5  6  7  8  9  10 11 12 13
		int[] temperatures = {27,27,28,29,30,33,32,33,32,31,31,33,33,31};

		int sum = 0;

		sum = sum + temperatures[0]; // 0+27=27
		sum = sum + temperatures[1]; // 27+27=54
		sum = sum + temperatures[2]; // 54+28=82
		sum = sum + temperatures[3]; // 82+29=111
		sum = sum + temperatures[4]; // 111+30=141
		sum = sum + temperatures[5]; // 141+33=174
		sum = sum + temperatures[6]; // 174+32=206
		sum = sum + temperatures[7]; // 206+33=239
		sum = sum + temperatures[8]; // 239+32=271
		sum = sum + temperatures[9]; // 271+31=302
		sum = sum + temperatures[10]; // 302+31=333
		sum = sum + temperatures[11]; //333+33=366
		sum = sum + temperatures[12]; //366+33=399
		sum = sum + temperatures[13]; //399+31=430

		for (int i = 0; i < temperatures.length; i++) {
			sum = sum + temperatures[i];
		}

		double avg = sum / temperatures.length;
		System.out.println(avg);

	}
}
