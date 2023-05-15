package aims;
import cart.Cart;
import disc.DVD;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();

		DVD dvd1 = new DVD("The lion king","Animation","Roger Allers",87,19.95f);
		anOrder.addDVD(dvd1);
		DVD dvd2 = new DVD("Star wars","Sci-fi","George",87,24.95f);
		anOrder.addDVD(dvd2);
		DVD dvd3 = new DVD("Aladdin","Animation",18.99f);
		anOrder.addDVD(dvd3); 
		//System.out.println("Total cost is: "); 	
		//System.out.println(anOrder.totalCost()); 	
		
		anOrder.printCart(); 
			System.out.println();
		anOrder.searchCart(0);
		anOrder.searchCart(3);
			System.out.println();
		anOrder.searchCart("Aladdumb");
		anOrder.searchCart("tar");
		
		//anOrder.removeDVD(dvd3);
		//System.out.println("Total cost is: "); 	
		//System.out.println(anOrder.totalCost()); 
		
	}

}
