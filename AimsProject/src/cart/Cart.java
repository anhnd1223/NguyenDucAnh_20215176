package cart;
import media.Media;
import javafx.collections.*;


public class Cart {
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	

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
	
	public void printSelf() {
		for(Media m:itemsOrdered)
			m.printSelf();
	}
	
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	
	public void totalCost() {
		float sol = 0;
		for(int i=0;i<itemsOrdered.size();i++)
		{
			sol+=itemsOrdered.get(i).getCost();
		}
		System.out.println("Total cost is:" + sol);
	}
}
