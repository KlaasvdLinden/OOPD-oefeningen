public class Studieadviseur {

	public static boolean krijgtPositiefStudieadvies(Student s) {
		 final int[] cijfers = s.getCijfers();
		 int aantalVoldoendes = 0;
		 boolean studieAdvies = false;
		 
		 for(int i=0; i<cijfers.length; i++) {
			 
			 if(cijfers[i] >=6) {
				 
				 aantalVoldoendes++;
			 }
		 }
		 
		 if(aantalVoldoendes >= 4) {
			 
			 studieAdvies = true;
		 }
		 
		 return studieAdvies;
		
	}
}
