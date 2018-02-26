import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> lijst = new ArrayList<String>();

		for (int i = 0; i < 4; i++) {
			lijst.add("element: " + i);
		}

		for (int i = lijst.size() - 1; i >= 0; i--) {
			String s = lijst.get(i);
			System.out.println(s);
			lijst.remove(s);
		}
	}

}
