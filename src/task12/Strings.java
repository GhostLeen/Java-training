package task12;

public class Strings {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
        }
        String strPart = str.replaceAll("a", "o");
        System.out.println(strPart.substring(7, 11));
    }
}
