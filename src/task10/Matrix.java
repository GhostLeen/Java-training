package task10;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы: ");
        int row = in.nextInt();
        System.out.println("Введите количество столбцов матрицы: ");
        int col = in.nextInt();
        int twoArray[][] = new int[row][col];
        System.out.println("Введите элементы массива: ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
               twoArray[i][j] = in.nextInt();
            }
        }
        System.out.println("Результат умножения первой строки массива на 3: ");
        for (int i = 0; i<col; i++) {
            twoArray[0][i] = twoArray[0][i]*3;
            System.out.printf("%d ", twoArray[0][i]);
        }
    }
}
