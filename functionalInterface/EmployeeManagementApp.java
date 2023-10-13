package functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String name;
	String designation;
	double salary;
	String city;
	
	public Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	
	public String toString() {
		String s = String.format("(%s, %s, %.2f, %s)", name, designation, salary, city);
		return s;
	}
}

public class EmployeeManagementApp {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		populate(list);
		
		Predicate<Employee> e1 = e -> e.designation.equals("CTO");
		System.out.println("Employee whose role is CTO");
		display(e1, list);
		
		Predicate<Employee> e2 = e -> e.city.equals("Pune");
		System.out.println("Employees belonging to city Pune");
		display(e2, list);
		
		Predicate<Employee> e3 = e -> e.salary < 100000;
		System.out.println("Employees whose salary is less than 1 lakh");
		display(e3, list);
		
		System.out.println("Employees whose role is CTO and belongs to Pune");
		display(e1.and(e2), list);
		
		System.out.println("Employees whose role is CTO or salary less than 1 Lakh");
		display(e1.or(e3), list);
		
		System.out.println("Employees who are not CTO's");
		display(e1.negate(), list);
		
	}
	
	public static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Ram", "CEO", 100000, "Pune"));
		l.add(new Employee("Shyam", "CTO", 100000, "Sangli"));
		l.add(new Employee("Pam", "CTO", 90000, "Pune"));
		l.add(new Employee("Geeta", "CFO", 60000, "Mumbai"));
		l.add(new Employee("Tim", "Technical Lead", 100000, "New York"));
		l.add(new Employee("Kim", "HR", 70000, "New York"));
	}
	
	public static void display(Predicate<Employee> predicate, ArrayList<Employee> arrayList) {
		
		for (Employee employee : arrayList) {
			if (predicate.test(employee)) {
				System.out.println(employee);
			}
		}
		System.out.println("********************************************************************");
	}

}
