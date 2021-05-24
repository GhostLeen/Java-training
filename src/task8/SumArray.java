package task8;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("Результат суммы нечетных чисел диапазона (от 1 до введенного): " + sum);
    }
}
