import java.util.Scanner;

public class WhileExample02 {
    public static void main(String[] args) {
        String password = "shere12345!";
        Scanner scanner = new Scanner(System.in);

        System.out.println("비밀번호를 입력해주세요");
        String input = scanner.nextLine();

        while (input.equals(password) != true) {
            System.out.println("비밀번호가 일치하지 않습니다. 비밀번호를 다시 입력해주세요.");
            input = scanner.nextLine();
        }

        scanner.close();

        System.out.println("올바른 비밀번호를 입력하였습니다.");

    }
}