import java.util.ArrayList;

import processing.core.PApplet;

public class main extends PApplet {

	public static void main(String[] args) {
		PApplet.main("main");

	}

	ArrayList<Radioknop> radioknoppen = new ArrayList<Radioknop>();

	private int w = 400;
	private int h = 400;
	private int d = 50;
	private int x = 50;
	private int y = 50;

	public void settings() {

		size(w, h);
	}

	public void setup() {

		radioknoppen.add(new Radioknop(this, x, y, d, d));
		radioknoppen.add(new Radioknop(this, x * 2 + d, y, d, d));
		radioknoppen.add(new Radioknop(this, x * 4 + d, y, d, d));

	}

	public void draw() {

		background(0);

		for (Radioknop k : radioknoppen) {
			k.tekenKnop();

		}

	}

	public void mousePressed() {
		for (Radioknop k : radioknoppen) {
			if (k.isMuisOverKnop()) {
				for (Radioknop rk : radioknoppen) {

					rk.zetUit();

				}
				k.handelInteractieAf();

			}

		}
	}

}
