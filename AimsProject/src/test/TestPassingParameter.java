package test;
import media.DVD;

public class TestPassingParameter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DVD jungleDVD = new DVD("Jungle");
		DVD cinderellaDVD = new DVD("Cinderella");
		ObjectWrapper a = new ObjectWrapper(jungleDVD);
		ObjectWrapper b = new ObjectWrapper(cinderellaDVD);
		swap(a, b);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	
	static class ObjectWrapper
	{
		Object object;
		ObjectWrapper(Object object)
		{
			this.object = object;
		}
	}
	
	public static void swap(ObjectWrapper o1, ObjectWrapper o2) 
	{
		Object temp = o1.object;
		o1.object = o2.object;
		o2.object = temp;
	}
	
	public static void changeTitle(DVD dvd, String title)
	{
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DVD(oldTitle);
	}

}
