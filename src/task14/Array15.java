package task14;

public class Array15 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 41) - 15);
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        if (Math.abs(max) > Math.abs(min)) {
            System.out.println(max);
        } else {
            System.out.println(min);
        }
    }
}



