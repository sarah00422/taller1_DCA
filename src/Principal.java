import processing.core.PApplet;

public class Principal extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Principal");
	}

	int screen;
	int width;
	int height;
	private PlayScreen play;
	boolean disparo;

	@Override
	public void settings() {
		size(600, 750);
	}

	@Override
	public void setup() {
		screen = 1;
		width = 80;
		height = 50;
		disparo = true;
		play = new PlayScreen(height, width, this);
	}

	@Override
	public void draw() {
		background(250);
		rectMode(CENTER);
		if (screen == 1) {
			rect(300, 600, 80, 50);
		}
		if (screen == 2) {
			play.draw(this);
		}
		if (disparo == false) {
			System.out.println(frameCount);
			if (frameCount > 100) {
				frameCount = 0;
				disparo = true;
			}
		}

	}

	public void mousePressed() {
		if (mouseX >= 300 - width / 2 && mouseX <= 300 + width / 2 && mouseY >= 600 - height / 2
				&& mouseY <= 600 + height / 2) {
			screen = 2;
		}
	}// fin

	public void keyPressed() {
		switch (key) {
		case 'a':
			play.getShip().move(false);
			break;
		case 'd':
			play.getShip().move(true);
			break;
		case 's':
			if (disparo) {
				play.getShip().createBullet(this);
				disparo = false;
			}
			break;
		}
	}

}
