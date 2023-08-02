package algoPrj.day12.quiz;

public class 재혁님_Animal {
	
	
	String name;
	String fname;
	
	
	
	public 재혁님_Animal() {
		this("동물이름","별명"); // 매개변수 생성자 호출코드
		
		
	}
	
	public 재혁님_Animal(String name, String fname) {
		this.fname=fname;
		this.name=name;
	}
	
	
	public String toString() {
		return name+fname;
	}
	
	
	

}
