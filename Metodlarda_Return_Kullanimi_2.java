package Methods;

public class Metodlarda_Return_Kullanimi_2 {
	public static int ikiilecarp(int a) {
	
	return a * 2;
	}
	public static int ikiiletopla(int a) {
	
	return a + 2;
	}
	public static int dortlecarp(int a) {
	
	return a * 4;
	}
	public static void main(String[] args) {
		
	System.out.println(dortlecarp(ikiiletopla(ikiilecarp(8))));
		//METHODLARI BIRBIRINE RETURN YOLLADIK
		//RETURN  SON KODUR . RETURNUN ALTINDAKI HICBISEY ÇALISMAZ
	}

}
