package javaSnippet;

import java.util.HashMap;

public class swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = 3;
		a=b+a;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		//prime or not
		int i = 20;
		if((i==0) || (i==1)){
			System.out.println("not a prime");
		}
		for (int j=2;j<i/2;j++){
			if(i%j == 0){
				System.out.println("not a prime");
				break;
			}
			j++;
		}
		
		//fibonacci series
		//011235813
		 i = 0;
		int j=1;
		int k=5;
		int l =0;
		System.out.print(i);
		System.out.print(j);
		while(k>=0){
			l=i+j;
			System.out.print(l);
			i=j;
			j=l;
			k--;
		}
		System.out.println();
		
		//second largest number in an array
		int max;
		int max2;
		int numArr[]={67,98,23,76,22,9,23,32};
		if(numArr[0]>numArr[1]){
			 max=numArr[0];
			 max2=numArr[1];
		}else
		{
			
			 max2=numArr[0];
			 max=numArr[1];
		}
		
		for(i=2;i<numArr.length;i++){
			if(numArr[i]>max){
				max=numArr[i];
				max2=max;
			}
			else
			{
				if(numArr[i]>max2){
					max2=numArr[i];
				}
			}
		}
		
		System.out.println(max+","+max2);
		
		//armstrong number 
		//123 : 1*1*1 + 2*2*2 + 3*3*3
		//1234: 1*1*1*1 + 2*2*2*2 + 3*3*3*3 + 4*4*4*4
		
		i = 1234;
		System.out.println(Integer.toString(i).length());
		j=Integer.toString(i).length();
		
		//while(j>0){
		j=10*j;
		a=i%j;
		i=i/j;
		System.out.println(a +" "+i);
		j=(j/10)-1;
		//}
		System.out.println(j);
	}

}
