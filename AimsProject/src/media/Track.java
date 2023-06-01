package media;

public class Track implements Playable {

	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	public Track() {
	}
	 

	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	public boolean equals(Object obj) {
		if(obj instanceof Track)
			if(((Track)obj).getTitle() == this.getTitle() && ((Track)obj).getLength() == this.getLength())
				return true;
		return false;
	}
}
