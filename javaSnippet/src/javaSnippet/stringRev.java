package javaSnippet;

public class stringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Pankaj";
		int i = str.length();
		while (i>0)
		{
			System.out.print(str.charAt(i-1));
			i--;
		}
		System.out.println();
		System.out.println(StingReplace());
	}
	
	public static String StingReplace()
	{
		String str = "This is String replacement program. StringBuffer or BuffStringChar";
		System.out.println("hello");
		String tobeRep = "String";
		String tobeRepWith = "letters";
		
		String[] str1=str.split(tobeRep);
		StringBuffer stb = new StringBuffer();
		for (int i=0;i<str1.length;i++){
			stb =stb.append(str1[i]);
			if(i!=str1.length -1){
			stb =stb.append(tobeRepWith);
			}
		}
		str=stb.toString();
		return str;
	}

}
