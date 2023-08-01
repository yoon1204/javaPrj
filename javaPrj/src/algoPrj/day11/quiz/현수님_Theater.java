package algoPrj.day11.quiz;

import java.util.Scanner;

public class 현수님_Theater {
	
	public static void main(String[] args) {
		
		현수님_Movie[] movies = new 현수님_Movie[3];
		
		movies[0] = new 현수님_Movie();
		movies[0].inputMovie("엘리멘탈", "픽사의누군가", "애니메이션");
		movies[1] = new 현수님_Movie();
		movies[1].inputMovie("어벤져스", "마블의누군가", "판타지");
		movies[2] = new 현수님_Movie();
		movies[2].inputMovie("범죄도시", "한국의누군가", "스릴러");
		
		for(int i=0; i<movies.length; i++) {
			movies[i].printfInfo();
		}
	}
	
	

}
