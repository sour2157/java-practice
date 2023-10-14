package generics;


public class GenericAddMethodWithBounds {
    public static <T extends Number> double add(T n1, T n2) {
        return n1.doubleValue() + n2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("The addition is - " + add(12,578.98));
    }
}
