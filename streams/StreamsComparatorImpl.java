package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorImpl {

    //sorted students by name in ascending
    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    //sorted students by highest gpa - descending
    public static List<Student> sortStudentsByGpa() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by name: ");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by GPA: ");
        sortStudentsByGpa().forEach(System.out::println);
    }
}
