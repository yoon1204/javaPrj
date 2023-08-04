package algoPrj.day14.ExceptionEx;

public class MyMath실습 {
		
		public int minus (int num1, int num2) throws NegativeNumberException{
			
			if(num1<1000 || num2<1000) {
				throw new NegativeNumberException();	
			}
			return num1-num2;
		}
}


