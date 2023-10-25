package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapImpl {

    public static List<String> studentActivities() {
       return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct() //Stream<String> - with distinct function performed
                .sorted() //Stream<String> - with natural alphabetical sorting
                .collect(Collectors.toList());
    }

    public static long studentActivitiesCount() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct() //Stream<String> - with distinct function performed
                .count();
    }

    public static void main(String[] args) {
        System.out.println(studentActivities());
        System.out.println("Total number of student activities - " + studentActivitiesCount());
    }
}
