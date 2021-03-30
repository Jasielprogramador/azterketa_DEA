package ariketa2;

import java.util.LinkedList;
import java.util.Queue;

public class Ontzia {

	private int mota;
	private String izena;
	private Queue<Eskaera> eskaerak = new LinkedList<Eskaera>();
	
	public Integer getMota() {
		return mota;
	}
	
	public Queue<Eskaera> getEskaerak(){
		return eskaerak;
	}
	
}
