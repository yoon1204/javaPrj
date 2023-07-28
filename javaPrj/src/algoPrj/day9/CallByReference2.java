package algoPrj.day9;

public class CallByReference2 {

	public static void main(String[] args) {

		//
		int[] kors = new int[3]; // kors=공간 1개, int[3]=공간 3개, new=공간 3개의 주소

		// 등록
		abc(kors); 

		// 조회
		def(kors);

	}

	public static void def(int[] a) {
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}

	public static void abc(int[] b) {
		b[0] = 5;
		b[1] = 8;
		b[2] = 9;
	}

	//
}
