public class ThreadSleep {
    public static void main(String[] args) {
        System.out.println("지금 무슨 생각을 하고 있는지 맞춰볼게요.");
        int a = 5;
        String b = "h";

        try {
            throw new Exception("에러와 익셉션은 다르다");
        } catch (Exception err) {
            err.printStackTrace();
        }

        System.out.println("치킨!");
    }
}
