package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
	//pentru ca nu avem atribute,putem face interfata
	protected String fileName;
	
	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
}
