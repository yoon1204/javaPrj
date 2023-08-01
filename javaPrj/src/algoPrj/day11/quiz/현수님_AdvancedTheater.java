package algoPrj.day11.quiz;

import java.util.Scanner;

public class 현수님_AdvancedTheater {

	현수님_Movie[] movies = new 현수님_Movie[5];
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		현수님_AdvancedTheater ad = new 현수님_AdvancedTheater();
		ad.run();

	}

	public void run() {

		loop: while (true) {
			
			System.out.println("---Program Start---");

			printMenu();

			System.out.println("-------------------");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				inputMovies();
				break;
			case 2:
				printMoviesInfo();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

	public void printMenu() {
		System.out.println("1. 영화 정보 입력");
		System.out.println("2. 영화 조회");
		System.out.println("3. 프로그램 종료");
	}

	public void inputMovies() {
		System.out.println("---영화정보입력---");
		for (int i = 0; i < movies.length; i++) {
			System.out.println("-" + (i + 1) + "번째 영화 정보 입력 -");
			movies[i] = new 현수님_Movie();
			System.out.println("제목 : ");
			String title = sc.next();
			System.out.println("감독 : ");
			String director = sc.next();
			System.out.println("장르 : ");
			String genre = sc.next();
			movies[i].inputMovie(title, director, genre);
		}
	}

	public void printMoviesInfo() {
		for (int i = 0; i < movies.length; i++) {
			System.out.println((i + 1) + "번째 영화 정보 출력");
			movies[i].printfInfo();
		}
	}
}
