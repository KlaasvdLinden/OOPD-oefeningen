import processing.core.PApplet;

public class Main extends PApplet {

	Vorm c = new Cirkel(100, 100, 50);

	public static void main(String[] args) {
		PApplet.main("Main");
	}

	public void settings() {

		size(500, 500);

	}

	public void setup() {

		c.setSnelheid(2, 0);
		c.setKleur(255);
	}

	public void draw() {

		background(0);
		c.teken(this);
		c.doeStap();

	}

}
