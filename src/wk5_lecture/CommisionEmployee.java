package wk5_lecture;

public class CommisionEmployee extends Object {
	private final String _firstName;
	private final String _lastName;
	private final String _socialSecurityNumber;

	private double _grossSales;
	private double _commisionRate;

	/**
	 * Initializes CommisionEmployee with first, last name, SSN, gross, commRate
	 * 
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param grossSales
	 * @param commisionRate
	 */
	public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate) {

		this.setGrossSales(grossSales);
		this.setCommisionRate(commisionRate);

		this._firstName = firstName;
		this._lastName = lastName;
		this._socialSecurityNumber = socialSecurityNumber;
		this._grossSales = grossSales;
		this._commisionRate = commisionRate;
	}

	public String getFirstName() {
		return _firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public String getSocialSecurityNumber() {
		return _socialSecurityNumber;
	}

	public double getGrossSales() {
		return _grossSales;
	}

	public double getCommisionRate() {
		return _commisionRate;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0f) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		this._grossSales = grossSales;
	}

	public void setCommisionRate(double commisionRate) {
		if (commisionRate <= 0.0 || commisionRate >= 1.0)
			throw new IllegalArgumentException("Commision rate must be > 0 and < 1.0");

		this._commisionRate = commisionRate;
	}

	public double earning() {
		return this.getCommisionRate() * this.getGrossSales();
	}

	public String toString() {
		String result = "";
		result += String.format("%s %s %n", this.getFirstName(), this.getLastName());
		result += String.format("%s%n", this.getSocialSecurityNumber());
		result += String.format("%.2f%n", this.getGrossSales());
		result += String.format("%.2f", this.getCommisionRate());
		return result;
	}
}
