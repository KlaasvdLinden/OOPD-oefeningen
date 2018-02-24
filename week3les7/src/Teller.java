public class Teller {

	private int maximum;
	private int waarde;
	private float x, y, breedte, hoogte;
	private Main app;

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getBreedte() {
		return breedte;
	}

	public void setBreedte(float breedte) {
		this.breedte = breedte;
	}

	public float getHoogte() {
		return hoogte;
	}

	public void setHoogte(float hoogte) {
		this.hoogte = hoogte;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public Teller(Main p, int maximum, float x, float y, float breedte, float hoogte) {

		this.maximum = maximum;
		waarde = 0;
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
		app = p;
	}

	public void tik() {

		waarde = (waarde + 1) % maximum;
	}

	public String geefTijdNotatie() {

		if (waarde < 10) {

			return "0" + waarde;
		} else {

			return "" + waarde;
		}
	}

	public int getWaarde() {
		return waarde;
	}

	public void setWaarde(int waarde) {
		if (waarde >= 0 && waarde < maximum) {
			this.waarde = waarde;
		}

	}

	public void tekenTeller() {

		app.rectMode(app.CORNER);
		app.noStroke();
		app.fill(0);
		app.rect(x, y, breedte, hoogte);

		app.fill(255, 0, 0);
		app.textSize(hoogte);
		app.textAlign(app.LEFT);
		float verschuiving = (app.textAscent() - app.textDescent());
		app.text(geefTijdNotatie(), x, y + verschuiving);
	}

}
