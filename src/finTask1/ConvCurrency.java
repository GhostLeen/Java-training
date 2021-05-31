package finTask1;
import java.util.Scanner;

public class ConvCurrency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара: ");
        double dol = in.nextDouble();
        System.out.println("Введите количество рублей: ");
        double rub = in.nextDouble();
        System.out.printf("Итого: %.2f долларов", rub / dol);
    }
}
