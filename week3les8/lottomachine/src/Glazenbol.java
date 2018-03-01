import java.util.Random;
import java.util.ArrayList;

public class Glazenbol {

	private ArrayList<Lottobal> ballen = new ArrayList<Lottobal>();

	public Glazenbol() {

	}

	public Lottobal schepBal() {

		Random r = new Random();
		int willekeurig = r.nextInt(ballen.size());

		return ballen.remove(willekeurig);

	}

	public void verzamelAlleBallen() {
		for (int i = 0; i < 45; i++) {

			ballen.add(new Lottobal(i+1));
		}
	}

}
