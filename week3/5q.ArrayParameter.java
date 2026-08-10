class ArrayParameter {

    // Method accepting array as parameter
    static void display(int[] arr) {

        System.out.println("Array elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        display(numbers);
    }
}