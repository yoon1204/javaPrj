package algoPrj.day15.정렬;

public class MyArraysTest {

	public static void main(String[] args) {
		
		
		// 객체참조형변수를 배열로 만든 것 => 주의사항 Score형 객체가 생성된 적이 없다.
		Score[] arr=new Score[3]; // 배열은 모두 null로 초기화됨
					
					
		arr[0]=new Score("홍길동",100,90);
		arr[1]=new Score("김길동",80,75);
		arr[2]=new Score("다길동",75,85);
		
		// MyArrays.sort(배열, MyComparator 인터페이스)
		MyComparatorImp m=new MyComparatorImp(); // 객체 생성
		MyArrays.sort(arr, m);
		
		System.out.println("국어 점수 정렬후==>");
		for(Score score: arr)
			System.out.println(score);

	}

}
