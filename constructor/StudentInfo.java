package constructor;

import javax.security.auth.Subject;

class Student {
	
	private int rollno;
	private String name;
	private String dept;
	private String[] subjects;
	
	public Student(int rollno, String name, String dept, String ...subjects) {
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
		this.subjects = subjects;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String[] getSubjects() {
		return subjects;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setSubjects(String ...subjects) {
		this.subjects = subjects;
	}
	
	public String toString() {
		return "\nRollno: " + rollno + "\nName: " + name + "\nDepartment: " + dept; 
	}
}

public class StudentInfo {

	public static void main(String[] args) {
		Student student[] = new Student[2];
		student[0] = new Student(1, "Sourabh", "IT", "ComputerScience", "Datastructures", "C++");
		student[1] = new Student(2, "Radhika", "Finance", "Accounts", "Finance", "Costing");
		
		for (Student x:student) {
			System.out.println(x);
		}
	}
}
