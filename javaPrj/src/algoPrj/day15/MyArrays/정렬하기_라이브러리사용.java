package algoPrj.day15.MyArrays;

import java.util.Arrays;
import java.util.Comparator;

public class 정렬하기_라이브러리사용 {

	public static void main(String[] args) {
		
		
		Score[] arr = new Score[3];		
		arr[0]= new Score("이길동",90,71);
		arr[1]= new Score("김길동",70,99);
		arr[2]= new Score("박길동",90,89);
 
		//class MyArrays.Score0 cannot be cast to class java.lang.Comparable 
		
		//Arrays.sort(arr);		
		//영어점수 순으로 오름차순 정렬 해줘
		Arrays.sort(arr,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score s1=(Score)o1;
				Score s2=(Score)o2;
				return s1.getEng()-s2.getEng();
			}});
		
		for(Score s : arr)
			System.out.println(s);
		
		Arrays.sort(arr,new Comparator<Score>() {
			@Override
			public int compare(Score o1, Score o2) {			
				return o1.getKor()-o2.getKor();
			}	});
		System.out.println("국어점수 오름차순 ==>");
		for(Score s : arr)
			System.out.println(s);
		
		
		Arrays.sort(arr);
	
			
		
		
		// Exception !!
		// class MyArrays.Score0 cannot be cast to class java.lang.Comparable 
		// 이 오류는  Score0 클래스를 Comparable로 형변환하고 있다.  
		// Comparable로 형변환이 가능하려면 Comparable 을 상속해야 한다. (인터페이스를 구현한다는 것은 인터페이스를 상속받는것과 같은 의미다. 물론 extends가 아니라 implements 키워드를 사용한다)
		// 그렇다는 것은 이 기능을 사용하기 위해서는 Comparable형 인터페이스를 구현해야 한다는 뜻 이다
		
		//정렬을 해 주는 라이브러리는 어떻게 만들어졌을까?
		
		
		/*
		 *  정렬해주는 기능을 만들기능
		 *  클래스명: Arrays.sort( Object[]) 
		 * 
		 *  -정렬알고리즘으로 좋은 정렬을 제공할 수 있다 
		 *  -정렬기준은 알 수 없다 .(객체의 속성, 값들을 알 수가 없다.그리고 속성값들 중 무엇으로 정렬하고 싶은지 알수가 없다)
		 *  -그래서 그 부분을 인터페이스로 만들고 인터페이스를 기반으로 정렬기능을 마감하였다.
		 *  
		 *  이 라이브러리를 사용하는 측에서 알 수 없는 정보를 인터페이스를 구현하여 정보를 제공하여야 한다.  !!!
		 */
				
		//Arrays.sort(object[] obj, Comparator c)
		
		Arrays.sort(arr,new Comparator(){

			@Override
			public int compare(Object o1,Object o2) {
				return 0;
			}});
		
		
		for( Score s: arr)
			System.out.println(s);
		
		

	}

}
