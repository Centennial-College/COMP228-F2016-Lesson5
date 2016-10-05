package wk5_lecture;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Wallace", "Balaniuc", "222-222-222",
				10000, .06, 500);

		System.out.println("Employee information object by get methods:\n");
		System.out.println(employee);

		employee.setGrossSales(5000);
		employee.setCommisionRate(0.1);
		employee.setBaseSalary(500000);

		System.out.printf("%n%s: %n%n%s%n", "Update Employee info:", employee);
	}
}
