package cart;
import media.Media;

import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	

	public void addMedia(Media inputMedia) {
		for(int i=0;i<itemsOrdered.size();i++)
		{
			if(itemsOrdered.get(i) == inputMedia)
			{
				System.out.println("Media already in!");
				return;
			}
		}
		itemsOrdered.add(inputMedia);
	}
	public void removeMedia(Media inputMedia) {
		int sol = 0;
		for(int i=0;i<itemsOrdered.size();i++)
		{
			if(itemsOrdered.get(i) == inputMedia)
			{
				itemsOrdered.remove(i);
				sol = 1;
			}
		}
		if(sol == 0)
			System.out.println("Media not in!");
	}
	public void totalCost() {
		int sol = 0;
		for(int i=0;i<itemsOrdered.size();i++)
		{
			sol+=itemsOrdered.get(i).getCost();
		}
		System.out.println("Total cost is:" + sol);
	}
}
