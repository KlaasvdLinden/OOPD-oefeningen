import java.util.Collections;

import java.util.ArrayList;

public class Scorebord {

	private ArrayList<Lottobal> ballen = new ArrayList<Lottobal>();
	private Lottobal bonusBal;

	public Scorebord() {

	}

	public void plaatsBal(Lottobal bal) {

		this.ballen.add(bal);
	}

	public void plaatsBonusbal(Lottobal bal) {

		this.bonusBal = bal;
	}

	public void sorteerBallen() {


	}

	public void printScorebord() {

		for (Lottobal b : ballen) {

			System.out.print(b.getNummer() + "   ");
		}

		System.out.println("bonusgetal is: " + this.bonusBal.getNummer());
	}

	public void maakLeeg() {

		ballen.clear();
		this.bonusBal = null;
	}

}
