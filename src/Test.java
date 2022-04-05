public class Test {


    public static void main(String[] args) {


        int a = 4;
        int b = 7;

        System.out.println("Binary 4|11:  " + (a | (a + b)));
        System.out.println("Binary: 11&11 " + (a + b & a + b));
        System.out.println("Binary 11^7: " + (a + b ^ b));
        System.out.println("a | b + a & b + a ^ b: " + (a | b + a & b + a ^ b));

    }
}
