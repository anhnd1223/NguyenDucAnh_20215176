package aims;
import cart.Cart;
//import store.Store;
import media.DVD;
import java.util.Scanner;

public class Aims {
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		Scanner scanner = new Scanner(System.in);
	    int input = scanner.nextInt();
	    switch (input) {
	    	case 1: storeMenu();break;
	    	case 2: showMenu();break;
	    	case 3: cartMenu();break;
	    	case 0: System.out.println("Exitted!.");break;
	    	default:
	    }
	    scanner.close();
	}
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		Scanner scanner = new Scanner(System.in);
	    int input = scanner.nextInt();
	    switch (input) {
	    	case 1: mediaDetailsMenu();break;
	    	case 2: storeMenu();break;
	    	case 3: storeMenu();break;
	    	case 4: cartMenu();break;
	    	case 0: showMenu();break;
	    	default:
	    }
	    scanner.close();
		}
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		Scanner scanner = new Scanner(System.in);
	    int input = scanner.nextInt();
	    switch (input) {
	    	case 1: mediaDetailsMenu();break;
	    	case 2: mediaDetailsMenu();break;
	    	case 0: storeMenu();break;
	    	default:
	    }
	    scanner.close();
		}
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
		Scanner scanner = new Scanner(System.in);
	    int input = scanner.nextInt();
	    switch (input) {
	    	case 1: cartMenu();break;
	    	case 2: cartMenu();break;
	    	case 3: cartMenu();break;
	    	case 4: cartMenu();break;
	    	case 5: System.out.println("Order placed!");cartMenu();break;
	    	case 0: storeMenu();break;
	    	default:
	    }
	    scanner.close();
		}
	
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DVD dvd1 = new DVD("The lion king","Animation","Roger Allers",87,19.95f);
		anOrder.addMedia(dvd1);
		DVD dvd2 = new DVD("Star wars","Sci-fi","George",87,24.95f);
		anOrder.addMedia(dvd2);
		DVD dvd3 = new DVD("Aladdin","Animation",18.99f);
		anOrder.addMedia(dvd3);
		
		anOrder.totalCost(); 
		anOrder.removeMedia(dvd3);
		anOrder.totalCost(); 
		
	}

}
