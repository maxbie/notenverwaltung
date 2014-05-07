package pd;

public class Pruefung {
	private String datum;
	private double note;
	private boolean noteVorhanden;
	
	public Pruefung(String datum, double note){
		this.datum = datum;
		setNote(note);
	}
	public Pruefung(String datum){
		this.datum = datum;
		this.noteVorhanden = false;
	}
	public String getDatum(){
		return datum;
	}
	public double getNote(){
		return note;
	}
	public boolean getNoteVorhanden(){
		return noteVorhanden;
	}
	public void setNote(double n){
		if(!pruefeNote(n)){
			throw new IllegalArgumentException("Falsche Note");
		}
		note = n;
		noteVorhanden = true;
	}
	public String toString(){
		if(getNoteVorhanden()){
			return "Pruefung vom:\t" + getDatum() +
					"\nNote:\t\t" + getNote() + "\n";
		} else {
			return "Pruefung vom:\t" + getDatum() +
					"\nNote:\t\tkeine Note vorhanden" + "\n";			
		}
	}
	private boolean pruefeNote(double note){
		return note>=1.0 && note<=6.0;
	}
}
