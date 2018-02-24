public class Klok {
	
	private Teller minutenTeller;
	private Teller urenTeller;

	private float hoogte, breedte;
	
	private Main app;

	public Klok(float x, float y, float breedte) {

		
		this.setBreedte(breedte);
		this.hoogte = breedte * 0.4f;
		urenTeller = new Teller(app, 24, x, y, breedte / 2, hoogte);
		minutenTeller = new Teller(app, 60, x + breedte / 2, y, breedte / 2, hoogte);
	}

	public void setTijd(int uren, int minuten) {

		urenTeller.setWaarde(uren);
		minutenTeller.setWaarde(minuten);
	}

	public void tekenKlok() {

		urenTeller.tekenTeller();
		minutenTeller.tekenTeller();
	}

	public void tik() {

		minutenTeller.tik();

		if (minutenTeller.getWaarde() == 0) {

			urenTeller.tik();

		}

	}

	public float getX() {
		return urenTeller.getX();
	}

	public void setX(float x) {
		urenTeller.setX(x);
		minutenTeller.setX(x + urenTeller.getBreedte());
	}

	public float getY() {
		return urenTeller.getY();
	}

	public void setY(float y) {
		urenTeller.setY(y);
		minutenTeller.setY(y + urenTeller.getHoogte());
	}

	public float getBreedte() {
		return breedte;
	}

	public void setBreedte(float breedte) {
		this.breedte = breedte;
	}
}
