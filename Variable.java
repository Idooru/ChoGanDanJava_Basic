public class Variable {

    public String test = "hello";

    public static void main(String[] args) {
        short number;
        number = 3;
        number = 10;

        short numb = number += 2;

        boolean result = numb <= 12 ? true : false;

        System.out.println(result);

        // System.out.println(numb += 10);
    }
}