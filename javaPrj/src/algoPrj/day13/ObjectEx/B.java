package algoPrj.day13.ObjectEx;

public class B {
	int number;
	
	
	
	public B(int number) {
		super();
		this.number=number;
	
	}
	
	@Override
	public String toString() {
		return number+"입니다";
	}
	
	@Override
	//public boolean equals(B this,Object obj){
	// if(b1.equals(b2)
	public boolean equals(Object obj) { //업캐스팅
		boolean result=false;	
		B b=(B)obj;	//다운캐스팅
		if(this.number == b.number)
			result=true;		
		return result;
		
	}
}

	
		

	


