package ro.acs.cts.template.clase;

public class Spectator extends TemplateSpectator{

	private String nume;
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	
	@Override
	public void seAseazaLaCoada() {
		System.out.println("spectatorul "+nume+ " se aseaza la coada");
		
	}

	@Override
	public void prezintaBiletul() {
		System.out.println("spectatorul "+nume+" prezinta biletul");
		
	}

	@Override
	public void seFaceControlulCorporal() {
		System.out.println("spectatprul "+nume+" face conrolul corporal");
		
	}

	@Override
	public void ocupaLocul() {
	System.out.println(nume+ " ocupa locul");
		
	}
	
}
