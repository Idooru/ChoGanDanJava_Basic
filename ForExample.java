public class ForExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("현재 반복 횟수 : " + i);
        }

        int x;
        int y;

        for (x = 1; x < 10; x++) {
            for (y = 2; y < 10; y++) {
                System.out.printf("%d * %d = %d\n", x, y, x * y);
            }
            System.out.println();
        }
    }
}
