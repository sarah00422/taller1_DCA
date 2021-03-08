import processing.core.PApplet;

public class PlayScreen {
	private int height;
	private int width;
	private Ship ship;

	public PlayScreen(int height, int width, PApplet app) {
		this.height = height;
		this.width = width;
		ship= new Ship(app);
				
	}

	public void draw(PApplet app) {
       ship.drawShip(app);
       
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}
	

}
