package wk5_lecture;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		CommissionEmployee employee = new CommissionEmployee("Wallace", "Balaniuc", "222-222-222", 10000, .06);

		 System.out.println("Employee information object by get methods:\n");
		// System.out.printf("%n%s %s %n", employee.getFirstName(),
		// employee.getLastName());
		// System.out.printf("%s%n", employee.getSocialSecurityNumber());
		// System.out.printf("%.2f%n", employee.getGrossSales());
		// System.out.printf("%.2f%n%n", employee.getCommisionRate());
		System.out.println(employee);

		employee.setGrossSales(5000);
		employee.setCommisionRate(0.1);

		System.out.printf("%n%s: %n%n%s%n", "Update Employee info:", employee);
	}
}
