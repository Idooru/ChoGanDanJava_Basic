public class FunctionExample {
    public static void main(String[] args) {
        sayHello();
        sayHelloTo("shere");
        printSum(3, 5);

        System.out.println(returnSum(4, 2));

        int[] intArray = addAndMultiply(3, 2);

        System.out.printf("sum : %d\n", intArray[0]);
        System.out.printf("product : %d\n", intArray[1]);

        Boolean saidHola = sayHola("자바천제");
    }

    public static boolean sayHola(String name) {
        if (!name.contains("바보")) {
            System.out.printf("%s님, 안녕하세요?", name);
            return true;
        }
        System.out.println("바르고 고운말 써라?");
        return false;
    }

    public static int[] addAndMultiply(int a, int b) {
        int sum = a + b;
        int product = a * b;

        int[] intArray = { sum, product };

        return intArray;
    }

    public static int returnSum(int a, int b) {
        return a + b;
    }

    public static void printSum(int a, int b) {
        System.out.printf("%d + %d = %d\n", a, b, returnSum(a, b));
    }

    public static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }
}
