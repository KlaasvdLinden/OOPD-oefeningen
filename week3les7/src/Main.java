import processing.core.PApplet;

public class Main extends PApplet {
	public static void main(String[] args) {
		PApplet.main(new String[] { "Main" });
	}

	Teller eenTeller;
	
	public void settings() {
		size(400, 300);
	}

	public void setup() {

		background(255);
		
		eenTeller = new Teller(this, 60, 20, 20, 100, 80);
		eenTeller.setWaarde(8);
		eenTeller.tekenTeller();

	}



}
