package media;

public abstract class Media {
	
	int id;
	String title;
	String category;
	float cost;
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Media() {
		// TODO Auto-generated constructor stub
	}

}
