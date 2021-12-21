public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        try {
            int d = a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль");
        }
        int c = calc.devide.apply(a, b);
        calc.println.accept(b);
    }
}
