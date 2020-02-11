package Methods;

public class Metodlarda_Return_Kullanimi {
	public static void toplama(int a, int b, int c) {
	
	System.out.println(a+b+c);
	//VOIRLE BISEY DONDUREMEZSIN	return (a+b+c);
	}//VOID DEGERSIZ BOS DEMEK
	public static int toplama1(int a,int b, int c) {
		return (a+b+c);
	}
	//RETURNU BASKA FONSIYONDA KULLANMAK ICIN KULLANIRIZ
	
	public static void main(String[] args) {
		//SOUT OLMADAN RETURN ÇIKMADI
		System.out.println("Çikti Degeri 	" + toplama1(1,2,3));
		

	}

}
