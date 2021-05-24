package task7;
import java.util.Scanner;

public class ConstArray {
    public static void main(String[] args) {
        final int x = 3, y = 5, z = 13;
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i<size; i++) {
            array[i] = in.nextInt();
            if ((array[i] == x) || (array[i] == y) || (array[i] == z)) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Данное значение имеется в константах");
        }
    }
}
