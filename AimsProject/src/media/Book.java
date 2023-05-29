package media;
import java.util.ArrayList;

public class Book extends Media {
	
	private ArrayList<String> authors = new ArrayList<String>();
	public Book() {
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
