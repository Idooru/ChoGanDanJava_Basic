import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] days = {
                { "월", "화", "수", "목", "금", "토", "일" },
                { "월", "화", "수", "목", "금", "토", "일" },
                { "월", "화", "수", "목", "금", "토", "일" }
        };

        for (int i = 0; i <= 2; i++) {
            System.out.println(Arrays.toString(days[i]));
        }
    }
}
