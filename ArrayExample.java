import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] days = { "월", "화", "수", "목", "금", "토", "일" };

        // int lengthOfDays = days.length;
        // System.out.println(lengthOfDays);

        // for (int i = 0; i < days.length; i++) {
        // System.out.println(days[i] + "요일");
        // }

        // for (String day : days) {
        // System.out.println(day + "요일");
        // }

        String[] days2 = Arrays.copyOf(days, 8);
        // days2[7] = "일";

        for (String day : days2) {
            System.out.println(day);
        }
    }
}
