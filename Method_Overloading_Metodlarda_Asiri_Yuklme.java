package Methods;
public class Method_Overloading_Metodlarda_Asiri_Yuklme {
//ASIRI YUKLEME ANLAMINA GELIYOR
	//METHOD OVERLOADING YAPTIGIMIZI 1 DEN FAZLA KEZ KULLANABILIRIZ
	public static void topla(String a, String b) {
		System.out.println(a + "" + b);
		
	}
	public static void topla(int a,int b, int c) {
		System.out.println(a+b+c);
		
	}
	public static void topla(int a,int b) {
		System.out.println(a+b);
	}
	
	
	
	public static void main(String[] args) {

		topla(3, 4, 5);
		topla(2, 3);
		topla("Deneme", " Kaan");
	}

}
