package ro.acs.cts.observer.clase;

public interface Subiect {
	public void adaugareAbonat(Observer observer);
	public void stergerAbonat(Observer observer);
	public void trimiteMesaj(String mesaj);
	
}
