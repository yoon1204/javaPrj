package algoPrj.day5;

public class Array2Ex {

	public static void main(String[] args) {
		
		System.out.println("\n----- 1차원 배열 -----");
		// 내가 좋아하는 과일 5
		// 내가 좋아하는 음료 5
		
		String[] fruits = {"체리","망고","복숭아","딸기","수박"};
		String[] beverage = {"아메리카노","흑임자라떼","탄산수","레몬티","망고주스"};
		
		System.out.print(fruits[0] + " ");
		System.out.print(fruits[1] + " ");
		System.out.print(fruits[2] + " ");
		System.out.print(fruits[3] + " ");
		System.out.println(fruits[4]);
		
		System.out.print(beverage[0] + " ");
		System.out.print(beverage[1] + " ");
		System.out.print(beverage[2] + " ");
		System.out.print(beverage[3] + " ");
		System.out.println(beverage[4]);
		
		System.out.println("\n----- 1차원 배열(반복문) -----");
		for(int i=0; i<5; i++) {
			System.out.print(fruits[i]+" ");
		}
		System.out.println(" ");
		for(int i=0; i<5; i++) {
			System.out.print(beverage[i]+" ");
		}
		System.out.println(" ");
		
		
		
		
		
		System.out.println("\n----- 2차원 배열 -----");
		// 2차원 배열
		
		// 2차원 배열 선언 [행][열]
		
		// String[][] favorites=new String[2][5];
		
		   String[][] favorites={{"체리","망고","복숭아","딸기","수박"},
				   				{"아메리카노","흑임자라떼","탄산수","레몬티","망고주스"}};
		
		   
		   
		   System.out.print(favorites[0][0] + " ");
		   System.out.print(favorites[0][1]+ " ");
		   System.out.print(favorites[0][2]+ " ");
		   System.out.print(favorites[0][3]+ " ");
		   System.out.println(favorites[0][4]);
		   
		   
		   System.out.print(favorites[1][0]+ " ");
		   System.out.print(favorites[1][1]+ " ");
		   System.out.print(favorites[1][2]+ " ");
		   System.out.print(favorites[1][3]+ " ");
		   System.out.println(favorites[1][4]);
		   
		   System.out.println("\n----- 2차원 배열(반복문) -----");
			for(int i=0; i<2; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(favorites[i][j]+" ");
				}
				System.out.println(" ");
			}
			
			
			
			
			
			
			
		   System.out.println("\n----- 2차원 배열(제출용) -----");
		   String[][]donut = {{"크림브륄레","피넛버터","버터피스타치오","버터넛","시나몬슈가"},
				   {"라즈베리슈가볼","우유크림도넛브레드","얼그레이","블루베리","초코크런치"}};
		   
		   System.out.print(donut[0][0] + " ");
		   System.out.print(donut[0][1]+ " ");
		   System.out.print(donut[0][2]+ " ");
		   System.out.print(donut[0][3]+ " ");
		   System.out.println(donut[0][4]);
		   
		   System.out.print(donut[1][0]+ " ");
		   System.out.print(donut[1][1]+ " ");
		   System.out.print(donut[1][2]+ " ");
		   System.out.print(donut[1][3]+ " ");
		   System.out.println(donut[1][4]);
		   
		   
		   System.out.println("\n----- 2차원 배열(반복문) -----");
		   for(int k=0; k<donut.length; k++) {
			   for(int l=0; l<donut[k].length; l++) {
			   System.out.print(donut[k][l]+" ");
			   }
			   System.out.println(" ");
		   }
		   
		   
		   
	}

}
