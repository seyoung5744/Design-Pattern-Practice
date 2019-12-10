package problem4;

import java.awt.Color;

public class Ball extends Thread{
	public static final int SIZE = 20;
	public static final int INTERVAL = 10;
	private int x, y;
	private int xInterval, yInterval;
	private DirectionStrategy directionStratygy;
	private DrawStrategy drawStrategy;
	private Color color;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.xInterval = this.yInterval = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setIntervals(int xInterval, int yInterval) {
		this.xInterval = xInterval;
		this.yInterval = yInterval;
	}

	public int getXinterval() {
		return xInterval;
	}
	public int getYinterval() {
		return yInterval;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setDirectionStratygy(DirectionStrategy directionStratygy) {
		this.directionStratygy = directionStratygy;
	}

	public void setDrawStrategy(DrawStrategy drawStrategy) {
		this.drawStrategy = drawStrategy;
	}

	public void draw() {
		drawStrategy.draw(this);
	}
	
	public void move() {
		directionStratygy.move(this);
	}

	public void run() {
		draw();
		move();
	}
}
