package algoPrj.day12.quiz;

public class 현수님_Gram extends 현수님_Notebook {
	String name;
	String gpu;
	
	// 생성자를 하나라도 만들면 기본생성자는 제공되지 않는다.
	
	// 매개변수 생성자
	public 현수님_Gram(String cpu, int ram, String name, String gpu) {
		super(cpu, ram); 	// 부모의 매개변수가 있는 생성자를 호출하는 코드		
						 	// 명시적으로 부모의 생성자를 호출하는 코드가 없으면
		this.name = name;	// 부모의 기본생성자 super()를 호출한다!!
		this.gpu = gpu;
	}
	
	public String toString() {
		return name + cpu + ram + gpu;
	}
}
