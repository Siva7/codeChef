package org.siva;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;


class ChefAndDigits {


	
	
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
		int one=0;
		int zero=0;
		char[] input =BR.readLine().toCharArray();
		if(input.length==1){System.out.println("Yes");return;}
		for(char j:input){if(j=='0'){zero++;}else{one++;}if(one>1 && zero>1){System.out.println("No");return;} }
		if(one == 0 || zero == 0){System.out.println("No");}
		else{System.out.println("Yes");};
	};
	

	
}
