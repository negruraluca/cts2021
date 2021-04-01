package ro.ase.cts.builder.clase;

public class RezervareBuilderV2 implements AbstractBuilder {
	private boolean areMancareInclusa;
	private boolean areScaunErgnomic;
	private boolean areBauturaInclusa;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	private int codRezervare;

	@Override
	public Rezervare build() {
		Rezervare rezervare=new Rezervare(areMancareInclusa,areScaunErgnomic,areBauturaInclusa,areMuzicaAmbientala,genMuzica,codRezervare);
		return null;
	}

	public RezervareBuilderV2() {
		this.areMancareInclusa=areMancareInclusa;
		this.areBauturaInclusa=areBauturaInclusa;
		this.areMuzicaAmbientala=areMuzicaAmbientala;
		this.areScaunErgnomic=areScaunErgnomic;
		this.codRezervare=codRezervare;
		this.genMuzica=genMuzica;
	}
	
	public RezervareBuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	public RezervareBuilderV2 setAreScaunErgnomic(boolean areScaunErgnomic) {
		this.setAreScaunErgnomic( areScaunErgnomic);
		return this;
	}
	public RezervareBuilderV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.setAreBauturaInclusa(areBauturaInclusa); 
		return this;
	}
	public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.setAreMuzicaAmbientala (areMuzicaAmbientala);
		return this;
	}
	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.setGenMuzica (genMuzica);
		return this;
	}
	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.setCodRezervare (codRezervare);
		return this;
	}
}
