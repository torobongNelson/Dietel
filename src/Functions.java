public class Functions {
    public static void main(String[] args) {
       shape1(7);
    }
    public static void shape1(int numberOfShape){
        for (int i = 0; i < numberOfShape; i++) {
         //   shape2(numberOfShape);
            System.out.print("* ");
        }
        System.out.println();
    }
    public static void shape2(int numberOfShape){
        for (int i = 0; i < numberOfShape; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

//    public static void main(String[] args) {
//        shape1(10);
//        shape2(2);
//    }
}
