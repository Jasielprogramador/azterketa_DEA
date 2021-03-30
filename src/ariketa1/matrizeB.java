package ariketa1;

public class matrizeB {
	
	private nodoE lehena;
	
	public matrizeB(nodoE pLehena) {
		lehena = pLehena;
	}
	
	public nodoE getLehena() {
		return lehena;
	}
	
	public matrizeB bihurtu(matrizeA m) {
		nodoE unekoE = new nodoE(null,null,null);
		matrizeB emaitza = new matrizeB(unekoE);
		
		nodoZ azkena = null;
		
		nodoA unekoA = m.getLehena();
		if(unekoA == null) {
			System.out.println("matrize hutsa");
		}
		else {
			while(unekoA != null) {
				if(unekoA.getDatua() == null | unekoA.getLerroa() == null | unekoA.getZutabea() == null) {
					System.out.println("balio hutsak daude matrizean");
				}
				else {
					if(emaitza.getLehena() == null) {
						nodoZ berriaZ = new nodoZ(null,null,null);
						unekoE.setErrenkada(unekoA.getLerroa());
						unekoE.setHurrengoa(null);
						unekoE.setUnekoa(berriaZ);
						berriaZ.setZutabea(unekoA.getZutabea());
						berriaZ.setDatua(unekoA.getDatua());
						berriaZ.setHurrengoa(null);
						
						azkena = berriaZ;

					}
					else {
						if(unekoA.getLerroa().compareTo(unekoE.getErrenkada()) == 0){
					
							nodoZ berriaZ = new nodoZ(null,null,null);
							azkena.setHurrengoa(berriaZ);
							berriaZ.setZutabea(unekoA.getZutabea());
							berriaZ.setDatua(unekoA.getDatua());
							berriaZ.setHurrengoa(null);
							
							azkena = berriaZ;
							
						}
						else if(unekoA.getLerroa().compareTo(unekoE.getErrenkada()) > 0) {
							nodoE berriaE = new nodoE(null,null,null);
							unekoE.setHurrengoa(berriaE);
							unekoE.setErrenkada(unekoA.getLerroa());
							unekoE.setHurrengoa(null);
							nodoZ berriaZ = new nodoZ(null,null,null);
							berriaE.setUnekoa(berriaZ);
							berriaZ.setZutabea(unekoA.getZutabea());
							berriaZ.setDatua(unekoA.getDatua());
							
							azkena = berriaZ;
						}
					}
				}
			}
		}
		return emaitza;
	}

}
