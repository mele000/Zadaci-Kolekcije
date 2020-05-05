package zadaci;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Zadatak_5 {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {

		ArrayList<String> aL = new ArrayList<>();
		Set<String> hS = new HashSet<>();
		Scanner unos = new Scanner(System.in);

		File file = new File("C:\\Users\\Win7\\eclipse-workspace\\Kolekcije_Zadaca_Bild\\file.txt");
		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			String s = (String) input.next();
			aL.add(s);
		}

		hS.addAll(aL);

		System.out.println("Ukupan broj rijeci: " + aL.size());
		System.out.println("Broj unikata: " + hS.size());

		int brojac = 0;
		int brojac2 = 0;
		for (String string : aL) {
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
						|| string.charAt(i) == 'o' || string.charAt(i) == 'u') {
					brojac++;
				} else
					brojac2++;
			}

		}

		System.out.println("broj samoglasnika: " + brojac);
		System.out.println("broj suglasnika: " + brojac2);

	}

}
