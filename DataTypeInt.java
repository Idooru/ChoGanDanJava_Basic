public class DataTypeInt {
    public static void main(String[] args) {
        byte byteInteager = 10;
        short shortInteager = 20;
        int intInteager = 30;
        long longInteater = 40;

        int sum = byteInteager + shortInteager;
        int sum2 = shortInteager + intInteager;
        long sum3 = intInteager + longInteater;
        long sum4 = shortInteager + longInteater;

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
