package algoPrj.day11.quiz;

import java.util.Scanner;

public class 정훈님_자판기Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		자판기 drink = new 자판기();
		
		int money = sc.nextInt();
		
		drink.priceIncrease(0, 0, 0, 0, 0);
		drink.priceReduction(0, 0, 0, 0, 0);
		drink.buy(money);
	}

}
