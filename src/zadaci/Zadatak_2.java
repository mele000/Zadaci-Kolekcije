package zadaci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Zadatak_2 {

	public static void main(String[] args) {

		Set<Integer> hS = new HashSet<>();
		ArrayList<Integer> aL = new ArrayList<>();

		Scanner unos = new Scanner(System.in);

		System.out.println("Uneiste brojeve,0 prekida unos");
		int broj;
		do {
			broj = unos.nextInt();
			hS.add(broj);
		} while (broj != 0);

		aL.addAll(hS);

		try {
			System.out.println(
					"Unesite\n1 - ako hocete sortiati\n2 - ako hocte izmjesati\n3- ako hocete sortirati naopako");

			int izbor = unos.nextInt();

			if (izbor == 1) {

				Collections.sort(aL);
				System.out.println(aL);

			} else if (izbor == 2) {

				Collections.shuffle(aL);
				System.out.println(aL);

			} else if (izbor == 3) {

				Collections.reverse(aL);
				System.out.println(aL);

			} else
				System.out.println("Pogresan broj...");

		} catch (InputMismatchException e) {
			System.out.println("Pogresan broj..");
		}

	}

}
