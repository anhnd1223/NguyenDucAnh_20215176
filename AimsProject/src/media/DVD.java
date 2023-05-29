package media;


public class DVD extends Disc {
	private static int nbDVD = 0;
	
	//constructor
	public DVD(String title, String category, float cost, int length, String director) {
		super(nbDVD+1, title, category, cost, length, director);
		nbDVD++;
	}
	
	public DVD(String title) {
		super(nbDVD+1, title);
		nbDVD++;
	}
	public DVD(String title, String category, float cost) {
		super(nbDVD+1, title, category, cost);
		nbDVD++;
	}
	public DVD(String title, String category, String director, float cost) {
		super(nbDVD+1, title, category, cost, director);
		nbDVD++;
	}
	
	//other
	public boolean isMatch(String title) {
		if(this.getTitle().indexOf(title) != -1) return true;
		return false;
	}
	public void printSelf() {
		System.out.printf("%d. %s - %s - %s - %d: %.2f $\n",
				getId(),getTitle(),getCategory(),getDirector(),getLength(),getCost());
	}
}
