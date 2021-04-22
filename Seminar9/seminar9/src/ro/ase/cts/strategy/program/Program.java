package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.Portofel;

public class Program {

	public static void main(String[] args) {
		Portofel portofel=new Portofel(300);
		Client Raluca=new Client(portofel,"Raluca");
		
		Raluca.platesteNota(200);
		Raluca.setStrategy(new Card());
		Raluca.platesteNota(110);
		
		Raluca.setStrategy(portofel);
		Raluca.platesteNota(200);
	}

}
