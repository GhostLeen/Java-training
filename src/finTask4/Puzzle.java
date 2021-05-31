package finTask4;
import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ответ: ");
        String answ = in.nextLine();
        String realAnsw = "Заархивированный вирус";
        boolean flag = false;
        //Использовала метод сравнения без учета регистра, потому что, как мне кажется, он не должен влиять на правильность ответа
        if (answ.equalsIgnoreCase(realAnsw)) {
            System.out.println("Правильно!");
            return;
        } else if (answ.equalsIgnoreCase("Подсказка")) {
            System.out.println("Не лук");
            flag = true;
        } else {
            System.out.println("Подумай еще!");
        }

        boolean repl = false;
        while (!repl) {
            System.out.println("Введите ответ: ");
            answ = in.nextLine();
            if (answ.equalsIgnoreCase(realAnsw)) {
                System.out.println("Правильно!");
                return;
            } else if (answ.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
            } else {
                if (flag) {
                    System.out.println("Обидно, приходи в другой раз");
                    return;
                } else {
                    System.out.println("Подумай еще!");
                    repl = true;
                }
            }
        }

        repl = false;
        while (!repl) {
            System.out.println("Введите ответ: ");
            answ = in.nextLine();
            if (answ.equalsIgnoreCase(realAnsw)) {
                System.out.println("Правильно!");
                return;
            } else if (answ.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
            } else {
                System.out.println("Обидно, приходи в другой раз");
                return;
            }
        }
    }

}


