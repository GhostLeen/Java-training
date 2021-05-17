package task4;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число х: ");
        int x = in.nextInt();
        System.out.println("Введите число y: ");
        int y = in.nextInt();
        System.out.println("Введите число z: ");
        int z = in.nextInt();

        float medium = (float) (x + y + z) / 3;
        System.out.println(medium);
        int result = (int) (medium / 2);
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }

}
