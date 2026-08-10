public class Q2 {
    static int powerInt(int num1 , int num2) {
        int pow = 1 ;
        for(int i = 1; i <= num2; i++) {
            pow *= num1 ;
        }
        return pow ;
    }
    static double powerDouble(double num1 , int num2) {
        double pow = 1 ;
        for(int i = 1; i <= num2; i++) {
            pow *= num1 ;
        }
        return pow ;
    }
    public static void main(String[] args) {
        int powInt = powerInt(2, 5) ;
        double powDouble = powerDouble(3.4, 2) ;
        System.out.println(powInt);
        System.out.println(powDouble);
    }
}
