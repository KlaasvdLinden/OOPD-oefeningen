import java.util.ArrayList;

import processing.core.PApplet;

public class GraphicsEngineApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main("GraphicsEngineApp");

	}

	protected ArrayList<WeergaveObject> weergavelijst = new ArrayList<WeergaveObject>();
	private Rechthoek r = new Rechthoek(150, 150, 50, 50, 255);
	private IReageerder i = new HalloReageerder();

	public void settings() {
		size(400, 400);
	}

	public void setup() {

		weergavelijst.add(r);
		r.voegReageerderToe(i);

	}

	public void draw() {
		
		r.geefWeer(this, 150, 150);

	}

	public void mousePressed() {
		
		if(r.isMuisBinnen(mouseX, mouseY) == true) {
			r.behandelMousePressedGebeurtenis();
		}

	}

}
