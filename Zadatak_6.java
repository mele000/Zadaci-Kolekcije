package zadaci;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
		
		File file = new File("C:\\Users\\Win7\\eclipse-workspace\\Projek_Treads\\file.txt");
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

		
		
	
		

		
		
		
		


	}

}
