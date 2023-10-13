package functionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

class Student {
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class StudentGrade {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		populate(list);
		
		Function<Student, String> func = s -> {
				int marks = s.marks;
				if (marks >=80) {
					return "A[Distinction]";
				} else if (marks >= 60) {
					return "B[First Class]";
				} else if (marks >= 45) {
					return "C[Second Class]";
				} else if (marks >= 35) {
					return "D[Third Class]";
				} else {
					return "Fail";
				}
		};
		
		for (Student student : list) {
			System.out.println("Name is " + student.name);
			System.out.println("Marks obtained " + student.marks);
			System.out.println("Grade is " + func.apply(student));
			System.out.println("********************************");
		}

	}
	
	public static void populate(ArrayList<Student> l) {
		l.add(new Student("ram", 90));
		l.add(new Student("shyam", 50));
		l.add(new Student("pam", 30));
		l.add(new Student("abram", 78));
		l.add(new Student("mohan", 45));
	}

}
