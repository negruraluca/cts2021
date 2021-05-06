package ro.ase.cts.command;

public class ContBancar {
	private String detinator;
	private float sold;
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}
	
	public void constituire(float suma)
	{
		sold=suma;
		System.out.println("s a constituit contul cu suma"+ suma);
	}
	public void retragere(float suma)
	{
		if(suma<=sold)
		{
			sold-=suma;
			System.out.println("s a retras suma de"+ suma);
		}
		else
		{
			System.out.println("fonduri insuficiente");
		}
	}
	public void depunere(float suma)
	{
		sold+=suma;
		System.out.println("s a depus suma "+suma);
	}
}
