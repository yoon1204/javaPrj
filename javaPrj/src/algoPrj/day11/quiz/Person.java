package algoPrj.day11.quiz;

public class Person {
	
	String name;
	int age;
	boolean isMarried;
	int child;
	
	public Person() {}
	
	public Person(String name, int age, boolean marriage, int child) {
		this.name=name;
		this.age=age;
		this.isMarried=isMarried;
		this.child=child;
	}
	
	public Person(String name) {
		this.age=40;
		this.isMarried=true;
		this.child=3;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.isMarried);
		System.out.println(this.child);
	}
}
