package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamImpl1 {
    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGradeLevel()>=3)//stream<students>
                .filter(s -> s.getGpa()>=3.9)//stream<students>
                .collect(Collectors.toMap(Student::getName, Student::getActivities));//map
        System.out.println(studentMap);
    }
}
