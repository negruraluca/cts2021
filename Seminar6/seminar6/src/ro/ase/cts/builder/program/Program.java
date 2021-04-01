package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1=new RezervareBuilder().setCodRezervare(20)
													.setAreBauturaInclusa(true).build();

		Rezervare rezervare2=new RezervareBuilder().setCodRezervare(30)
				.setAreMuzicaAmbientala(true).setGenMuzica("pop").build();
	
	
	Rezervare rezervare3=new Rezervare(false,true,false,false,null,70);
	
	RezervareBuilder newBuilder=new RezervareBuilder().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgnomic(true);
	Rezervare rezervare4=newBuilder.setCodRezervare(100).build();
	Rezervare rezervare5=newBuilder.setCodRezervare(101).build();
	
	System.out.println(rezervare1);
	System.out.println(rezervare2);
	System.out.println(rezervare3);
	System.out.println(rezervare4);
	System.out.println(rezervare5);
	
	
	RezervareBuilderV2 builderV2=new RezervareBuilderV2().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgnomic(false);
	Rezervare rezervare6=newBuilder.setCodRezervare(80).build();
	Rezervare rezervare7=newBuilder.setCodRezervare(81).build();
	}

}
