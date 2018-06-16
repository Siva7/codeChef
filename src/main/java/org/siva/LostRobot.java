package org.siva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class LostRobot {
	private static BufferedReader BR;
	private static int NOTS=0;
	public static void setBRandNOTS() throws NumberFormatException, IOException{
		 BR = new BufferedReader(new InputStreamReader(System.in));
		NOTS = Integer.parseInt(BR.readLine());
	}
	
	public static int[] stringArrayToIntArray(String[] arg){
		int stringArrayLength = arg.length;
		int[] intArray = new int[stringArrayLength];
		for(int i=0;i<stringArrayLength;i++){intArray[i]=Integer.parseInt(arg[i]);}
		return intArray;
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		setBRandNOTS();
		
		IntStream.range(0,NOTS).forEach(i->{
			try {
				doSomething(i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		BR.close();
	
	}
	
	public static void doSomething(int i) throws IOException{
		String line = BR.readLine();
		String[] coord = line.split(" ");
		int[] intCoord = stringArrayToIntArray(coord);
		int x1 = intCoord[2]-intCoord[0];
		int y1 = intCoord[3]-intCoord[1];
		if (x1!=0 && y1!=0){System.out.println("sad");}
		else if (x1>0){System.out.println("right");}
		else if (x1<0){System.out.println("left");}
		else if (y1>0){System.out.println("up");}
		else {System.out.println("down");}
	};
	
}
