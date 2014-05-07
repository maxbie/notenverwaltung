package pd;

import java.util.ArrayList; //NEU

public class Student {
	private String name;
	private String vorname;
	private String geburtsdatum;
	public ArrayList<Fach> faecher = null; //NEU

	// KONSTRUKTOR
	public Student(String n, String v, String g) {
		this.name = n;
		this.vorname = v;
		this.geburtsdatum = g;
		this.faecher = new ArrayList<Fach>(); //NEU
	}
	
	//NEU:
	public Fach neuesFach(String bezeichnung, int gewicht){
		Fach f = new Fach(bezeichnung, gewicht);
		faecher.add(f);
		return f;
	}
	// GET
	public int getAnzahlFaecher(){
		return faecher.size();
	}

	/*public double getNotenschnitt(){
		return notenschnitt();
	}*/


	public Fach getFach(String bezeichnung){
		for(Fach f : faecher ){
			if(f.getBezeichnung().equals(bezeichnung)){
				return f; // gefunden
			}
		}
		return null; // nicht gefunden
	}	

	
	//geklaut:
	public double getNotenschnitt(){
		double notenSumme = 0.0;
		int   notenAnzahl = 0;
		for(Fach f : faecher){
			if(f.getFachnote()!=0.0){
				notenSumme += f.getFachnote() * f.getGewicht();
				notenAnzahl += f.getGewicht();	
			}
		}
		if( notenAnzahl == 0 ){
			return 0.0f;
		} else {
			return notenSumme/notenAnzahl;
		}				
	}//:geklaut

	
	//:NEU

	
	// GET
	public String getName() {
		return name;
	}
	public String getVorname() {
		return vorname;
	}
	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	// SET
	public void setName(String name) {
		this.name = name;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	// TO STRING
	public String toString(){
		return "Student: \t\t" + getName() + " " + getVorname() +
		     "\nGeburtsdatum: \t\t" + geburtsdatum +
		     "\nAnzahl Faecher: \t" + getAnzahlFaecher() +
		     "\nNotenschnitt: \t\t" + getNotenschnitt();
}
		
}
