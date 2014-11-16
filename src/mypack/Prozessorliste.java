package mypack;

public class Prozessorliste {
	
	private Prozessor[] MAXP;
	private int geringsteAuslastung = 0;
	private int hoechsteDauer = 0;
	private int kuerzesteDauer = 90;
	private int p;
	private Prozessor hilfe;
	private static int processor = 0;
	
	Prozessorliste(Prozessor[] MAXP) {
		this.MAXP = new Prozessor[MAXP.length];
		this.MAXP = MAXP;
	}

	 public void unsorted1 (int[] jobDauern) {
		for (int i = 0; i < jobDauern.length; i++) {
			p = kuerzesteDauer1();
			System.out.println("add " + jobDauern[i] + " zu prozessor " + p );
			MAXP[p].hinzufuegenJob(jobDauern[i]);
		}	
	}

	public int kuerzesteDauer1() {
			System.out.println("berechne kuerzesteDauer ----------------------");
			for (int i = 0; i < MAXP.length; i++) {
				 if (MAXP[i].berechneAktuelleDauer() == 0 ) {
					 //System.out.println("aktuelle dauer = 0");
					 return i;
				 } else if (MAXP[i].berechneAktuelleDauer() < kuerzesteDauer) {
					 System.out.println("aktuelle dauer " + MAXP[i].berechneAktuelleDauer() + " < " + kuerzesteDauer);
					 kuerzesteDauer = MAXP[i].berechneAktuelleDauer();
					 p = i;
				 }
			}
			System.out.println("hilfe gleich i: " + p);
			return p;
	}

	 
	public Prozessor kuerzesteDauer() {
		for (int i = 0; i < MAXP.length; i++) {
			 if (MAXP[i].berechneAktuelleDauer() == 0 ) {
				 hilfe = MAXP[i];
				 return hilfe;
			 } else if (MAXP[i].berechneAktuelleDauer() < kuerzesteDauer) {
				 hilfe = MAXP[i];
			 }
		}
		return hilfe;
	}
	 

	
	
	
	public void unsorted (int[] jobDauern) {
		for (int i = 0; i < jobDauern.length; i++) {
			
			 if (processor + 1 < MAXP.length) {
				System.out.println("prozessor: " + processor);
				if (MAXP[processor + 1].laengereDauer(MAXP[processor]) == true ) {
					MAXP[processor].hinzufuegenJob(jobDauern[i]);
				}
			//System.out.println("prozessor: " + MAXP[processor].getNr());
			//System.out.println("job: " + jobDauern[i]);
				if (processor < (MAXP.length - 1)) {
					processor++;
					System.out.println("prozessor: " + processor);
				} else {
					processor = 0;
				}
			} else {
				processor = 0;
			}
			
		//	System.out.println("prozessor: " + processor);
	//		System.out.println(processor);
		}
	}
	 
	public void ascending(int[] jobDauern, Prozessor[] MAXP) {
		java.util.Arrays.sort(jobDauern);
        for (int i = 0; i < jobDauern.length; i++) {
        	MAXP[processor].hinzufuegenJob(jobDauern[i]);
        	if (processor < (MAXP.length - 1)) {
				processor++;				
			} else {
				processor = 0;
			}
        }
    }
	
	public void descending(int[] jobDauern, Prozessor[] MAXP) {
		java.util.Arrays.sort(jobDauern);
		int[] copyJobDauern = new int[jobDauern.length];
		int j = 0;
		for ( int i = (jobDauern.length - 1); i > 0; i--) {
			copyJobDauern[j] = jobDauern[i];
			j++;
		} 
		jobDauern = new int[jobDauern.length + 1];
		jobDauern = copyJobDauern.clone();
      for (int i = 0; i < jobDauern.length; i++) {
        MAXP[processor].hinzufuegenJob(jobDauern[i]);
    	  if (processor < (MAXP.length - 1)) {
    	    processor++;				
    	  } else {
    		processor = 0;
		}
      }
	}
	
	public static void random(int[] jobDauern) {
		
	}
	
	
	public void resetAll (Prozessor[] MAXP) {
		for (int i = 0; i < MAXP.length; i++) {
			MAXP[i].reset();
		}
	}
	
	public int hoechsteDauer() {
		for (int i = 0; i < MAXP.length; i++) {
			if ( MAXP[i].berechneAktuelleDauer() > hoechsteDauer) {
				hoechsteDauer = MAXP[i].berechneAktuelleDauer();
			}
		}
		return hoechsteDauer;
	}
	/*
	public void kuerzesteDauer() {
		for (int i = 0; i < MAXP.length; i++) {
			//if ( MAXP[i] >)
		}
	}
	*/
	
	public int geringsteGesamtDauer(Prozessor[] MAXP) {
		int processorShort = 0;
		int shortestDurance = geringsteAuslastung;
		for (int i = 0; i < MAXP.length; i++) {
			if (MAXP[i].berechneAktuelleDauer() > 0) {
				//System.out.println("aktuelleDauer: " + MAXP[i].berechneAktuelleDauer() + " > shortestDur: " + shortestDurance);
				if (MAXP[i].berechneAktuelleDauer() < shortestDurance) {
					//System.out.println("kleiner " + shortestDurance);
					shortestDurance = MAXP[i].berechneAktuelleDauer();
					geringsteAuslastung = shortestDurance;
					processorShort = i;
				}
			} else {
				return processorShort = i;
			}
			geringsteAuslastung = shortestDurance;
		}
		return processorShort;
	}
	
	
	public Prozessor geringsteGesamtDauer() {
		Prozessor p = new Prozessor();
		int[] hilf = new int[MAXP.length];
		
		for (int i = 0; i < MAXP.length; i++) {
			hilf[i] = MAXP[i].berechneAktuelleDauer();
		}
		
		java.util.Arrays.sort(hilf);
		
		for (int i = 0; i < MAXP.length; i++) {
			if ( MAXP[i].berechneAktuelleDauer() == 0) {
				p = MAXP[i];
				return p;
			} else if (MAXP[i].berechneAktuelleDauer() == hilf[0]) {
				p = MAXP[i];
				return p;
			}
		}
		return p;
	}
	
	
}
 
