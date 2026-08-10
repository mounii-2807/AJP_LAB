class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // 1. append()
        sb.append(" Java");
        System.out.println("append(): " + sb);

        // 2. insert()
        sb.insert(6, "World ");
        System.out.println("insert(): " + sb);

        // 3. replace()
        sb.replace(6, 12, "Good");
        System.out.println("replace(): " + sb);

        // 4. delete()
        sb.delete(6, 11);
        System.out.println("delete(): " + sb);

        // 5. reverse()
        sb.reverse();
        System.out.println("reverse(): " + sb);
    }
}