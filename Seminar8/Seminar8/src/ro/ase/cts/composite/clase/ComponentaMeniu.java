package ro.ase.cts.composite.clase;

public interface ComponentaMeniu {
	 public void AdaugaNod(ComponentaMeniu componentaMeniu) throws Exception;
	 public void StergeNod(ComponentaMeniu componentaMeniu);
	 ComponentaMeniu getNod(int index);
	 public void printeaza();
}
