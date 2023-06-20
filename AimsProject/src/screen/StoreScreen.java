package screen;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import cart.Cart;
import media.*;
import store.*;

public class StoreScreen extends JFrame{
	private Store store;
	public static Cart cart;
	
	public StoreScreen(Store store) {
		this.store = store;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
	}
	
	public static void main(String[] args) {
		Store store = new Store();
		store.addMedia(new CD(1,"Cool CD","Scifi",10));
		store.addMedia(new CD(2,"Good CD","Adventure",9));
		store.addMedia(new CD(3,"Amazing CD","Documentary",14));
		store.addMedia(new CD(4,"Nice CD","Romance",8));
		store.addMedia(new Book(5,"Cool Book","Romance",8));
		store.addMedia(new Book(6,"Nice Book","Scifi",10));
		store.addMedia(new Book(7,"Decent Book","Self-help",12));
		store.addMedia(new DVD(8,"Lame DVD","Music",11));
		store.addMedia(new DVD(9,"Good DVD","Scifi",12));
		new StoreScreen(store);
	}
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	} 
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 3, 2, 2));
		 
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for(int i=0; i<9; i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i));
			center.add(cell);
		}
		 
		return center;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		JButton cart = new JButton("View cart");
		cart.setPreferredSize(new Dimension(100,50));
		cart.setMaximumSize(new Dimension(100,50));
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10,10)));
		
		return header;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		menu.add(new JMenuItem("View cart"));
		 
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
}
