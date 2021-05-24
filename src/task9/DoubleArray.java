package task9;

import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        double array[] = new double[size];
        double sum = 0;
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
            sum += array[i];
        }
        double med = sum / size;
        System.out.println("Результат умножения элементов массива на среднее арифметическое: ");
        for (int i = 0; i < size; i++) {
            array[i] = array[i] * med;
            System.out.println(array[i]);
        }
    }

}
