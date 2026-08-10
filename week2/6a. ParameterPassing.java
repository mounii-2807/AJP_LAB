class ParameterPassing {

    static void changeValue(int x) {
        x = 100;
        System.out.println("Inside method: " + x);
    }

    public static void main(String[] args) {

        int a = 10;

        System.out.println("Before method call: " + a);

        changeValue(a);

        System.out.println("After method call: " + a);
    }
}