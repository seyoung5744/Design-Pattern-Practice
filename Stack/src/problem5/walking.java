package problem5;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class walking implements WalkingStrategy {
	private String[] walkingImage = { "walk1.gif", "walk2.gif" };
	
	@Override
	public void move(JLabel lbl) {
		lbl.setIcon(new ImageIcon("./src/walk1.gif"));
		
		while(true) {
			String[] path = walkingImage;
			for ( int i = 0; i < path.length; i++) {
				lbl.setIcon(new ImageIcon("./src/" + path[i]));
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {}
			}
		}
	}
}
