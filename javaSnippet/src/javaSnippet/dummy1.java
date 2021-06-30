package javaSnippet;

public class dummy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "ab12cd45h6";
System.out.println(s1.replaceAll("[^0-9]",""));
		
String s2[] = {"India","Canada","US","Aussie"};
System.out.println(s2.length);
System.out.println(s2[1]);

s1="India Canada US";
System.out.println(s1);
String[] s3 = s1.split(" ");
StringBuffer s4 =new StringBuffer();
for(int i = (s3.length)-1; i >=0; i--){
	s4 = s4.append(s3[i]).append(" ");
	}
s1=s4.toString();
System.out.println(s1);
	}
}
