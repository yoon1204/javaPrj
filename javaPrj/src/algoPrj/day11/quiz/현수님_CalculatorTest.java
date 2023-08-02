package algoPrj.day11.quiz;

import java.util.Scanner;

import com.acorn.hs.Calculator;

public class 현수님_CalculatorTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = CalculatorI.add(num1, num2);
		System.out.println(result);
		result = CalculatorI.sub(num1, num2);
		System.out.println(result);
		result = CalculatorI.mul(num1, num2);
		System.out.println(result);
		result = CalculatorI.div(num1, num2);
		System.out.println(result);
	}
}
