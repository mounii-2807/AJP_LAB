class StringMethods {
    public static void main(String[] args) {

        String str = "Hello Java";
        String str2 = "Hello World";

        // charAt()
        System.out.println("charAt(1): " + str.charAt(1));

        // compareTo()
        System.out.println("compareTo(): " + str.compareTo(str2));

        // equals()
        System.out.println("equals(): " + str.equals(str2));

        // indexOf()
        System.out.println("indexOf('J'): " + str.indexOf('J'));

        // join()
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("join(): " + joined);

        // replace()
        System.out.println("replace(): " + str.replace("Java", "World"));

        // substring()
        System.out.println("substring(): " + str.substring(6));

        // toUpperCase()
        System.out.println("toUpperCase(): " + str.toUpperCase());

        // toLowerCase()
        System.out.println("toLowerCase(): " + str.toLowerCase());
    }
}