package task11;
import java.util.Scanner;

public class DataComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String firstL = in.nextLine();
        System.out.println("Введите второе число: ");
        int second = in.nextInt();
        int first = Integer.parseInt(firstL);
        System.out.println("Большее из чисел: " + Math.max(first, second));
        double min = Math.min(first, second);
        System.out.println("Меньшее из чисел: " + min);
    }
}
