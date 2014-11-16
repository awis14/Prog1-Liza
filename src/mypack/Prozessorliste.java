package mypack;

public class Prozessorliste {
	
	private Prozessor[] MAXP;
	private int geringsteAuslastung;
	
	
	Prozessorliste(Prozessor[] MAXP) {
		this.MAXP = new Prozessor[MAXP.length];
	}
	
	
	public Prozessor geringsteGesamtDauer() {
		Prozessor p = new Prozessor();
		int[] hilf = new int[this.MAXP.length];
		
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
	
	
	public void unsorted (int[] jobDauern) {
		for (int i = 0; i < jobDauern.length; i++) {
			Prozessor p = geringsteGesamtDauer();
			p.addJob(jobDauern[i]);
		}	
	}
	
	public void ascending(int[] jobDauern) {
		for (int i = 0; i < jobDauern.length; i++) {
			
		}
	}
	
	public void descending(int[] jobDauern) {
		for (int i = 0; i < jobDauern.length; i++) {
			
		}
	}
	
	public void randomAlgo(int[] jobDauern) {
		for (int i = 0; i < jobDauern.length; i++) {
			
		}
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int processor = 0;

	
	public static void resetAll (Prozessor[] MAXP) {
		for (int i = 0; i < MAXP.length; i++) {
			MAXP[i].reset();
		}
	}
	/*
	public static int getProcessorShortest(Prozessor[] MAXP) {
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
			
	/*		
			if (shortestDurance <= MAXP[i].berechneAktuelleDauer()) {
				System.out.println("shortest dur: " + shortestDurance + " <= " + MAXP[i].berechneAktuelleDauer());
				
				processorShort = i;
			} else {
				shortestDurance = MAXP[i].berechneAktuelleDauer();
				System.out.println("shortest dur: " + shortestDurance + " <= " + MAXP[i].berechneAktuelleDauer());
			}
		}
		return processorShort;
	}
	*/
	/*
	public static void unsorted (int[] jobDauern, Prozessor[] MAXP) {
		int a = 0;
		for (int i = 0; i < jobDauern.length; i++) {
			a = getProcessorShortest(MAXP);
			MAXP[a].addJob(jobDauern[i]);
			
			
			/*if (processor + 1 < MAXP.length) {
				System.out.println("prozessor: " + processor);
				if (MAXP[processor + 1].laengereDauer(MAXP[processor]) == true ) {
					MAXP[processor].addJob(jobDauern[i]);
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
	
	public static void ascending(int[] jobDauern, Prozessor[] MAXP) {
		java.util.Arrays.sort(jobDauern);
        for (int i = 0; i < jobDauern.length; i++) {
        	MAXP[processor].addJob(jobDauern[i]);
        	if (processor < (MAXP.length - 1)) {
				processor++;				
			} else {
				processor = 0;
			}
        }
    }
	
	public static void descending(int[] jobDauern, Prozessor[] MAXP) {
		Prozessor.druckeKopfZeile(jobDauern);
		java.util.Arrays.sort(jobDauern);
		int[] copyJobDauern = new int[jobDauern.length];
		int j = 0;
		for ( int i = (jobDauern.length - 1); i > 0; i--) {
			copyJobDauern[j] = jobDauern[i];
			j++;
		} 
		jobDauern = new int[jobDauern.length + 1];
		jobDauern = copyJobDauern.clone();
	//	System.out.println("jobDauer lenght: " + jobDauern.length);
      for (int i = 0; i < jobDauern.length; i++) {
        MAXP[processor].addJob(jobDauern[i]);
    	  if (processor < (MAXP.length - 1)) {
    	    processor++;				
    	  } else {
    		processor = 0;
		}
      }
	}
	
	public static void random(int[] jobDauern) {
		
	}
	*/
}
