package tester;

import pd.Pruefung;

public class PruefungTester {
	public static void main(String[] args) {
		Pruefung p = null;
		try {
			p = new Pruefung("1.1.2000");
			System.out.println(p);
			//p.setNote(5.5);
			p = new Pruefung("2.2.2002", 4.5);
			System.out.println(p);
			p = new Pruefung("3.3.2003", 5.5);
			System.out.println(p);
		} catch(IllegalArgumentException e){
			System.out.println("Falsches Argument " + e);
		}
		//System.out.println(p);		
	}

}
