package zadaci;

import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Zadatak_3 {

	public static void main(String[] args) {

		Set<Integer> hS = new HashSet<>();
		ArrayList<Integer> aL = new ArrayList<>();

		Scanner unos = new Scanner(System.in);

		System.out.println("Uneiste brojeve,0 prekida unos");
		int broj;
		do {
			broj = unos.nextInt();
			hS.add(broj);
			aL.add(broj);
		} while (broj != 0);

		try {
			System.out.println("Unesite\n1 - ako hocete zbir svih brojeva " + "\n2 - ako hocte prosjek"
					+ "\n3- ako hocete zbir : unesite da vidite opcije" + "\n4 - ako hocete sve unikatne brojeve"
					+ "\n5 - ako hocete sve brojeve koje se ponavljaju");

			int izbor = unos.nextInt();

			if (izbor == 1) {

				int sum = 0;
				for (int i : aL) {
					sum += i;
				}
				System.out.println(sum);

			} else if (izbor == 2) {

				int sum = 0;
				double prosjek = 0;

				if (aL.isEmpty() == false) {

					for (int i : aL) {
						sum += i;
					}
					prosjek = sum / aL.size();
				}
				System.out.println(prosjek);

			} else if (izbor == 3) {
				System.out.println("Unesite\n1 - ako hocete zbir svih brojeva parnih" + "\n2 - ako hocte zbir neparnih"
						+ "\n3- ako hocete zbir brojeva na parnim pozicijama"
						+ "\n4 - ako hocete zbir na neparnim pozicijama");

				int izbor2 = unos.nextInt();
				if (izbor2 == 1) {

					int sum = 0;

					for (int i : aL) {
						if (i % 2 == 0) {
							sum += i;
						}
					}

					System.out.println(sum);

				} else if (izbor2 == 2) {

					int sum = 0;

					for (int i : aL) {
						if (i % 2 != 0) {
							sum += i;
						}
					}
					System.out.println(sum);

				} else if (izbor2 == 3) {

					int sum = 0;
					int brojac = 0;

					for (int i : aL) {
						if (brojac % 2 == 0) {
							sum += i;
						}
						brojac++;
					}
					System.out.println(sum);

				} else if (izbor2 == 4) {

					int sum = 0;
					int brojac = 0;

					for (int i : aL) {
						if (brojac % 2 != 0) {
							sum += i;
						}
						brojac++;
					}
					System.out.println(sum);

				} else
					System.out.println("Pogresan broj...");

			} else if (izbor == 4) {

				System.out.println(hS);

			} else if (izbor == 5) {

				Set<Integer> unikati = new HashSet<>();
				ArrayList<Integer> duplikati = new ArrayList<>();
				for (int n : aL) {
					if (!unikati.add(n)) {
						duplikati.add(n);
					}
				}
				System.out.println(duplikati);

			} else
				System.out.println("Pogresan broj...");

		} catch (InputMismatchException e) {
			System.out.println("Pogresan broj..");
		}

	}

}
