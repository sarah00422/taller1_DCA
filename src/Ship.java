import java.util.ArrayList;
import java.util.Iterator;

import processing.core.PApplet;

public class Ship {
	private int size;
	private int posX;
	private int posY;
	private int lives;
	private int coldDown;
	private boolean moveX;
	private ArrayList<Bullet> balas;

	public Ship(PApplet app) {
		posX = 300;
		posY = 650;
		size = 50;
		lives = 5;
		coldDown = 0;
		moveX = false;
		balas= new ArrayList<>();
	}
    // recorriendo el arreglo de balas, las pinto y las muevo
	public void drawShip(PApplet app) {
		app.circle(posX, posY, size);
		for (int i = 0; i < balas.size(); i++) {
		 balas.get(i).drawBullet(app);
		 balas.get(i).moveBullet();
		}
		deletBullet();
		System.out.println(balas.size());
	}

	public void move(boolean moveX) {
		if (posX < 600) {
			if (moveX == false) {
				posX -= 3;
			}
		} else {
			posX = 599;
		}
		if (posX > 0) {
			if (moveX == true) {
				posX += 3;
			}

		} else {
			posX = 1;
		}

	}
	public void createBullet(PApplet app) {
		Bullet balaX= new Bullet(posX,posY,app);
		balas.add(balaX);
	}
	public void deletBullet() {
		for (int i = 0; i < balas.size(); i++) {
            if (balas.get(i).getPosyB()<0) {
            	balas.remove(i);
            	}
			
		}
	}
}
