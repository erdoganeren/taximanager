package model;

public class Taxi extends Auto{
	String marke;
	int vorschaeden;
	
	public Taxi(String marke, int vorschaeden) {
		super(0);
		this.marke = marke;
		this.vorschaeden = vorschaeden;
	}
	
	public Taxi() {
		super(0);
	}

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
