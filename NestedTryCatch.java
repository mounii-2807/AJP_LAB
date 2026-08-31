class NestedTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                int a = 10;
                int b = 0;
                int result = a / b;
                System.out.println(result);
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero.");
            }
            try {
                int[] arr = {10, 20, 30};
                System.out.println(arr[5]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid array index.");
            }
        }
        catch (Exception e) {
            System.out.println("Outer catch: Some exception occurred.");
        }
    }
}