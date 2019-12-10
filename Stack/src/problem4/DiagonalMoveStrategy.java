package problem4;

public class DiagonalMoveStrategy extends DirectionStrategy{
	@Override
	public void move(Ball ball) {
		ball.setIntervals(Ball.INTERVAL, Ball.INTERVAL);
		while(true) {
			ball.setX(ball.getX() + ball.getXinterval());
			ball.setY(ball.getY() + ball.getYinterval());
			
			
			if((ball.getX() < 0 && ball.getXinterval() < 0) || 
					(ball.getX() + Ball.SIZE > BallFrame.WIDTH - 15 && ball.getXinterval() > 0)) {
				ball.setIntervals(-ball.getXinterval(), ball.getYinterval());
			}else if((ball.getY() < 0 && ball.getYinterval() < 0) || 
			(ball.getY() + Ball.SIZE > BallFrame.HEIGHT - 15 && ball.getYinterval() > 0)) {
				ball.setIntervals(ball.getXinterval(), -ball.getYinterval());
			}
			
			try {
				Thread.sleep(30);
			}catch(InterruptedException e) {}
		}
		
		
		
		
		
	}
}
