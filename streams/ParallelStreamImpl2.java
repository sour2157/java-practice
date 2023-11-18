package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamImpl2 {

    public static List<String> sequentialStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities =  StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct() //Stream<String> - with distinct function performed
                .sorted() //Stream<String> - with natural alphabetical sorting
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Sequrntial stream time - " + (endTime - startTime));
        return studentActivities;
    }

    public static List<String> paralleStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities =  StudentDataBase.getAllStudents().stream()
                .parallel()//Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct() //Stream<String> - with distinct function performed
                .sorted() //Stream<String> - with natural alphabetical sorting
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Parallel stream time - " + (endTime - startTime));
        return studentActivities;
    }

    public static void main(String[] args) {
        sequentialStudentActivities();
        paralleStudentActivities();
    }
}
