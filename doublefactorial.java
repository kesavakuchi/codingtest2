package core;

public class doublefactorial {
    public static double factorial(double num) {
        double product = 1;
        for (double i = num; i > 0; i--) {
            product *= i;
        }
        return product;
    }
    public static void main(String[] args) {
        int num = 6;
        double result = factorial(num) / factorial(factorial(num));
        // 3.14159
        System.out.println(Math.PI - (result * Math.pow(10, 8)));
    }
}
