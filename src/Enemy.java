import processing.core.PApplet;
public class Enemy {
	private int sizeEnemy;
	private int posxE;
	private int posyE;
	private int livesEnemy;
	private int speedEnemy; 
	private int score; 
	
	public Enemy() {
		sizeEnemy=50; 
		posxE=-5;
	    posyE=-5;
	    livesEnemy=5;
	    speedEnemy=5;
	    score=0; 
	}
	public void drawEnemy(PApplet app) {
		app.circle(posxE, posyE, sizeEnemy);
	}
	public void moveEnemy(boolean moveX) {
				posyE+= speedEnemy;
			}
}
