package mypack;

public class JobScheduling {

	/*public static void startScheduling (int numberOfProcessors, int numberOfJobs) {
		for (int i = 0; i < numberOfProcessors; i++) {
			Prozessor p = new Prozessor(i);
			System.out.println(p.nr);
		}
	}
		*/
	
	
	public static void main(String[] args) {
		
		//startScheduling(3, 6);
		//startScheduling(10, 100);
		
		int[] jobDauern = new int[] {5, 3, 3, 4, 8, 3};
		
		
		Prozessor p0 = new Prozessor();
		Prozessor p1 = new Prozessor();
		Prozessor p2 = new Prozessor();
		
		Prozessor[] MAXP = new Prozessor[] {p0, p1, p2};
		
		Prozessorliste pListe = new Prozessorliste(MAXP);
		
		pListe.unsorted(jobDauern);

		for (int i = 0; i < jobDauern.length; i++) {
			System.out.print(jobDauern[i] + " ");
		}
		
		System.out.println("");
		MAXP[0].druckeZeile();
		MAXP[1].druckeZeile();
		MAXP[2].druckeZeile();
		Prozessorliste.resetAll(MAXP);
		
		System.out.println("\n");
		/*
		pListe.ascending(MAXP);
		for (int i = 0; i < jobDauern.length; i++) {
			System.out.print(jobDauern[i] + " ");
		}
		System.out.println(" ");
		MAXP[0].druckeZeile();
		MAXP[1].druckeZeile();
		MAXP[2].druckeZeile();
		Prozessorliste.resetAll(MAXP);
		System.out.println("\n");
		Prozessorliste.descending(jobDauern, MAXP);
		System.out.println(" ");
		MAXP[0].druckeZeile();
		MAXP[1].druckeZeile();
		MAXP[2].druckeZeile();
		System.out.println("\n");
		Prozessorliste.resetAll(MAXP);
		
		*/
	}

}
