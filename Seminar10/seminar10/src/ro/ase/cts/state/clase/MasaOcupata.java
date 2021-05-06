package ro.ase.cts.state.clase;

public class MasaOcupata implements Stare{

	@Override
	public void modificareStare(Masa masa) {
		if(masa.getStareMasa() instanceof MasaOcupata)
		{
			System.out.println("masa "+masa.getNrMasa() +"nu se poate ocupa");
		}
		else
		{
			masa.setStareMasa(this);
			System.out.println("masa "+masa.getNrMasa() + " este trecuta in stare ocupata");
		}
	}
	
}
