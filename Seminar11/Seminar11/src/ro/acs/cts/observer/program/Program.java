package ro.acs.cts.observer.program;

import ro.acs.cts.observer.clase.Client;
import ro.acs.cts.observer.clase.ManagerSala;
import ro.acs.cts.observer.clase.Observer;

public class Program {

	public static void main(String[] args) {
		ManagerSala managerSala=new ManagerSala("sala nr 3");
		Observer client1=new Client("Raluca");
		Observer client2=new Client("Gabriela");
		Observer client3=new Client("Ion");
		
		managerSala.adaugareAbonat(client1);
		managerSala.adaugareAbonat(client2);
		managerSala.adaugareAbonat(client3);
		
		managerSala.trimiteAnuntImportant("fotbal");
		managerSala.stergerAbonat(client3);
		managerSala.trimiteAnuntImportant("handabl");

	}

}
