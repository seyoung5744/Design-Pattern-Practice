package problem5;

import javax.swing.*;
import java.awt.*;

public class Field extends JPanel implements Runnable{
	private JLabel lbl;
	private WalkingStrategy walkingStrategy; 
	
	public void setWalkingStrategy(WalkingStrategy strategy) {
		this.walkingStrategy = strategy;
	}
	
	public Field() {
		setLayout(new BorderLayout());
		lbl = new JLabel();
		add(lbl, BorderLayout.CENTER);
	}
	
	public void run() {
		walkingStrategy.move(lbl);
	}
}
