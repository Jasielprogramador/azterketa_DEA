package ariketa2;

import java.util.Queue;
import java.util.Stack;

public class Portua {
	private Stack<String> nasak[] ;
	
	public void portuaSimulatu(Queue<Ontzia> ontziak, int maxEskaera, int nasaKop) {
		
		nasak = new Stack[nasaKop];
		
		for(int i = 0;i<nasaKop;i++) {
			nasak[i] = new Stack<String>();		//n:nasaKopurua errekorritzen du hau hasieratzenko
		}
		
		for(int i = 0;i<ontziak.size();i++) {	//m:ontziak errekorritzen ditugu	
			Ontzia a = ontziak.remove();
			
			if(a.getMota().equals(0)) {
				
				for(int j = 0;j<maxEskaera;j++) {			//a:ontzia deskargakoa izatekotan bere eskaerak
															//errekorritzen ditugu
					Eskaera e = a.getEskaerak().remove();
					nasak[e.getNasa()].add(e.getKode());
				}
				
				if(a.getEskaerak().size() > maxEskaera) {
					ontziak.add(a);
				}
			}
			else {
				for(int j = 0;j<maxEskaera;j++) {			//b:ontzia kargakoa izatekotan bere eskaerak
															//errekorritzen ditugu
					Eskaera e = a.getEskaerak().remove();
					String kontainerKode = nasak[e.getNasa()].pop();
					
					if(kontainerKode.equals(e.getKode())) {
						for(int h = 0;h<nasak[0].size();h++) {       //c:0.garren nasan akumulatu ditugun 
																	//kodeak berriz bere lekuan jartzeko
							nasak[e.getNasa()].push(nasak[0].pop());
						}
					}
					else {
						nasak[0].add(kontainerKode);
					}	
				}
			}
		}
	}

}


//kostua = O(n+m*(a+(b*c))) kasu honetan kostua kuadratikoa izango litzateke
