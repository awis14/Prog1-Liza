package mypack;

public class Prozessor {
	
	private static int countProcessors = 0;
	private int auslastung = 0;
	private int nr;
	private int[] jobs;
	
	Prozessor () {
		this.jobs = new int[0];
		this.nr = countProcessors;
		countProcessors++;	
	}
	
	public int berechneAktuelleDauer () {
		for (int i = 0; i < this.jobs.length; i++) {
			this.auslastung = this.auslastung + jobs[i];
		}
		return this.auslastung;
	}
	
	public boolean laengereDauer (Prozessor p) {
		if (this.berechneAktuelleDauer() >= p.berechneAktuelleDauer()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void hinzufuegenJob (int neueJobdauer) {
		int newLength = this.jobs.length + 1;
		int[] copyJobs = new int[newLength];
		for (int i = 0; i < this.jobs.length; i++) {
			copyJobs[i] = jobs[i];
		}
		this.jobs = new int[newLength];
		copyJobs[newLength - 1] = neueJobdauer;
		this.jobs = copyJobs.clone();
	}
	
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
		System.out.println("Prozessor " + this.nr + ":" + druckeJobs(this.jobs) 
				          + "Gesamtdauer: " + berechneAktuelleDauer());
	}
	
	public void reset() {
		this.jobs = new int[0];
	}
	
}
