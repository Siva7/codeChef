package org.siva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

 public class modDistance {

	public static void main(String[] args) throws Exception, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noTS = Integer.parseInt(br.readLine());
		int nofCases,tmp;
		for (int i=0;i<noTS;i++){
				nofCases=Integer.parseInt(br.readLine());
				tmp=1;br.readLine();
				for(int j=2;j<=nofCases;j++){br.readLine();tmp=tmp^j;}
				System.out.println(tmp);
		}
	}

}
