import processing.core.PApplet;

public class Rechthoek extends Figuur {

	int b, h;

	public Rechthoek(int x, int y, int b, int h) {
		super(x, y);
		this.b = b;
		this.h = h;

	}

	@Override
	public void teken(PApplet app) {
		app.fill(255);
		app.noStroke();
		app.rectMode(app.CENTER);
		app.rect(x, y, b, h);

	}

	@Override
	public boolean isMuisBinnen(int x, int y) {

		if (x >= this.x - (b / 2) && x <= this.x + (b / 2) && y > this.y - (h / 2) && y <= this.y + (h / 2)) {

			return true;
		}

		else {
			return false;
		}

	}

}
