package org.siva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

 public class VCS {

	public static void main(String[] args) throws Exception, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noTS=Integer.parseInt(br.readLine());
		int trAndIg,utrAndUig;
		for(int i=0;i<noTS;i++){
			String[] details = br.readLine().split(" ");
			int totalEntries = Integer.parseInt(details[0]);
			int[] ignoredList = stringArrayToIntArray(br.readLine().split(" "));
			int[] trackedList = stringArrayToIntArray(br.readLine().split(" "));
			
			boolean tracked,ignored;
			trAndIg=0;utrAndUig=0;
			for(int j=1;j<=totalEntries;j++){
				tracked=false;ignored=false;
				for (int ig : ignoredList){if (j>ig){continue;}else if (j==ig){ignored=true;break;}else{break;}}
				for (int tr : trackedList){if (j>tr){continue;}else if (j==tr){tracked=true;break;}else{break;}}
				if(tracked && ignored){trAndIg++;}
				if((!tracked) && (!ignored)){utrAndUig++;}
			}
			System.out.println(trAndIg+" "+utrAndUig);
			
		}
		
		
	}
	public static int[] stringArrayToIntArray(String[] arg){
		int stringArrayLength = arg.length;
		int[] intArray = new int[stringArrayLength];
		for(int i=0;i<stringArrayLength;i++){intArray[i]=Integer.parseInt(arg[i]);}
		return intArray;
		
	}

}
