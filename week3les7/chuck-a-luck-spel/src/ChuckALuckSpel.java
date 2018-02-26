public class ChuckALuckSpel {
	private int geluksGetal, saldo, inzet, ronde;
	private Dobbelbeker dobbelBeker;

	public ChuckALuckSpel(int saldo) {
		this.saldo = saldo;
		dobbelBeker = new Dobbelbeker(3);
	}

	public void speelRonde(int geluksGetal, int inzet) {
		this.geluksGetal = geluksGetal;
		int komtVoor = 0;
		ronde++;
		for (int i = 0; i < dobbelBeker.ds.length; i++) {
			if (dobbelBeker.ds[i].getLaatstGedobbeld() == geluksGetal) {
				komtVoor++;

			}

		}
		switch (komtVoor) {
		case 0:
			saldo = saldo - inzet;
			break;
		case 1:
			break;
		case 2:
			saldo = saldo + (inzet * 2);
			break;
		case 3:
			saldo = saldo + (inzet * 10);
		}
	}

	public String toString() {

		String Worp = dobbelBeker.toString();
		return "Ronde: " + ronde + "\n" + "Geluksgetal:" + geluksGetal + "\n" + "Worp is: " + Worp + "\n"
				+ "Uw saldo is: " + saldo;
	}

}
