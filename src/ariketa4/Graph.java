package ariketa4;

import java.lang.reflect.Array;
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
        ArrayList<String> emaitza = new ArrayList<String>();

        aztertuGabeak.add(0);
        
        while(!aztertuGabeak.isEmpty()) {
        	Integer unekoa = aztertuGabeak.remove();

        	if(lag.size()==0) {
        		lag.add(true);
        	}
        	else {
        		lag.add(!maila);
        	}

            if (vertices[unekoa] == pelikula) {

                for (int i = 0; i < vertices.length; i++) {
                    if (adjMatrix[unekoa][i] == 1 && aztertuak[i] == false) {
                        aztertuGabeak.add(adjMatrix[unekoa][i]);
                        aztertuak[adjMatrix[unekoa][i]] = true;
                    }
                }
            }
        }

        for (int i = 0;i<lag.size();i++){
            if(lag.get(i) == true){
                emaitza.add(vertices[i]);
            }
        }
        return emaitza;
    }

    public ArrayList<String> lortuPelikulak2(String pelikula){
        ArrayList<Boolean> lag = new ArrayList<Boolean>();
        Queue<Integer> aztertuGabeak = new LinkedList<Integer>();
        boolean[] aztertuak = new boolean[numVertices];
        boolean maila = true;
        ArrayList<String> emaitza = new ArrayList<String>();
        aztertuGabeak.add(0);

        ArrayList<Integer> aktoreak = new ArrayList<Integer>();
        ArrayList<String> pelikulak = new ArrayList<String>();

        while(!aztertuGabeak.isEmpty()) {
            Integer unekoa = aztertuGabeak.remove();

            if (vertices[unekoa] == pelikula) {

                for (int i = 0; i < vertices.length; i++) {
                    if (adjMatrix[unekoa][i] == 1 && aztertuak[i] == false) {
                        aktoreak.add(i);
                        aztertuak[i] = true;
                    }
                }

                for (Integer akt : aktoreak) {
                    for (int i = 0; i < vertices.length; i++) {
                        if (adjMatrix[akt][i] == 1 && !aztertuak[i]) {
                            pelikulak.add(vertices[i]);
                            aztertuak[i] = true;
                        }
                    }
                }
            }
        }
        return pelikulak;

    }
}
