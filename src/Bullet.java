import processing.core.PApplet;
public class Bullet {
   private int sizeBullet; 
   private int posxB; 
   private int posyB; 
   private int damage;
   private int speed; 
   
   public Bullet (int posX,int posY,PApplet app) {
	   sizeBullet= 20;
	   posxB=posX; 
	   posyB=posY; 
	   damage=1;
	   speed=5;
   }
    public void drawBullet(PApplet app) {
    	app.circle(posxB, posyB, sizeBullet);
    }
    
    public void moveBullet() {
    	posyB-=speed;
    }
	public int getPosxB() {
		return posxB;
	}
	public void setPosxB(int posxB) {
		this.posxB = posxB;
	}
	public int getPosyB() {
		return posyB;
	}
	public void setPosyB(int posyB) {
		this.posyB = posyB;
	}

}
