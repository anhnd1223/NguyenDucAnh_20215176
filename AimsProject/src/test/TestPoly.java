package test;
import media.Media;
import media.CD;
import media.DVD;
import media.Book;
import java.util.ArrayList;

import java.util.List;

public class TestPoly {

	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		
		CD cd = new CD(12,"Johny Depp");
		DVD dvd = new DVD("Amazing song");
		Book book = new Book(13,"How to be good");
		
		 mediae.add(cd);
		 mediae.add(book);
		 mediae.add(dvd);
		 
		for(Media m:mediae) {
			System.out.println(m.toString());
		}
		
	}

}