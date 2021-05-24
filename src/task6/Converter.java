package task6;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - время, 2 - масса");
        int num = in.nextInt();
        if (num == 1) {
            System.out.println("Выберите единицу измерения: 1 - часы, 2 - минуты, 3 - секунды");
            int dim1 = in.nextInt();
            System.out.println("Введите целое число: ");
            int n1 = in.nextInt();
            double [][] arrT = {{1, 60, 3600}, {0.016666667, 1, 60}, {0.000277778, 0.016666667, 1}};
            double hour = n1*arrT[dim1-1][0];
            double min = n1*arrT[dim1-1][1];
            double sec = n1*arrT[dim1-1][2];
            System.out.printf("Результат: \nЧасы: %.3f\nМинуты: %.3f\nСекунды: %.3f", hour, min, sec);
        }
        else {
            System.out.println("Выберите единицу измерения: 1 - кг, 2 - фунт, 3 - пуд");
            int dim2 = in.nextInt();
            System.out.println("Введите целое число: ");
            int n2 = in.nextInt();
            double [][] arrM = {{1, 2.20462, 0.06106}, {0.45359, 1, 0.02769}, {16.38505, 36.11278, 1}};
            double kilo = n2*arrM[dim2-1][0];
            double funt = n2*arrM[dim2-1][1];
            double pud = n2*arrM[dim2-1][2];
            System.out.printf("Результат: \nКг: %.3f\nФунты: %.3f\nПуды: %.3f", kilo, funt, pud);
        }

    }

}

