package Methods;

import java.util.Scanner;

public class Metodlarda_Parametre_Kullanimi {
	
	public static void selamlama(String isim) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ismin ne: ");
		isim = scanner.next();
		System.out.println("Selam, " + isim);
		
	}
	public static void main(String[] args) {
		String isim = "";
		selamlama(isim);
		selamlama(isim);
		
	}
	

}
