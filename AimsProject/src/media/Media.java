package media;
import java.util.*;

import comparator.*;

public abstract class Media {

	public static final Comparator<Media> COMPARE_TITLE_COST = new MediaSortTitleCost();
	public static final Comparator<Media> COMPARE_COST_TITLE = new MediaSortCostTitle();
	
	private int id;
	private String title;
	private String category;
	private float cost;
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
	
	public Media(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	 
	public void printSelf() {
		System.out.println(this.id + "-" + this.title + "-" + this.category + "-" + this.cost);
	}
	public boolean equals(Object obj) {
		if(obj instanceof Media)
			if(((Media)obj).getTitle() == this.getTitle())
				return true;
		return false;
	}
}
