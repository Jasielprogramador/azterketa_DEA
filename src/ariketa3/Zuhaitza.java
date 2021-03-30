package ariketa3;

import java.util.ArrayList;
import java.util.Arrays;

public class Zuhaitza {

	private BinaryTreeNode<Integer> root;
	
	public ArrayList<Integer> lortuZerrendaOrdenatua(){
		ArrayList<Integer> emaitza = new ArrayList<Integer>();
		
		if(root == null) {
			System.out.println("zuhaitz hutsa");
		}
		else {
			emaitza = lortuZerrenda(emaitza, root);
		}
		return emaitza;
	}

	private ArrayList<Integer> lortuZerrenda(ArrayList<Integer> emaitza, BinaryTreeNode<Integer> unekoa) {
		if(unekoa!=null) {
			for(int i=0;i<unekoa.getBalioak().length;i++) {
				emaitza = lortuZerrenda(emaitza, unekoa.getUmeak()[i]);
				emaitza.add(unekoa.getBalioak()[i]);
			}
			lortuZerrenda(emaitza, unekoa.getUmeak()[unekoa.getBalioak().length]);
		}
		return emaitza;
	}
}
