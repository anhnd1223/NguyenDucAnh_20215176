package aims;
import cart.Cart;
import media.DVD;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();

		DVD dvd1 = new DVD("The lion king","Animation","Roger Allers",87,19.95f);
		anOrder.addMedia(dvd1);
		DVD dvd2 = new DVD("Star wars","Sci-fi","George",87,24.95f);
		anOrder.addMedia(dvd2);
		DVD dvd3 = new DVD("Aladdin","Animation",18.99f);
		anOrder.addMedia(dvd3); 
		//System.out.println("Total cost is: "); 	
		//System.out.println(anOrder.totalCost()); 
		
		//anOrder.removeDVD(dvd3);
		//System.out.println("Total cost is: "); 	
		//System.out.println(anOrder.totalCost()); 
		
	}

}
