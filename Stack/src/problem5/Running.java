package problem5;

import java.awt.BorderLayout;

import javax.swing.*;

public class Running extends JFrame{
	private Field field;
	
	public Running(Field field) {
		super("Running");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		add(field, BorderLayout.CENTER);
		
		setSize(500,500);
		setVisible(true);
		
		Thread th = new Thread(field);
		th.start();
	}
}
