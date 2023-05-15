
public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DVD itemsOrdered[] = new DVD[MAX_NUMBER_ORDERED];
	int qtyOrdered = 0;
	
	void addDVD(DVD disc) 
	{
		if(this.qtyOrdered == 20)
		{
			System.out.println("Cart full");
			return;
		}
		this.itemsOrdered[qtyOrdered] = disc;
		qtyOrdered ++;
		System.out.println("Added item.");
	}
	
	void addDVD(DVD[] dvdList)
	{
		for(int i=0;i < dvdList.length;i++)
			addDVD(dvdList[i]);
	}

	void addDVD(DVD dvd1, DVD dvd2)
	{
		addDVD(dvd1);
		addDVD(dvd2);
	}
	
//  A method with arbitrary number of arguments
//	void addDVD(DVD...dvds)
//	{
//		for(int i=0;i < dvds.length;i++)
//			addDVD(dvds[i]);
//	}
	
	void removeDVD(DVD disc) {
		if(this.qtyOrdered == 0)
		{
			System.out.println("Nothing in cart");
			return;
		}
		DVD temp[] = new DVD[qtyOrdered - 1];
		int i=0;int j=0;
		for(i=0;i<this.qtyOrdered;i++)
			if(this.itemsOrdered[i] == disc)
				;
			else
			{
				temp[j] = this.itemsOrdered[i];
				j++;
			}
		this.itemsOrdered = temp;
		System.out.println("Removed item.");

		qtyOrdered --;
	}
	
	float totalCost() {
		float j=0;
		for(int i=0;i<this.qtyOrdered;i++)
			j += this.itemsOrdered[i].getCost();
		return j;
	}
}