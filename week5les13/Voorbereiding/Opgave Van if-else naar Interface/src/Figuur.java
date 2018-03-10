import processing.core.PApplet;

public abstract class Figuur {

	protected int x, y;
	protected PApplet app;

	Figuur(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void teken(PApplet app);

	public abstract boolean isMuisBinnen(int mouseX, int mouseY);

}
