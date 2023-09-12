package tdd;

import org.junit.jupiter.api.Test;


class BikeTest {
    @Test
    public static void main(String[] args) {
        Bike alex = new Bike();

        alex.setName("Alexandra");

        alex.setOn(false);

        System.out.printf("My cool ride is %s%n" , alex.getName());
        System.out.printf("Is my ride on: %s%n " , alex.getOn());
    }



        }




