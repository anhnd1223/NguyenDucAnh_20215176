package media;


public class DVD extends Media {
	private static int nbDVD = 0;
	private String director;
	private int length;
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	//constructor
	public DVD(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDVD++;
	    this.id = nbDVD;
	}
	public DVD(String title) {
		super();
		this.title = title;
		nbDVD++;
	    this.id = nbDVD;
	}
	public DVD(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDVD++;
	    this.id = nbDVD;
	}
	public DVD(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDVD++;
	    this.id = nbDVD;
	}
	
	//other
	public boolean isMatch(String title) {
		if(this.title.indexOf(title) != -1) return true;
		return false;
	}
	public void printSelf() {
		System.out.printf("%d. %s - %s - %s - %d: %.2f $\n",
				getId(),getTitle(),getCategory(),getDirector(),getLength(),getCost());
	}
}
