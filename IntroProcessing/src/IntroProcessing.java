import processing.core.PApplet;

public class IntroProcessing extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] { "IntroProcessing" });
	}

	public void settings() {

		size(400, 400);

	}

	public void setup() {

		background(0);
		fill(255);
		rect(10, 10, 50, 50);

	}
}
