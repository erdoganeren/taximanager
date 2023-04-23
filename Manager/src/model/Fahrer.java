package model;

public class Fahrer{
	String vorname; 
	String nachname; 
	float gewicht;
	
	public Fahrer(String vorname, String nachname, float gewicht) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.gewicht = gewicht;
	}
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public float getGewicht() {
		return gewicht;
	}
	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	} 
	
	
}
