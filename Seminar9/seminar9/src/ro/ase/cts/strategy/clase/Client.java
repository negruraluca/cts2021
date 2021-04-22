package ro.ase.cts.strategy.clase;

public class Client {
	private Strategy strategy;
	private String numeClient;
	public Client(Strategy strategy, String numeClient) {
		super();
		this.strategy = strategy;
		this.numeClient = numeClient;
	}
	
	public void setStrategy(Strategy strategy)
	{
		this.strategy=strategy;
		
	}
	
	public void platesteNota(float suma)
	{
		System.out.println(numeClient+ "are de platit "+ suma +" lei ");
		strategy.realizeazaPlata(suma);
	
	}
}
