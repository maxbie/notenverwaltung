package tester;

import pd.Student;
import pd.Fach;
//import pd.Pruefung;

public class StudentTester {
	
	public static void main(String[] args) {
		Student s = null;
		Fach f = null;
		//Pruefung p = null;


	
	s = new Student("Biedermann", "Max", "12.06.1976");
	System.out.println(s + "\n");
	
	f = s.neuesFach("Mathematik", 2);
	f.neuePruefung("1.1.2000", 4.0);
	System.out.println(s + "\n");
	
	f = s.neuesFach("Physik", 1);
	f.neuePruefung("2.2.2002", 6);
	System.out.println(s + "\n");

	//System.out.println(faecher);
}

}
