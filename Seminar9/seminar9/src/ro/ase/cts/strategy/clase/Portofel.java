package ro.ase.cts.strategy.clase;

public class Portofel implements Strategy {
	private float sumaDisponibila;
	
	public Portofel(float sumaDisponibila) {
		super();
		this.sumaDisponibila = sumaDisponibila;
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(sumaDisponibila>=suma) {
			System.out.println("Tranzactia a fost efectuata cash pentur suma de "+suma);
			sumaDisponibila-=suma;
		}
		else
		{
			System.out.println("fonduri insuficiente");
		}
	}

}
