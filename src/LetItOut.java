import java.util.Scanner;
    public class LetItOut{
        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number:");
            int number = scanner.nextInt();

            if(number == 20){
                System.out.print("20");
            }
            else if(number == 10){
                System.out.println("this is Ten");
            }else if(number == 5){
                System.out.println("this is five");
            }



        }



    }


