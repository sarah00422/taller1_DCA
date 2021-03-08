import java.util.ArrayList;

import processing.core.PApplet;

public class PlayScreen {
	private int height;
	private int width;
	private Ship ship;
	int numEnemy; 
	private ArrayList<Enemy> enemies;

	public PlayScreen(int height, int width, PApplet app) {
		this.height = height;
		this.width = width;
		ship= new Ship(app);
		numEnemy = 5;
		enemies = new ArrayList<>();
		for (int i=0; i < numEnemy ;i++) {
			enemies.add(new Enemy());
		}
				
	}

	public void draw(PApplet app) {
       ship.drawShip(app);
       for (int i = 0 ; i < enemies.size() ; i++) { 
    	   enemies.get(i).drawEnemy(app);
       }
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}
	

}
