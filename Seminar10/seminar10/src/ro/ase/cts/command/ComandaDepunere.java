package ro.ase.cts.command;

public class ComandaDepunere extends Comanda{

	public ComandaDepunere(ContBancar cont, float suma) {
		super(cont, suma);
		
	}

	@Override
	public void executa() {
		super.getCont().depunere(super.getSuma());
		
	}

}
