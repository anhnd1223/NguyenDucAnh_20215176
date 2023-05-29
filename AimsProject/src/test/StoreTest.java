package test;
import media.DVD;
import store.Store;

public class StoreTest {

	public static void main(String[] args) {
		Store aStore = new Store();

		DVD dvd1 = new DVD("The lion king","Animation","Roger Allers",87,19.95f);
		aStore.addDVD(dvd1);
		DVD dvd2 = new DVD("Star wars","Sci-fi","George",87,24.95f);
		aStore.addDVD(dvd2);
		DVD dvd3 = new DVD("Aladdin","Animation",18.99f);
		aStore.addDVD(dvd3); 
		
		aStore.removeDVD(dvd3);
	}

}
