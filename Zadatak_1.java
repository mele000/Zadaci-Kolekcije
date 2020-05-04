package zadaci;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Zadatak_1 implements Serializable {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {

		ArrayList<String> aL = new ArrayList<>();
		Set<String> hS = new HashSet<>();
		Scanner unos = new Scanner(System.in);

		try {

			System.out.println("Unesite 1 ako ne zelite duplikate a 2 ako zelite");
			int izbor = unos.nextInt();

			File file = new File("C:\\Users\\Win7\\eclipse-workspace\\Projek_Treads\\file.txt");
			Scanner input = new Scanner(file);

			if (izbor == 1) {

				while (input.hasNext()) {
					String s = (String) input.next();
					aL.add(s);
				}

			} else if (izbor == 2) {

				while (input.hasNext()) {
					String s = (String) input.next();
					hS.add(s);
				}

			} else
				System.out.println("Niste unjeli tacan broj");

		} catch (InputMismatchException e) {
			System.out.println("Niste unjeli tacan broj");
		}
		System.out.println(aL);
		System.out.println(hS);

	}

}
