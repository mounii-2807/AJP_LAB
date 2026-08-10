interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {

    public void fatherProperty() {
        System.out.println("Property from Father");
    }

    public void motherProperty() {
        System.out.println("Property from Mother");
    }

    void childProperty() {
        System.out.println("Child's own property");
    }
}

class MultipleInheritance {
    public static void main(String[] args) {

        Child c = new Child();

        c.fatherProperty();
        c.motherProperty();
        c.childProperty();
    }
}