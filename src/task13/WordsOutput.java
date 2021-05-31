package task13;
import java.util.Scanner;


public class WordsOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку слов с пробелами: ");
        String text = in.nextLine();
        String[] word = text.split(" ");
        int num = word.length;
        int count = 0;
        for (int j = 0; j < num; j++) {
            boolean flag = false;
            char ch[] = word[j].toCharArray();
            for (int i = 0; (i < ch.length) && (!flag); i++) {
                if ((ch[i] < 65) || (ch[i] > 90) && (ch[i] < 97) || (ch[i] > 122)) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println(word[j]);
                count++;
            }
        }
        System.out.println(count);
    }
}

