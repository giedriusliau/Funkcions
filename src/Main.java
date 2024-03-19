public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        System.out.println("--- 1 ----");
        suma(a, b);
        System.out.println("--- 2 ----");
        System.out.println( pisq() );
        System.out.println("--- 3 ----");

    }

    public static double pisq() {
        return 9.8596;
    }

    public static void suma(int a, int b) {
        int sum = a + b;
        System.out.println("Suma: " + sum);

    }

}