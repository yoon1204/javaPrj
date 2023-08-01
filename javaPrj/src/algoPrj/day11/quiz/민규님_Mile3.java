package algoPrj.day11.quiz;

public class 민규님_Mile3 {

	
		//멤버변수
		private int mile;
		private double kiloMeter;

		//멤버변수를 다루는 기능(함수) , 매서드라고 부름
		public double calCulator(int mile ) {
			this.mile = mile;
			this.kiloMeter = mile*1.60934;
			return kiloMeter;		
		}	
		public double getkiloMeter(int mile) {
			
			double result=calCulator(mile);
			return result;
		}
	}


