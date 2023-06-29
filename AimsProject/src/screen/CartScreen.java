package screen;

import java.io.IOException;

import javax.swing.JFrame;

import cart.Cart;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import media.CD;
import media.DVD;

public class CartScreen extends JFrame{
	private Cart cart;

	public static void main(String[] args) {
	    Cart cart = new Cart();
		cart.addMedia(new CD(1,"Cool CD","Scifi",10));
		cart.addMedia(new DVD(9,"Good DVD","Scifi",12));
		new CartScreen(cart);
	}
	public CartScreen(Cart cart) {
		super();
		
		this.cart = cart;
		
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		
		this.setTitle("Cart");
		this.setVisible(true);
		Platform.runLater(new Runnable(){
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(
						getClass().getResource("/screen/cart.fxml"));
					CartScreenController controller = 
						new CartScreenController(cart);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		});
	}

}
