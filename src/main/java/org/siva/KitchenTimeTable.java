package org.siva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KitchenTimeTable {

	public static void main(String[] args) throws Exception, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noTS = Integer.parseInt(br.readLine());
		int arrayLen,count;
		int[] timings,requirments;
		for (int i=0;i<noTS;i++){
			count=0;
			arrayLen=Integer.parseInt(br.readLine());
			timings=stringArrayToIntArray(br.readLine().split(" "));
			requirments=stringArrayToIntArray(br.readLine().split(" "));
			if (timings[0]>=requirments[0]){count++;}
			for (int j=1;j<arrayLen;j++){
				if (timings[j]-timings[j-1] >= requirments[j]){count++;}
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