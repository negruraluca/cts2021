package ro.ase.cts.composite.clase;

public class Element implements ComponentaMeniu{

	private String numeElement;
	
	@Override
	public void AdaugaNod(ComponentaMeniu componentaMeniu) throws Exception{
		throw new Exception("Nu este implementata");
		
	}

	@Override
	public void StergeNod(ComponentaMeniu componentaMeniu) {
		
		throw new IllegalArgumentException("Nu este implementata");
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		
		throw new IllegalArgumentException("Nu este implementata");
	}

	@Override
	public void printeaza() {
		System.out.println("Elementul "+ numeElement);
		
	}

	public Element(String numeElement) {
		super();
		this.numeElement = numeElement;
	}
	
}
