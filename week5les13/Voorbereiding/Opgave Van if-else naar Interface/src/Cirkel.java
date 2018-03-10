import processing.core.PApplet;

public class Cirkel extends Figuur {

	int d;

	Cirkel(int x, int y, int d) {

		super(x, y);
		this.d = d;
	}

	@Override
	public void teken(PApplet app) {
		app.fill(255);
		app.noStroke();
		app.ellipseMode(app.CENTER);
		app.ellipse(x, y, d, d);

	}

	@Override
	public boolean isMuisBinnen(int x, int y) {

		if (x >= this.x - (d / 2) && x <= this.x + (d / 2) && y > this.y - (d / 2) && y <= this.y + (d / 2)) {

			return true;
		}

		else {
			return false;
		}
	}
}
