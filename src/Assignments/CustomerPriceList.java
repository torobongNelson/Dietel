package Assignments;

import java.util.Scanner;

public class CustomerPriceList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        * Here, I am defining 2 arrays, one for the items and the other for the customer
        * */
        String[] items = {"Item 1","Item 2","Item 3"};
        String[] customers = {"Customer 1","Customer 2","Customer 3"};

        /*Here I am creating a 2D array to store the prices with [3][3] dimension.
        * The first dimension [3] represents teh number of customers
        * the second dimension represents the number of items*/
        double[][] prices = new double[customers.length][items.length];


        /*In this nested loop,  I am iterating thro the customer and item combination and prompting the user
        * to enter prices for each item and for each custoerm
        * then i am storing the entered prices in the prices array*/
        for (int i = 0; i < customers.length; i++) {
            for (int j = 0; j < items.length; j++) {
                System.out.print("Enter the prices for " + customers[i] + " and " + items[j] + ": ");
                prices[i][j] = scanner.nextDouble();
            }
        }

        /*on line 32, I am usinf prinf to print the table starting with an empty cell on the first line
        * then i am iterating thro d items array, pritng each item's name.
        * I studied and found out dat i can use "%-12s, %-10s e.t.c for formatting so I used one"*/
        System.out.printf("%-12s", ""); //I am printing empty cells for alignment
        for (String item: items) {
            System.out.printf("%-10s", item);
        }

        System.out.println();

        /*In dis loop, I am printing the names and prices by iterating thro each customer's name and print their name
        * then iterate thro the prices array and print the corresponding prices using printf*/
        for (int i = 0; i < customers.length; i++) {
            System.out.printf("%-12s", customers[i]);
            for (int j = 0; j < items.length; j++) {
                System.out.printf("%-10.2f", prices[i][j]);
            }
            System.out.println();
        }
    }
}
