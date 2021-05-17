package task5;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first = in.nextInt();
        System.out.println("Введите второе число: ");
        int second = in.nextInt();
        System.out.println("Введите арифметическую операцию (+, -, *, или /): ");
        String operation = in.next();
        int result = calc(first, second, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int calc(int first, int second, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
        }
        return result;

    }
}

