public class SwapWithBitwise {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
