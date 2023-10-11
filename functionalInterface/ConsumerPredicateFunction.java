package functionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//program to get student info, assign grade and check iff marks greater than 60

class StudentInfo {
	String name;
	int marks;
	
	public StudentInfo(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class ConsumerPredicateFunction {

	public static void main(String[] args) {
		ArrayList<StudentInfo> list = new ArrayList<StudentInfo>();
		populate(list);
		
		Predicate<StudentInfo> p = s -> s.marks >= 60;
		
		Function<StudentInfo, String> f = s -> {
			int marks = s.marks;
			
			if (marks >= 80) {
				return "Distinction";
			} else if (marks >= 60) {
				return "First Class";
			} else if (marks >= 40) {
				return "Second Class";
			} else {
				return "Fail";
			}
		};
		
		Consumer<StudentInfo> c = s -> {
			System.out.println("Student name: " + s.name);
			System.out.println("Student marks: " + s.marks);
			System.out.println("Grade: " + f.apply(s));
		};
		
		for (StudentInfo studentInfo : list) {
			if (p.test(studentInfo)) {
				c.accept(studentInfo);
				System.out.println("*****************");
			}
			
		}

	}
	
	public static void populate(ArrayList<StudentInfo> s) {
		s.add(new StudentInfo("Ram", 80));
		s.add(new StudentInfo("Shyam", 60));
		s.add(new StudentInfo("Pam", 98));
		s.add(new StudentInfo("Pratik", 42));
		s.add(new StudentInfo("Drake", 30));
	}
}
