package mypack;

import java.lang.reflect.Array;

public class JobScheduling {

	public static void main(String[] args) {
		
		int[] jobDauern = new int[] {5, 3, 3, 4, 8, 3};
		
		Prozessor p0 = new Prozessor();
		Prozessor p1 = new Prozessor();
		Prozessor p2 = new Prozessor();
		
		Prozessor[] MAXP = new Prozessor[] {p0, p1, p2};
		
		Prozessorliste pListe = new Prozessorliste(MAXP);
		
		pListe.unsorted(jobDauern);
		for (int i = 0; i < MAXP.length; i++) {
			MAXP[i].druckeZeile();
		}
		System.out.println("laengste dauer");
		pListe.resetAll(MAXP);
		
		System.out.println("");

		
		
		pListe.ascending(jobDauern);
		for (int i = 0; i < MAXP.length; i++) {
			MAXP[i].druckeZeile();
		}
		System.out.println("laengste dauer");
		pListe.resetAll(MAXP);
		
		System.out.println("");
		
		
		
		pListe.descending(jobDauern);
		for (int i = 0; i < MAXP.length; i++) {
			MAXP[i].druckeZeile();
		}
		System.out.println("laengste dauer");
		pListe.resetAll(MAXP);
		
		System.out.println("");
		
		
		
		pListe.random(jobDauern);
		for (int i = 0; i < MAXP.length; i++) {
			MAXP[i].druckeZeile();
		}
		System.out.println("laengste dauer");
		System.out.println("");
		
		
		
		

	}

}
