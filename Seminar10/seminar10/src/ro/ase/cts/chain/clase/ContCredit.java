package ro.ase.cts.chain.clase;

public class ContCredit extends Cont {
	public ContCredit(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>suma)
		{
			System.out.println("ai platit cu contul credit");
			super.setSold(super.getSold()-suma);
		}
		else
		{
			if(super.getSuccesor()==null)
			{
				System.out.println("nu se poate efectua plata");
			}
			else
			{
				super.getSuccesor().plateste(suma);
			}
		}
		
	}
}
