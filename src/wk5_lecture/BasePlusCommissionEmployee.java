package wk5_lecture;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double _baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
		this.setBaseSalary(baseSalary);
	}

	public double getBaseSalary() {
		return _baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be greater than 0.0!");
		this._baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Base Salary: %.2f%n", this.getBaseSalary());
	}
}
