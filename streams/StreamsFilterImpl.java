package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterImpl {

    public static List<Student> filterFemaleStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter(f -> f.getGender().equals("female"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("The list of female students - ");
        filterFemaleStudents().forEach(System.out::println);
    }
}
