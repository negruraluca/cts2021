package ro.acs.cts.memento.program;

import ro.acs.cts.memento.clase.ManagerMemento;
import ro.acs.cts.memento.clase.MeciJucat;

public class Program {

	public static void main(String[] args) {
		MeciJucat meci1=new MeciJucat("afsdf", "dvd", 12, 3, 100, 3);
		ManagerMemento manager1=new ManagerMemento();
		manager1.adaugaMemento(meci1.creareMemento());
		
		meci1.setNumeGazda("echipa3");
		meci1.setNumeOaspete("gazda2");
		meci1.setNrBilete(4);
		meci1.setNrSpectatori(4);
		
		manager1.adaugaMemento(meci1.creareMemento());
		System.out.println(meci1.toString());
		meci1.setMememnto(manager1.getMemento(0));
		System.out.println(meci1.toString());
	}

}
