package PersonalPractice.HolzPractice;

import java.util.Scanner;

public class User {
        private String firstName;
        private String lastName;
        private String userName;
        private String password;
        private String fullName;

        Scanner scanner;

        public User(String firstName,String lastName, String userName, String password){
            this.firstName = firstName;
            this.lastName = lastName;
            this.userName = userName;
            this.password = password;
            this.fullName = firstName + " "+ lastName;
            this.scanner = new Scanner(System.in);
        }

        public String reversedString(String firstName){
            String reversedFirstName = new StringBuilder(firstName).reverse().toString();
            return firstName;
        }

        public void login(){
            System.out.println("Enter your username : ");
            String receivedUserName = scanner.nextLine();

            if(this.userName.equals(receivedUserName)){
                System.out.println("Enter your password : ");
                String receivedPassword = scanner.nextLine();

                if(receivedPassword.compareTo(this.password) == 0){
                    System.out.println("Login successful");
                }else{
                    System.out.println("Invalid credentials !");
                }
                //things done when a user exists
            }else{
                System.out.println("Username does not exist");
            }
        }

    public static void main(String[] args) {
        User myUser = new User("praise","Bassey","pxxx","007");
        myUser.login();
    }




}
