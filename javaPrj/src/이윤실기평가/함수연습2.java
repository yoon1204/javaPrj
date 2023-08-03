package 이윤실기평가;

public class 함수연습2 {

	public static void main(String[] args) {
		String[] arr2= 좋아하는과일이름구하기3개();
		
		
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		
		
	}

	private static String[] 좋아하는과일이름구하기3개() {
		// TODO Auto-generated method stub
		
		
		String[] arr=new String[3];
		
		arr[0]="망고";
		arr[1]="멜론";
		arr[2]="사과";
		
		return arr;
		
	}

}
