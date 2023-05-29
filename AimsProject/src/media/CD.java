package media;

import java.util.ArrayList;

public class CD extends Disc implements Playable{

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}

	public CD(int id, String title) {
		super(id, title);
	}
 
	
	public void addTrack(Track inputTrack) {
		for(int i=0;i<tracks.size();i++)
		{
			if(tracks.get(i) == inputTrack)
			{
				System.out.println("Track already in!");
				return;
			}
		}
		tracks.add(inputTrack);
	}
	public void removetrack(Track inputTrack) {
		int sol = 0;
		for(int i=0;i<tracks.size();i++)
		{
			if(tracks.get(i) == inputTrack)
			{
				tracks.remove(i);
				sol = 1;
			}
		}
		if(sol == 0)
			System.out.println("Track not in!");
	}
	public int getLength() {
		int sol = 0;
		for(int i=0;i<tracks.size();i++)
		{
			sol+=tracks.get(i).getLength();
		}
		return sol;
	}
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("Of artist: " + this.getArtist());
		System.out.println("CD length: " + this.getLength());
		for(int i=0;i<tracks.size();i++)
		{
			tracks.get(i).play();
		}
	}
}
