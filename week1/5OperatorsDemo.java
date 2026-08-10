class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Increment and decrement
        System.out.println("Initial value of a = " + a);

        System.out.println("Post-increment a++ = " + (a++));
        System.out.println("After increment a = " + a);

        System.out.println("Pre-increment ++a = " + (++a));

        System.out.println("Post-decrement a-- = " + (a--));
        System.out.println("After decrement a = " + a);

        System.out.println("Pre-decrement --a = " + (--a));

        // Bitwise operators
        System.out.println("\nBitwise Operators:");

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
    }
}