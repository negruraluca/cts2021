package ro.acs.cts.memento.clase;

public class MeciJucat {
	private String numeGazda;
	private String numeOaspete;
	private int nrSpectatori;
	private int nrBilete;
	private int nrSticle;
	private int nrJandarmi;
	public MeciJucat(String numeGazda, String numeOaspete, int nrSpectatori, int nrBilete, int nrSticle,
			int nrJandarmi) {
		super();
		this.numeGazda = numeGazda;
		this.numeOaspete = numeOaspete;
		this.nrSpectatori = nrSpectatori;
		this.nrBilete = nrBilete;
		this.nrSticle = nrSticle;
		this.nrJandarmi = nrJandarmi;
	}
	public String getNumeGazda() {
		return numeGazda;
	}
	public void setNumeGazda(String numeGazda) {
		this.numeGazda = numeGazda;
	}
	public String getNumeOaspete() {
		return numeOaspete;
	}
	public void setNumeOaspete(String numeOaspete) {
		this.numeOaspete = numeOaspete;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public int getNrBilete() {
		return nrBilete;
	}
	public void setNrBilete(int nrBilete) {
		this.nrBilete = nrBilete;
	}
	public int getNrSticle() {
		return nrSticle;
	}
	public void setNrSticle(int nrSticle) {
		this.nrSticle = nrSticle;
	}
	public int getNrJandarmi() {
		return nrJandarmi;
	}
	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [numeGazda=");
		builder.append(numeGazda);
		builder.append(", numeOaspete=");
		builder.append(numeOaspete);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrBilete=");
		builder.append(nrBilete);
		builder.append(", nrSticle=");
		builder.append(nrSticle);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
	public Memento creareMemento()
	{
		Memento memento=new Memento(numeGazda,numeOaspete,nrSpectatori);
		return memento;
	}
	public void setMememnto(Memento memento)
	{
		numeGazda=memento.getNumeGazda();
		numeOaspete=memento.getNumeOaspete();
		nrSpectatori=memento.getNrSpectatori();
	}
}
