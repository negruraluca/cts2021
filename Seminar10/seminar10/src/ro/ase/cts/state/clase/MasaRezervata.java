package ro.ase.cts.state.clase;

public class MasaRezervata implements Stare{

	@Override
	public void modificareStare(Masa masa) {
		if(masa.getStareMasa() instanceof MasaLibera)
		{
			System.out.println("masa "+masa.getNrMasa() +" trece in stare rezervata");
			masa.setStareMasa(this);
		}
		else
		{
			System.out.println("masa "+masa.getNrMasa() +" deja rezervata");
		}
	}

}
