package media;
import java.util.ArrayList;

public class Book {
	
	private int id;
	private String title;
	private String category;
	private float cost;
	private ArrayList<String> authors = new ArrayList<String>();
	public Book() {
	}
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
	public void addAuthor(String inputAuthor) {
		authors.add(inputAuthor);
	}
	public void removeAuthor(String inputAuthor) {
		for(int i=0;i<authors.size();i++)
		{
			if(authors.get(i) == inputAuthor)
			{
				authors.remove(i);
			}
		}
	}
}
