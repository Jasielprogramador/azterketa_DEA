package ariketa1;

public class nodoE {
	
	private Integer errenkada;
	private nodoE hurrengoa;
	private nodoZ unekoa;
	
	public nodoE(Integer pErrenkada, nodoE pHurrengoa, nodoZ pUnekoa) {
		errenkada = pErrenkada;
		hurrengoa = pHurrengoa;
		unekoa = pUnekoa;
	}
	
	public void setErrenkada(Integer e) {
		errenkada = e;
	}
	
	public void setHurrengoa(nodoE h) {
		hurrengoa = h;
	}
	
	public void setUnekoa(nodoZ u) {
		unekoa = u;
	}
	
	public Integer getErrenkada() {
		return errenkada;
	}

}
