public class Calculator {
    public static void main(String[] args) {

        Calculate c1 = new Calculate();
        System.out.println(c1.add(5, 10));
        System.out.println(c1.add(5.3, 10.7));
        System.out.println(c1.add(5, 10, 7));

        AdvancedCalculate Ac = new AdvancedCalculate();
        System.out.println(Ac.add(6,7));
    }
}

class Calculate {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding

class AdvancedCalculate extends Calculate {

    @Override
    int add(int a, int b) {
        return a + b + 10;
    }
}