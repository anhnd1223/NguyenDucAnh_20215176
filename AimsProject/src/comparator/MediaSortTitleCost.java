package comparator;
import media.Media;
import java.util.*;

public class MediaSortTitleCost implements Comparator<Media> {
	public int compare(Media a, Media b) {
		int sol = a.getTitle().compareTo(b.getTitle());
		if(sol != 0) return sol;
		return (int)(b.getCost() - a.getCost());
	}
}