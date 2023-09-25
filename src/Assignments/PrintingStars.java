package Assignments;

public class PrintingStars {
    public static void main(String[] args) {

//        rows = 5

//        for index in range(1, rows + 1):
//          for j in range(1, index + 1):
//              print(" * ", end=' ')
//        print()
//
//        for i in range(rows - 1, 0, -1):
//        for j in range(1, i + 1):
//        print(" * ", end=' ')
//        print()

        int rows = 5;

        for(int index = 0; index< rows; index++){
            for(int jindex = 0; jindex <= index; jindex++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int index = 1; index<= rows; index++){
            for(int jindex = index; jindex <= rows -1; jindex++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
