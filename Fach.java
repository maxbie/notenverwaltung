package pd;

import java.util.ArrayList;

public class Fach {
	private String bezeichnung;
	private int gewicht;
	private ArrayList<Pruefung> pruefungen = null;
	
	
	// KONSTRUKTOR
	public Fach(String bezeichnung, int gewicht){
		if(!pruefeGewicht(gewicht)){
			throw new IllegalArgumentException("Falsches Gewicht");
		}
		this.bezeichnung = bezeichnung;
		this.gewicht = gewicht;
		this.pruefungen = new ArrayList<Pruefung>();
	}
	public void neuePruefung(String datum){
		Pruefung p = new Pruefung(datum);
		pruefungen.add(p);
	}
	public void neuePruefung(String datum, double note){
		Pruefung p = new Pruefung(datum, note);
		pruefungen.add(p);
	}
	public int getAnzahlPruefungen(){
		return pruefungen.size();
	}
	/*public double getFachnote2(){
		double notenSumme  = 0.0;
		int    notenAnzahl = 0;
		for(int i=0; i<getAnzahlPruefungen();++i){
			Pruefung p = pruefungen.get(i);
			if(p.getNoteVorhanden()){
				notenSumme += p.getNote();
				notenAnzahl++;
			}
		}
		if(notenAnzahl == 0){
			return 0.0;
		} else {
			return notenSumme/notenAnzahl;
		}
	}*/
	public double getFachnote(){
		double notenSumme  = 0.0;
		int    notenAnzahl = 0;
		for(Pruefung p : pruefungen){
			if(p.getNoteVorhanden()){
				notenSumme += p.getNote();
				notenAnzahl++;
			}			
		}		
		if(notenAnzahl == 0){
			return 0.0;
		} else {
			return notenSumme/notenAnzahl;
		}
	}
	public Pruefung getPruefung(String datum){
		for(Pruefung p : pruefungen ){
		//	if(p.getDatum() == datum){ // funktioniert nur zufällig
			if(p.getDatum().equals(datum)){
				return p; // gefunden
			}
		}
		return null; // nicht gefunden
	}	
	public String getBezeichnung(){
		return bezeichnung;
	}
	public int getGewicht(){
		return gewicht;
	}
	public String toString(){
		return "FACH:\t\t\t" + getBezeichnung() +
			   "\nGewicht:\t\t" + getGewicht() +
			   "\nAnzahl Pruefungen: \t" + getAnzahlPruefungen() +
			   "\nFachnote:         \t" + getFachnote() + "\n";
	}
	private boolean pruefeGewicht(int gewicht){
		return gewicht>0;
	}

}
