package org.siva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopDevu {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int noE = Integer.parseInt(br.readLine());
	boolean[] houses;
	int count;
	for(int i=0;i<noE;i++){
		houses= new boolean[100];
		String[] data = br.readLine().split(" ");
		int copCapacity=Integer.parseInt(data[1])*Integer.parseInt(data[2]);
		String[] copHouses = br.readLine().split(" ");
		for (String copLocation:copHouses){
			int copID=Integer.parseInt(copLocation)-1;
			int lowerLimit = (copID-copCapacity>=0)?(copID-copCapacity):0;
			int upperLimit = (copID+copCapacity<100)?(copID+copCapacity):99;
			for (int j=lowerLimit;j<=upperLimit;j++){houses[j]=true;}

		}
		count=0;
		for (boolean eachHouse:houses){if(!eachHouse){count++;}}
		System.out.println(count);
		}
		
	}
	}


