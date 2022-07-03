public class DataTypeChar {
    public static void main(String[] args) {
        char character = 'a';

        System.out.println(character);

        String greeting = "hello";
        String java = "java";

        System.out.println(greeting + " " + java);

        String longData = "abcdefghijklnmopqrstuvwxyz";
        int length = longData.length();

        System.out.println(length);

        String alternation = java.replaceAll("java", "node?");

        System.out.println(greeting + " " + alternation);

        String birthDay = "1998/05/04";
        String year = birthDay.substring(0, 4);
        String month = birthDay.substring(5, 7);
        String data = birthDay.substring(8);

        System.out.println(year);
        System.out.println(month);
        System.out.println(data);
    }
}
