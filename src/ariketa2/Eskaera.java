package ariketa2;

public class Eskaera {
	
	private String kontainerKode;
	private int nasa;
	
	public Eskaera(String pKontainerKode, int pNasa) {
		kontainerKode = pKontainerKode;
		nasa = pNasa;
	}
	
	public String getKode() {
		return kontainerKode;
	}
	
	public int getNasa() {
		return nasa;
	}

}
