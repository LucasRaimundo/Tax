package entities;

public class Company extends TaxPrayer{

	private int numberOfEmployees;
	
	public Company() {
		super();
	}


	public Company(String name, double anualcome, int numberOfEmployees) {
		super(name, anualcome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}


	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}


	@Override
	public double tax() {
		
		if (numberOfEmployees > 10) {
			return anualcome * 0.14;
		} else {
			return anualcome * 0.16;
		}
		
	}
	
	
}
