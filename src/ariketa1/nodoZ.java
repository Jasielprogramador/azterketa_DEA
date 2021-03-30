package ariketa1;

public class nodoZ {
	
	private Integer zutabea;
	private Integer datua;
	private nodoZ hurrengoa;
	
	public nodoZ(Integer pZutabea, Integer pDatua, nodoZ pHurrengoa) {
		zutabea = pZutabea;
		datua = pDatua;
		hurrengoa = pHurrengoa;
	}
	
	public void setZutabea(Integer z) {
		zutabea = z;
	}
	public void setDatua(Integer d) {
		datua = d;
	}
	
	public void setHurrengoa(nodoZ h) {
		hurrengoa = h;
	}
}
