package ro.ase.cts.flyweight.clase;

public class Rezervare {
	private int nrMasa;
	private int nrPers;
	private int oraRezervare;
	public Rezervare(int nrMasa, int nrPers, int oraRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPers = nrPers;
		this.oraRezervare = oraRezervare;
	}
	@Override
	public String toString() {
		return "Rezervare [nrMasa=" + nrMasa + ", nrPers=" + nrPers + ", oraRezervare=" + oraRezervare + "]";
	}
	
}
