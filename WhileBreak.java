import java.util.Scanner;

public class WhileBreak {
    public static void main(String[] args) {
        String password = "shere12345!";
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("비밀번호를 입력해주세요.");

            if (password.equals(scanner.nextLine()))
                break;

            System.out.println("비밀번호가 올바르지 않습니다.");
        }

        scanner.close();

        System.out.println("올바른 비밀번호를 입력하였습니다.");
    }
}
