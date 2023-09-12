package ClassesWithFelix;

public class Classes {
    public static void main(String[] args) {
            Classes object = new Classes();
            object.eating();
            System.out.println(object.complain());
    }



    private String name;
    private int age;

    public void eating() {
        System.out.println("i am eating groundnut and bread...");
    }

    public String complain() {
        String felix = "She didn't invite me to join her now oo";
        return felix;
    }
}
