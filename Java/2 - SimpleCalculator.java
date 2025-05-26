import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(a / b); break;
            default: System.out.println("Invalid operator");
        }
    }
}