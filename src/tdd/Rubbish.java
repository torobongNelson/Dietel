package tdd;

public class Rubbish {
    public static void main(String[] args) {
        int number = 50;
        System.out.println("this is a number 1 " +number);
        for (; ; ) {
            System.out.println("this is a number 2 " +number);
            if (number == 44) {
                break;
            }
            System.out.println("this is a number 3 " +number);
            System.out.println("infinite loop");
            System.out.println("this is a number 4 "+number);
            number -= 3;
        }
    }
}
