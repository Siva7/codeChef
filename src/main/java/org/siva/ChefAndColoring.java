package org.siva;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class ChefAndColoring {

	
	
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
	
	public static int[] getintArrayFromInputLine() throws IOException{
		return stringArrayToIntArray(BR.readLine().split(" "));
		
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
		int r=0,b=0,g=0;
		int length = Integer.parseInt(BR.readLine());
		for(char j:BR.readLine().toCharArray()){
			if(j=='R'){r++;}else if (j=='B'){b++;}
		}
		g=length-r-b;
		int result =(r>b)?((r>g)?r:g):((b>g)?b:g);
		System.out.println(length-result);
		
		
	}

	
}
