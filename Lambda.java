public class Lambda {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> (a + b);
        Calculator multiply = (a, b) -> (a * b);
        Calculator subtract = (a, b) -> (a - b);
        Calculator division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Cannot divided by zero");
            }
            return (a / b);
        };
        try {

            System.out.println("Addition: " + addition.operate(3, 5));
            System.out.println("Multiplication: " + multiply.operate(3, 5));
            System.out.println("Subtraction: " + subtract.operate(3, 5));
            System.out.println("Division: " + division.operate(20, 0));

        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        }

    }
}
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);

}