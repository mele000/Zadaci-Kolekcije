package zadaci;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Zadatak_6 {

	public static void main(String[] args) throws IOException {

		ArrayList<String> aL = new ArrayList<>();
		ArrayList<String> aL2 = new ArrayList<>();
		ArrayList<Integer> aL3 = new ArrayList<>();

		Set<String> hS = new HashSet<>();
		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite rijec");
		String rijec = unos.next();

		File file = new File("C:\\Users\\Win7\\eclipse-workspace\\Kolekcije_Zadaca_Bild\\file.txt");
		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			String s = (String) input.next();
			aL.add(s);
		}

		System.out.println(aL);

		int brojac = 0;
		int brojac2 = 0;
		for (String string : aL) {
			if (string.equals(rijec)) {
				brojac++;
			} else
				brojac2++;

		}

		System.out.println(brojac);

		///////////////////////////////////////////
		FileReader fr = new FileReader(file);
		BufferedReader buf = new BufferedReader(fr);
		Collection<Integer> aL4 = new ArrayList<>();
		String aL5[] = new String[3];

		String line;
		int lineNumber = 0;

		while ((line = buf.readLine()) != null) {
			aL5 = null;

			aL5 = line.split("[ ]");

			lineNumber++;

			for (int i = 0; i < aL5.length; i++) {
				if (rijec.equals(aL5[i])) {
					aL4.add(lineNumber);

				}

			}
		}

		System.out.println(aL4);
	}

}
