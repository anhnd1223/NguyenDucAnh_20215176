
public class Store {
	public static final int MAX_NUMBER_ORDERED = 100;
	private DVD itemsInStore[] = new DVD[MAX_NUMBER_ORDERED];
	private int qtyInStore = 0;

	void addDVD(DVD disc) 
	{
		if(this.qtyInStore == 100)
		{
			System.out.println("Store full");
			return;
		}
		this.itemsInStore[qtyInStore] = disc;
		qtyInStore ++;
		System.out.println("Added item.");
	}
	

	void removeDVD(DVD disc) {
		if(this.qtyInStore == 0)
		{
			System.out.println("Nothing in store");
			return;
		}
		DVD temp[] = new DVD[qtyInStore - 1];
		int i=0;int j=0;
		for(i=0;i<this.qtyInStore;i++)
			if(this.itemsInStore[i] == disc)
				;
			else
			{
				temp[j] = this.itemsInStore[i];
				j++;
			}
		this.itemsInStore = temp;
		System.out.println("Removed item.");

		qtyInStore --;
	}
}
