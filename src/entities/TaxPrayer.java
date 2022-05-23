package entities;

public abstract class TaxPrayer {
	
	private String name;
	protected double anualcome;
	
	public TaxPrayer() {
	}

	public TaxPrayer(String name, double anualcome) {
		this.name = name;
		this.anualcome = anualcome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualcome() {
		return anualcome;
	}

	public void setAnualcome(double anualcome) {
		this.anualcome = anualcome;
	}
	
	public abstract double tax();

}
