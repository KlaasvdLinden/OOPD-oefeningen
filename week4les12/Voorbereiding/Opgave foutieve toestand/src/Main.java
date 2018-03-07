import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Main");

	}

	private Licht L;
	private LichtSwitch S;

	public void settings() {

		size(500, 500);
	}

	public void setup() {
		 L = new Licht(this);
		 S = new LichtSwitch(this, L, 40, 40, 40, 40);
	}

	public void draw() {
		L.tekenLicht();
		S.tekenKnop();
	}

	public void mousePressed() {

		if (S.isMuisOverKnop()) {

			S.handelInteractieAf();
		}

	}

}
