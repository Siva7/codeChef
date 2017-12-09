package org.siva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChefAndSequence {

	public static void main(String[] args) throws Exception, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noTS = Integer.parseInt(br.readLine());
		int arrayLength,count,sum,product;
		int[] intArray;
		
		for (int i=0;i<noTS;i++){
			count=0;
			arrayLength=Integer.parseInt(br.readLine());
			intArray=stringArrayToIntArray(br.readLine().split(" "));
			for(int j=0;j<arrayLength;j++){
				sum=0;
				product=1;
				for(int k=j;k<arrayLength;k++){
					sum+=intArray[k];
					product*=intArray[k];
					if (sum == product){count++;}
					
				}
			}
			
			System.out.println(count);
		}
	}
	
	public static int[] stringArrayToIntArray(String[] arg){
		int stringArrayLength = arg.length;
		int[] intArray = new int[stringArrayLength];
		for(int i=0;i<stringArrayLength;i++){intArray[i]=Integer.parseInt(arg[i]);}
		return intArray;
		
	}

}

