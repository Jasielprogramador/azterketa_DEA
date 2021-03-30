package ariketa4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    protected int numVertices;
    protected Integer[][] adjMatrix;
    protected String[] vertices;

    public ArrayList<String> lortuPelikulak(String pelikula){
    	
        ArrayList<Boolean> lag = new ArrayList<Boolean>();
        Queue<Integer> aztertuGabeak = new LinkedList<Integer>();
        boolean[] aztertuak = new boolean[numVertices];
        boolean maila = true;
        
        while(!aztertuGabeak.isEmpty()) {
        	Integer unekoa = aztertuGabeak.remove();
        	if(lag.size()==0) {
        		lag.add(true);
        	}
        	else {
        		lag.add(!maila);
        	}
        	
        	for(int i = 0;i<vertices.length;i++) {
        		if(adjMatrix[unekoa][i]==1 && aztertuak[i] == false) {
        			
        		}
        	}
        }
        
    }
}
