import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String input = scanner.next();
        // String input2 = scanner.next();
        // String input3 = scanner.next();
        // String input4 = scanner.next();

        // System.out.println(input);
        // System.out.println(input2);
        // System.out.println(input3);
        // System.out.println(input4);

        System.out.println("숫자를 하나 입력해주세요.");
        Scanner scanner2 = new Scanner(System.in);
        String intInput = scanner2.nextLine();

        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println(intValue + 1);
        } catch (Exception e) {
            System.out.println("숫자가 입력되어야 합니다.");
            System.out.println(e);
        }

        scanner.close();
        scanner2.close();

    }
}
