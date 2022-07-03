public class AndOperator {
    public static void main(String[] args) {
        int age = 10;

        if (age >= 10 && age < 20) {
            System.out.println("10대");
        } else if (age >= 20) {
            System.out.println("성인");
        } else {
            System.out.println("응애");
        }
    }
}
