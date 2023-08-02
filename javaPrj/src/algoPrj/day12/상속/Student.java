package algoPrj.day12.상속;


public class Student extends Person{

	int classNo;
	
	public Student(String name, String id, int classNo) {
		// 값의 초기화 담당
		// super 키워드 : 상속관계
		// super(); // 기본적으로 부모의 기본생성자를 호출합니다.
		// super(name,id);
		// this.name = name;
		// this.id = id;
		
		/* 1. 부모 클래스의 기본생성자가 있을 때
		 *    super();
		 *    this.name = name;
		 *    this.id = id;
		 * 2. 부모 클래스의 기본생성자가 없어도 될 때
		 *    super(name,id);
		 */
		
		
		this.classNo=classNo;
	}
	
	
	public String toString() {
		
		return name+" "+id+" "+classNo;
	}
}


