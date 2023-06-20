package media;
import java.util.ArrayList;

public class Book extends Media {
	
	private ArrayList<String> authors = new ArrayList<String>();
	
	//constructor
	public Book(int id, String title) {
		super(id, title);
	}
	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
		// TODO Auto-generated constructor stub
	}


	//other
	public void addAuthor(String inputAuthor) {
		for(int i=0;i<authors.size();i++)
		{
			if(authors.get(i) == inputAuthor)
			{
				System.out.println("Author already in!");
				return;
			}
		}
		authors.add(inputAuthor);
	}
	public void removeAuthor(String inputAuthor) {
		int sol = 0;
		for(int i=0;i<authors.size();i++)
		{
			if(authors.get(i) == inputAuthor)
			{
				authors.remove(i);
				sol = 1;
			}
		}
		if(sol == 0)
			System.out.println("Author not in!");
	}
	 
	
}
