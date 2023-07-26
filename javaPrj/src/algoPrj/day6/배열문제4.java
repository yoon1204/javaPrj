package algoPrj.day6;

public class 배열문제4 {

	public static void main(String[] args) {
		
int[] temperatures = {27,27,28,29,30,33,32,33,32,31,31,33,33,31};
		
		int sum=0;
		int cnt=0;
		for(int i=0; i<temperatures.length; i++){
			sum=sum+temperatures[i];
		}
		
		int avg=sum/temperatures.length;
		System.out.println(avg);
		
		
		for(int i=0; i<temperatures.length; i++) {
			if(avg<temperatures[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
