package functionalInterface;

public class UnaryOperator {
    public static void main(String[] args) {
        java.util.function.UnaryOperator<String> u = s -> s.concat("Hello");
        System.out.println();
    }
}
