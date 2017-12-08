package org.siva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class malavikaBaloons {

	public static void main(String[] args) throws Exception, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noTS=Integer.parseInt(br.readLine());
		int count,length,out,bcount;
		for (int i=0;i<noTS;i++){
			String s = br.readLine();
			count=0;
			char[] ca = s.toCharArray();
			length=ca.length;
			for (char c:ca){if(c == 'a'){count++;}}
			bcount=length-count;
			out=(count>bcount)?bcount:count;
			System.out.println(out);
			
		}
	}

}
