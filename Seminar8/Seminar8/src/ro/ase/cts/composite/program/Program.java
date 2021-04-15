package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.ComponentaMeniu;
import ro.ase.cts.composite.clase.Element;
import ro.ase.cts.composite.clase.Sectiune;

public class Program {

	public static void main(String[] args) throws Exception {
		ComponentaMeniu meniu=new Sectiune("meniu");
		ComponentaMeniu sectiuneBauturi=new Sectiune("bauturi");
		ComponentaMeniu sectiuneDesert=new Sectiune("desert");
		ComponentaMeniu elementCafea=new Element("cafea");
		ComponentaMeniu elementFrappe=new Element("frapper");
		ComponentaMeniu elementTiramisu=new Element("tiramisu");
		
		sectiuneBauturi.AdaugaNod(elementCafea);
		sectiuneBauturi.AdaugaNod(elementFrappe);
		sectiuneDesert.AdaugaNod(elementTiramisu);
		
		meniu.AdaugaNod(sectiuneDesert);
		meniu.AdaugaNod(sectiuneBauturi);
		
		meniu.printeaza();
		
		sectiuneBauturi.StergeNod(elementFrappe);
		sectiuneBauturi.AdaugaNod(elementFrappe);
		meniu.printeaza();
	}

}
