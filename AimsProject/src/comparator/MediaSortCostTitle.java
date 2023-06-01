package comparator;
import media.Media;
import java.util.*;

public class MediaSortCostTitle implements Comparator<Media> {
	public int compare(Media a, Media b) {
		float sol =  b.getCost() - a.getCost();
		if(sol!=0) return (int)sol;
		return a.getTitle().compareTo(b.getTitle());
	}
}
