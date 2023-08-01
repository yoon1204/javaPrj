package algoPrj.day11.quiz;

public class 현수님_Movie {
	
	private String title;
	private String director;
	private String genre;
	
	public void inputMovie(String title, String director, String genre) {
		this.title = title;
		this.director = director;
		this.genre = genre;
	}
	
	public void printfInfo() {
		System.out.println("title : " + this.title);
		System.out.println("director : " + this.director);
		System.out.println("genre : " + this.genre);
	}

}
