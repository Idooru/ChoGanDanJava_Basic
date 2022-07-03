import java.util.Scanner;

public class Hungry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("돈 얼마 있니?");
        int input = Integer.parseInt(scanner.nextLine());
        int money = input;

        scanner.close();

        if (money >= 8000) {
            System.out.println("순대국을 먹는다.");
            money -= 8000;
        } else if (money > 0) {
            System.out.println("다른거 먹는다.");
            money -= 0;
        } else {
            System.out.println("순대국을 먹지 못한다.");
            money -= 0;
        }

        System.out.printf("남은 돈 %d", money);
    }
}
