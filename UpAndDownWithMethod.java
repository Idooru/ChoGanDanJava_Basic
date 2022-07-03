import java.util.Random;
import java.util.Scanner;

public class UpAndDownWithMethod {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static int max = 255;
    public static int chace = 8;
    public static int randomNumber;
    public static int input;

    public static void main(String[] args) {
        randomNumber = random.nextInt(max);

        while (chace > 1) {
            boolean isCorrect = play();

            if (isCorrect) {
                System.out.println("정답입니다!");
                break;
            }
        }
        scanner.close();

        if (chace == 1) {
            System.out.println("패배하였습니다.");
            return;
        }

        System.out.println("상금이 지급됩니다.");
    }

    public static boolean play() {
        System.out.println("숫자를 입력하세요.");
        input = scanner.nextInt();

        if (input == randomNumber) {
            return true;
        } else if (input <= 0 || input > max) {
            System.out.printf("1보다 작거나 %d보다 클 수 없습니다.", max);
        } else if (input < randomNumber) {
            System.out.println("입력받은 숫자가 임의의 숫자보다 작습니다.");
        } else {
            System.out.println("입력받은 숫자가 임의의 숫자보다 큽니다.");
        }

        chace--;
        System.out.printf("기회가 %d번 남았습니다.", chace);

        return false;
    }
}