public class Q1 {
    static class Box {
        private int width ;
        private int height ;
        private int depth ;

        Box(int width, int height, int depth) {
            this.width = width ;
            this.height = height ;
            this.depth = depth ;
        }
        double volBox() {
            return width * height * depth ;
        }
    }
    public static void main(String[] args) {
        Box b = new Box(4, 5, 6) ;
        double volume = b.volBox() ;
        System.out.println(volume);
    }
}
