public class MainApp {
	public static void main(String[] args) {
		Student s1 = new Student("han");
		Student s2 = new Student("ica");
		System.out.println("Nummer s1: " + s1.getNummer());
		System.out.println("Nummer s2: " + s2.getNummer());
		System.out.println("Totaal aantal studenten: " + Student.getNStudenten());

		s1.setGeslacht("wadawkjd");
		System.out.println("Test 1: " + s1.getGeslacht());
		
		s1.setGeslacht("m");
		System.out.println("Test 2: " + s1.getGeslacht());

		s1.setGeslacht("man");
		System.out.println("Test 3: " + s1.getGeslacht());

		s1.setGeslacht(Student.MAN);
		System.out.println("Test 4: " + s1.getGeslacht());
	}
}
