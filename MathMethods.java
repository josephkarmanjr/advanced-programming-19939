public class MathMethods {

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;

        int sum = calculateSum(number1, number2);
        int product = calculateProduct(number1, number2);

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
    }
}