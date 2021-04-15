package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements NotaAbstracta{
	private NotaAbstracta nota;

	@Override
	public void printeaza() {
		// TODO Auto-generated method stub
		nota.printeaza();
		
	}
	
	public DecoratorAbstract(NotaAbstracta nota) {
		super();
		this.nota = nota;
	}
	public abstract void printeazaFelicitarea();
}
