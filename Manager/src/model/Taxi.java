package model;

public class Taxi {
	String marke;
	int vorschaeden;
	
	public Taxi(String marke, int vorschaeden) {
		super();
		this.marke = marke;
		this.vorschaeden = vorschaeden;
	}
	
	public Taxi() {}

	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public int getVorschaeden() {
		return vorschaeden;
	}
	public void setVorschaeden(int vorschaeden) {
		this.vorschaeden = vorschaeden;
	}
	
}
