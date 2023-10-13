package lambda;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	int eno;
	String ename;
	
	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
	
}

public class EmployeeList {

	public static void main(String[] args) {
		
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(new Employee(1, "Sourabh"));
		a.add(new Employee(2, "Suhas"));
		a.add(new Employee(61, "Swati"));
		a.add(new Employee(23, "Shaunak"));
		a.add(new Employee(45, "Radhika"));
		
		System.out.println("Before Sorting - " + a);
		Collections.sort(a, (a1,a2) -> (a1.eno < a2.eno) ? -1 : (a1.eno > a2.eno) ? 1 : 0);
		System.out.println("After Sorting - " + a);

	}

}
