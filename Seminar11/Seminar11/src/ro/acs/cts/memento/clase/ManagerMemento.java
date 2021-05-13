package ro.acs.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> mementos=new ArrayList<Memento>();
	public void adaugaMemento(Memento memento)
	{
		mementos.add(memento);
	}
	public Memento getMemento(int pos)
	{
		if(pos>=0 && mementos.size()>=pos)
		{return mementos.get(pos);}
		else
		{
			throw new IllegalArgumentException("pozitia nu e valida");
		}
	}
}
