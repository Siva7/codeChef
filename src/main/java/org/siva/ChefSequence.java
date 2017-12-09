package org.siva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ChefSequence {

	public static void main(String[] args) throws Exception, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noTS = Integer.parseInt(br.readLine());
		String seq,chefSeq;
		
		for (int i=0;i<noTS;i++){
			br.readLine();
			chefSeq=br.readLine();
			br.readLine();
			seq=br.readLine();
			if (chefSeq.contains(seq)){System.out.println("Yes");}else{System.out.println("No");}
			
		}
	}

}
