package mypack;

import java.lang.reflect.Array;
import java.util.Random;

public class JobScheduling {
	
	public static void main(String[] args) {
		
		int[] jobDauern = new int[] {5, 3, 3, 4, 8, 3};
		/*
		jobDauern = new int[100];
		for (int i = 0; i < jobDauern.length; i++ ) {
			Random zufallsZahlenGenerator = new Random();
			int zufallsZahl = zufallsZahlenGenerator.nextInt(10);
			jobDauern[i] = zufallsZahl;
		}  
		 */

		
		Prozessor p0 = new Prozessor();
		Prozessor p1 = new Prozessor();
		Prozessor p2 = new Prozessor();
		/*
		 Prozessor p3 = new Prozessor();
		 Prozessor p4 = new Prozessor();
		 Prozessor p5 = new Prozessor();
		 Prozessor p6 = new Prozessor();
		 Prozessor p7 = new Prozessor();
		 Prozessor p8 = new Prozessor();
		 Prozessor p9 = new Prozessor();
		 */
		
		Prozessor[] MAXP = new Prozessor[] {p0, p1, p2};
		
		Prozessorliste pListe = new Prozessorliste(MAXP);
		
		pListe.unsorted1(jobDauern);
		System.out.println("Alorithmus: unsortiert");
		for (int i = 0; i < MAXP.length; i++) {
			MAXP[i].druckeZeile();
		}
		System.out.println("Laengste Gesamtdauer: " + pListe.hoechsteDauer());
		pListe.resetAll(MAXP);
		
		System.out.println("");

		
		//ascending
		pListe.ascending(jobDauern);
		
		for (int i = 0; i < MAXP.length; i++) {
			MAXP[i].druckeZeile();
		}
		System.out.println("Laengste Gesamtdauer: " + pListe.hoechsteDauer());
		pListe.resetAll(MAXP);
		
		System.out.println("");
		
		
		pListe.descending(jobDauern);
		for (int i = 0; i < MAXP.length; i++) {
			MAXP[i].druckeZeile();
		}
		System.out.println("Laengste Gesamtdauer: " + pListe.hoechsteDauer());
		pListe.resetAll(MAXP);
		
		System.out.println("");
		
		
/*		
		pListe.random(jobDauern);
		for (int i = 0; i < MAXP.length; i++) {
			MAXP[i].druckeZeile();
		}
		System.out.println("laengste dauer");
		System.out.println("");
		
		
		
	*/	

	}

}
