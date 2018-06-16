package org.siva;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class MovieReview {

	
	
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
		int nofMoview = Integer.parseInt(BR.readLine());
		int[] movieLength = stringArrayToIntArray(BR.readLine().split(" "));
		int[] movieRating = stringArrayToIntArray(BR.readLine().split(" "));
		int maxMultiple=0;
		int maxRating=0;
		int maxIndex=0;
		for (int j=0 ;j<nofMoview;j++){
			int multiple = movieLength[j]*movieRating[j];
			if (multiple>maxMultiple){maxMultiple=multiple;maxRating=movieRating[j];maxIndex=j;}
			else if (multiple==maxMultiple){
				
				if(maxRating<movieRating[j]){
					
					maxRating=movieRating[j];maxIndex=j;
				}
				
			}
		}
		System.out.println(maxIndex+1);
		
		
		
	};
	

}
