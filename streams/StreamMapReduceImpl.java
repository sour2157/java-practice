package streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceImpl {

    public static int noOfNotebooks() {
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGradeLevel()>=3)
                .map(Student::getNoteBooks)
                //.reduce(0, (a,b) -> a+b)
                //more simpler way
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("No of Notebooks - " + noOfNotebooks());
    }
}
