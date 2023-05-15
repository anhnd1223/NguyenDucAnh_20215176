
public class DVD {
	private static int nbDVD = 0;
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	//getter
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	//setters
	public void setTitle(String title) {
		this.title = title;
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
	boolean isMatch(String title) {
		if(this.title.indexOf(title) != -1) return true;
		return false;
	}
	void printSelf() {
		System.out.printf("%d. %s - %s - %s - %d: %.2f $\n",
				getId(),getTitle(),getCategory(),getDirector(),getLength(),getCost());
	}
}
