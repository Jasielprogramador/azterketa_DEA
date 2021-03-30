package ariketa1;

public class nodoA {
	private Integer lerroa;
	private Integer zutabea;
	private Integer datua;
	private nodoA hurrengoa;
	
	public nodoA(Integer pLerroa, Integer pZutabea, Integer pDatua, nodoA pHurrengoa) {
		lerroa = pLerroa;
		zutabea = pZutabea;
		datua = pDatua;
		hurrengoa = pHurrengoa;
	}
	
	public Integer getLerroa() {
		return lerroa;
	}
	
	public Integer getZutabea() {
		return zutabea;
	}
	
	public Integer getDatua() {
		return datua;
	}
	
	public nodoA getHurrengoa() {
		return hurrengoa;
	}
}
