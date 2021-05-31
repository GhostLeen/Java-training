package finTask2;
import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String text = in.nextLine();
        char[] line = text.toCharArray();
        int xOut;
        if (line[0] == 'x') {
            xOut = line[1] == '+' ? Character.getNumericValue(line[4]) - Character.getNumericValue(line[2]) :
                    Character.getNumericValue(line[4]) + Character.getNumericValue(line[2]);
        } else if (line[2] == 'x') {
            xOut = line[1] == '+' ? Character.getNumericValue(line[4]) - Character.getNumericValue(line[0]) :
                    Character.getNumericValue(line[0]) - Character.getNumericValue(line[4]);
        } else {
            xOut = line[1] == '+' ? Character.getNumericValue(line[0]) + Character.getNumericValue(line[2]) :
                    Character.getNumericValue(line[0]) - Character.getNumericValue(line[2]);
        }
        System.out.println("x=" + xOut);
    }
}
