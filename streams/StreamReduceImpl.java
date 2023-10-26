package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceImpl {

    public static Optional<Student> getHighestGpaStudent() {
        return  StudentDataBase.getAllStudents().stream()
                    .reduce((s1,s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
    }

    public static int multiply(List<Integer> list) {
        return list.stream().reduce(1, (a,b) -> a*b);
    }

    //using optional to handle null value incase we are not passing identity
    public static Optional<Integer> multiplyWithoutIdentity(List<Integer> list) {
        return list.stream().reduce((a,b) -> a*b);
    }

    public static void main(String[] args) {

        Optional<Student> student = getHighestGpaStudent();
        if (student.isPresent()){
            System.out.println(student.get());
        }

        List<Integer> l = Arrays.asList(1,3,5,7,9);
        System.out.println("multiplication is - " + multiply(l));
        //output will be Optional[945]
        System.out.println("multiplication with identity is - " + multiplyWithoutIdentity(l));
        //to handle optional properly
        Optional<Integer> result = multiplyWithoutIdentity(l);
        if (result.isPresent())
            System.out.println(result.get());
    }
}
