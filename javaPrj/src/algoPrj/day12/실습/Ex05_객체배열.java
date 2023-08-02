package algoPrj.day12.실습;

public class Ex05_객체배열 {

	// 멤버변수
	String groupName;
	int groupNum;
	String memberName;
	String memberAge;
	String memberNickname;

	// 생성자
	public Ex05_객체배열() {
			
	}

	public Ex05_객체배열(String memberName, String memberAge, String memberNickname) {
			super();
			this.groupName = "SHINee";
			this.groupNum = 4;
			this.memberName = memberName;
			this.memberAge = memberAge;
			this.memberNickname = memberNickname;
			
	}

	@Override
	// 부모의 매서드의 재정의
	public String toString() {
		return groupName + " " + groupNum + " " + memberName + " " + memberAge + " " + memberNickname ;
	}

}
