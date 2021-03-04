package ro.ase.cts.program;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.clase.readers.*;
public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = AngajatReader.readAngajati("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
