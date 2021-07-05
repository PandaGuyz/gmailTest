package javaSnippet;

import java.util.ArrayList;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "assurecare";
		char c1[] = s1.toCharArray();
		
		int cnt =0;
		StringBuffer sb1 = new StringBuffer();
		for(int i =0;i<c1.length;i++)
		{
			for(int j = i+1; j<c1.length;j++) {
				if(c1[i] == c1[j]) {
					cnt ++;
					c1[j] =' ';
				}
			}
			//System.out.println("count "+cnt);
			//if((cnt == 0) && (c1[i] != ' ' ) ) {
			if(c1[i] != ' ' ) {
				sb1 = sb1.append(c1[i]);
			}
			
			cnt =0;
		}
		
		System.out.println(sb1);
			/*int j;
			for(j=0;i<c2.size();j++) {
				if(c1[i] == c2[j]) {
					flg='N';
					break;
				}
				
			}
			if(flg =='Y')
			c2[j] = c1[i];
			
		}
		String sb1 = c2.toString();
		System.out.println(sb1);*/
		
		

	}

}
