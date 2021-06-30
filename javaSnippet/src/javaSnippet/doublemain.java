 package javaSnippet;

class consclass{
	consclass(int i){
		System.out.println(i);
	}
}
public class doublemain {
	
	static{
		System.out.println("static");
	}
	
	public static void main(String args[]){
		System.out.println("string");
		consclass c1= new consclass(1);
		//consclass c1= new consclass();
		
		String a1  = "shwetha";
		String a2 = "shwetha";
		String a3 = a1;
		if(a1.equals(a2)){
			System.out.println("equals");
		}
		if(a1==a2){
			System.out.println("equal symbol");
		}
		if(a1==a3){
			System.out.println("equal a3l");
		}
	}
	
	public static void main(Integer args[]){
		System.out.println("integer");
	}
	
}
