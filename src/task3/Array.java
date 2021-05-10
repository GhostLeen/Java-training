package task3;

public class Array {
    public static void main(String[] args) {
        int[] val = new int[] {3, 5, 1, 7, 9};
        int num = val[0];
        val[0] = val[val.length - 1];
        val[val.length - 1] = num;
        System.out.println(val[0] + val[val.length/2]);
    }

}
