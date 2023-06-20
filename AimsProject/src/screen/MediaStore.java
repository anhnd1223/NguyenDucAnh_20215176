package screen;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import media.Media;
import media.Playable;

public class MediaStore extends JPanel{
	private Media media;
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String button = e.getActionCommand();
			if(button.equals("Add to cart")) {
				StoreScreen.cart.addMedia(media);
			}
			else if (button.equals("Play")) {
	            JDialog d = new JDialog(new JFrame(),"Playing media...");
	            JLabel l = new JLabel("We are playing your media...");
	            d.add(l);
	            d.setSize(200, 100);
	            d.setVisible(true);
			}
		}
	}
	
	public MediaStore(Media media) {
		
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel("" + media.getCost() + " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		ButtonListener buttonListener = new ButtonListener();
		
		JButton addButton = new JButton("Add to cart");
		addButton.addActionListener(buttonListener);
		container.add(addButton);
		if(media instanceof Playable) {
			JButton playButton = new JButton("Play");
			playButton.addActionListener(buttonListener);
			container.add(playButton);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}
