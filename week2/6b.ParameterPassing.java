class ParameterPassing {

    int value;

    ParameterPassing(int value) {
        this.value = value;
    }

    static void changeValue(ParameterPassing obj) {
        obj.value = 100;
    }

    public static void main(String[] args) {

        ParameterPassing obj = new ParameterPassing(10);

        System.out.println("Before method call: " + obj.value);

        changeValue(obj);

        System.out.println("After method call: " + obj.value);
    }
}