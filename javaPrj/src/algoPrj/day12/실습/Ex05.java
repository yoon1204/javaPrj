package algoPrj.day12.실습;

public class Ex05 {

	public static void main(String[] args) {
		
		Ex05_객체배열[] SHINee = new Ex05_객체배열[4];
		
		SHINee[0] = new Ex05_객체배열("종현","90년생","큰댐");
		SHINee[1] = new Ex05_객체배열("기범","91년생","작은댐");
		SHINee[2] = new Ex05_객체배열("민호","91년생","최다정");
		SHINee[3] = new Ex05_객체배열("태민","93년생","탬아리");
		
		for(Object SHIN : SHINee) {
			System.out.println(SHIN);
		}

	}

}
