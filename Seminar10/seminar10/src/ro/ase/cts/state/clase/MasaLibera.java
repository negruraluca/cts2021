package ro.ase.cts.state.clase;

public class MasaLibera implements Stare {

	@Override
	public void modificareStare(Masa masa) {
		if(masa.getStareMasa() instanceof MasaOcupata|| masa.getStareMasa() instanceof MasaRezervata )
		{
			System.out.println("masa "+masa.getNrMasa() +" trece in stare libera");
			masa.setStareMasa(this);
		}
		else
		{
			System.out.println("masa "+masa.getNrMasa() +" este deja libera ");
		}
	}

}
