package ro.acs.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSala implements Subiect{

	private List<Observer> clienti;
	private String numeSala;
	
	public ManagerSala( String numeSala) {
		super();
		this.clienti = new ArrayList<Observer>();
		this.numeSala = numeSala;
	}

	@Override
	public void adaugareAbonat(Observer observer) {
		
		clienti.add(observer);
	}

	@Override
	public void stergerAbonat(Observer observer) {
		clienti.remove(observer);
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		clienti.forEach(item->item.receptioneazaMesaj(mesaj));
		
	}

	public void trimiteAnuntImportant(String tipMeci)
	{
		trimiteMesaj("aSTAZI SE VA JUCA UN MECI DE "+ tipMeci);
	}
}
