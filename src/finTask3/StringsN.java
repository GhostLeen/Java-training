package finTask3;

import java.util.Scanner;

public class StringsN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = in.nextInt();
        System.out.println("Введите строки: ");
        String[] str = new String[n];
        in.nextLine(); //обработка ранее введенного Enter
        int strNum = 0;
        int uniqLast = 0;
        for (int i = 0; i < n; i++) {
            str[i] = in.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + (i + 1) + ":" + str[i]);
            String tempStr = str[i];
            int uniq = 0;
            while (tempStr.length() > 0) {
                String ch = tempStr.substring(0, 1);
                tempStr = tempStr.replaceAll(ch, "");
                uniq = uniq + 1;
            }
            if (uniq > uniqLast) {
                uniqLast = uniq;
                strNum = i;
            }
        }
        System.out.println("Уникальная строка: " + str[strNum]);
    }
}
