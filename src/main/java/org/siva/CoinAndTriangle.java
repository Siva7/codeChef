package org.siva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CoinAndTriangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noTS=Integer.parseInt(br.readLine());
		for(int i=0;i<noTS;i++){
			int n=Integer.parseInt(br.readLine());
			int j=1;
			while((j*(j+1))/2 <= n){j++;}
			System.out.println(j-1);
		}
		br.close();
	}

}
