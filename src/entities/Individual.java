package entities;

public class Individual extends TaxPrayer {

	private double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	
	public Individual(String name, double anualcome, double healthExpenditures) {
		super(name, anualcome);
		this.healthExpenditures = healthExpenditures;
	}



	public double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public double tax() {
		double rend = 0;
		double health = 0;
		if (anualcome > 20000) {
			 rend = anualcome * 0.25;
		} else {
			 rend = anualcome * 0.15;
		}
		
		if (healthExpenditures > 0 ) {
			health = healthExpenditures * 0.5;
		} else {
			health = healthExpenditures;
		}
		
		return rend - health;
	}

	
}
