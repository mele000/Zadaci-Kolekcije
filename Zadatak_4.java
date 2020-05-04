package zadaci;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Zadatak_4 {

	public static void main(String[] args) {

		ArrayList<Integer> aL = new ArrayList<>();

		for (int i = 0; i < 500; i++) {
			aL.add(0);
		}

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 500; i++) {
			System.out.print(aL.get(i));
		}

		long endTime = System.currentTimeMillis();

		////////////////////////////////////////////

		LinkedList<Integer> lL = new LinkedList<>();

		for (int i = 0; i < 500; i++) {
			lL.add(0);
		}

		long startTime2 = System.currentTimeMillis();

		for (int y : lL) {
			System.out.print(y);
		}

		long endTime2 = System.currentTimeMillis();

		///////////////////////////////////////////

		ArrayList<Integer> aL2 = new ArrayList<>();

		for (int i = 0; i < 500; i++) {
			aL2.add(0);
		}

		long startTime3 = System.currentTimeMillis();

		for (int y : aL2) {
			System.out.print(y);
		}

		long endTime3 = System.currentTimeMillis();

		System.out.println();

		System.out.println("array lista u for petlji : " + (endTime - startTime));

		System.out.println("linked lista u for each petlji: " + (endTime2 - startTime2));

		System.out.println("array lista u for each petlji: " + (endTime3 - startTime3));

	}

}
