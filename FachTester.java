package tester;

import pd.Fach;
import pd.Pruefung;

public class FachTester {

	public static void main(String[] args) {
		Fach f = null;
		try {
			f = new Fach("Mathe", 1);
			System.out.println(f);
			f.neuePruefung("2.2.2000");
			System.out.println(f);
			f.neuePruefung("3.3.2000", 5.0);
			System.out.println(f);			
			f.neuePruefung("4.4.2000", 4.0);
			System.out.println(f);	
			
			// wie kann ich hier der Prueefung 2.2.2000 eine Note geben
			Pruefung p = f.getPruefung("2.2.2000");
			if(p==null){
				System.out.println("Pruefung nicht gefunden!");
			} else {
				p.setNote(1.0);
			}
			//System.out.println(f);	
			
		} catch(IllegalArgumentException e){
			System.out.println("Falsches Argument " + e);
		}
		

	}

}
