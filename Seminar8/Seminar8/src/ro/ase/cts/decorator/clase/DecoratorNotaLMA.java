package ro.ase.cts.decorator.clase;

public class DecoratorNotaLMA extends DecoratorAbstract{

	public DecoratorNotaLMA(NotaAbstracta nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}
	public void printeazaFelicitarea()
	{
		System.out.println("Felicitare la multi ani");
	}
	public void printeaza()
	{
		super.printeaza();
		System.out.println("la multi ani!");
	}
	
}
