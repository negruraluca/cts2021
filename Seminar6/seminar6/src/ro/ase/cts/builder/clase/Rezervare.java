package ro.ase.cts.builder.clase;

public class Rezervare {
	private boolean areMancareInclusa;
	private boolean areScaunErgnomic;
	private boolean areBauturaInclusa;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	public Rezervare(boolean areMancareInclusa, boolean areScaunErgnomic, boolean areBauturaInclusa,
			boolean areMuzicaAmbientala, String genMuzica, int codRezervare) {
		super();
		this.areMancareInclusa = areMancareInclusa;
		this.areScaunErgnomic = areScaunErgnomic;
		this.areBauturaInclusa = areBauturaInclusa;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [areMancareInclusa=");
		builder.append(areMancareInclusa);
		builder.append(", areScaunErgnomic=");
		builder.append(areScaunErgnomic);
		builder.append(", areBauturaInclusa=");
		builder.append(areBauturaInclusa);
		builder.append(", areMuzicaAmbientala=");
		builder.append(areMuzicaAmbientala);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append(", codRezervare=");
		builder.append(codRezervare);
		builder.append("]");
		return builder.toString();
	}
	public boolean isAreMancareInclusa() {
		return areMancareInclusa;
	}
	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}
	public boolean isAreScaunErgnomic() {
		return areScaunErgnomic;
	}
	public void setAreScaunErgnomic(boolean areScaunErgnomic) {
		this.areScaunErgnomic = areScaunErgnomic;
	}
	public boolean isAreBauturaInclusa() {
		return areBauturaInclusa;
	}
	public void setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
	}
	public boolean isAreMuzicaAmbientala() {
		return areMuzicaAmbientala;
	}
	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}
	public String getGenMuzica() {
		return genMuzica;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	public int getCodRezervare() {
		return codRezervare;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	
	
}
