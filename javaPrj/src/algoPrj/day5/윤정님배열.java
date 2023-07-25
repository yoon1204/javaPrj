package algoPrj.day5;

public class 윤정님배열 {

	public static void main(String[] args) {
		String[][] grade = { {"1학년", "2학년", "3학년", "4학년", "5학년"}, {"1반", "2반", "3반", "4반", "5반"} };
		
		
		System.out.println( grade[0][0] );
		System.out.println( grade[0][1] );
		System.out.println( grade[0][2] );
		System.out.println( grade[0][3] );
		System.out.println( grade[0][4] );
		
		
		System.out.println( grade[1][0] );
		System.out.println( grade[1][1] );
		System.out.println( grade[1][2] );
		System.out.println( grade[1][3] );
		System.out.println( grade[1][4] );
		
		
		System.out.println("\n------------");
		for(int i=0; i<grade.length; i++) {
			for(int j=0; j<grade[i].length; j++) {
				System.out.println(grade[i][j]);
			}
		}
	}
	
	

}
