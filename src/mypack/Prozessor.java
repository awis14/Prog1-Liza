package mypack;

public class Prozessor {
	
	private static int countProcessors = 0;
	private static int geringsteAuslastung = 0;
	private int nr;
	private int[] jobs;
	
	Prozessor () {
		this.jobs = new int[0];
		this.nr = countProcessors;
		countProcessors++;	
	}
	
	public int berechneAktuelleDauer () {
		int aktDauer = 0;
		for (int i = 0; i < this.jobs.length; i++) {
			aktDauer = aktDauer + jobs[i];
		}
		return aktDauer;
	}
	
	public int getNr () {
		return nr;
	}
	
	public int berechneGesamtDauer(int[] jobs) {
		int gesamtdauer = 0;
		for (int i = 0; i < jobs.length; i++) {
			gesamtdauer = gesamtdauer + jobs[i];
		}
		return gesamtdauer;
	}
	
	public boolean laengereDauer (Prozessor p) {
		if (this.berechneAktuelleDauer() >= p.berechneAktuelleDauer()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addJob (int newJobTime) {
		int newLength = this.jobs.length + 1;
		int[] copyJobs = new int[newLength];
		for (int i = 0; i < this.jobs.length; i++) {
			copyJobs[i] = jobs[i];
		}
		this.jobs = new int[newLength];
		copyJobs[newLength - 1] = newJobTime;
		this.jobs = copyJobs.clone();
	}
	
	/*
	public static Prozessor compProcessor(Prozessor[] MAXP) {
		for (int i = 0; i < MAXP.length; i++) {
			if ( MAXP[i].berechneAktuelleDauer() <= geringsteAuslastung ) {
				System.out.println(MAXP[i].berechneAktuelleDauer() + " <= " + geringsteAuslastung );
				geringsteAuslastung = MAXP[i].berechneAktuelleDauer();
				return MAXP[i];
			}
		}
		return MAXP[0];
	}
	*/
	
	public String druckeJobs(int[] jobs) {
		String jobString = " ";
		for (int i = 0; i < jobs.length; i++) {
			jobString = jobString + jobs[i] + " ";
		}
		return jobString;
	}
	
	public static void druckeKopfZeile(int[] jobDauern) {
		for (int i = 0; i < jobDauern.length; i++) {
			System.out.print(jobDauern[i] + " ");
		}
	}
	
	public void druckeZeile() {
		System.out.println("Prozessor " + this.nr + ":" + druckeJobs(jobs) 
				          + "Gesamtdauer: " + berechneGesamtDauer(jobs));
	}
	
	public void reset() {
		this.jobs = new int[0];
	}
	
}
