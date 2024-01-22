package PersonalPractice.HolzPractice;


import java.util.Arrays;

public class ArrayC72 {
    public static void main(String[] args){
        int[] booksOnShelf = {60,50};
        myBooks(booksOnShelf);

    }
//        int[] books = new int[10];
//
//        numbersOfBooks(books);


//    public static void numbersOfBooks(int[] books) {
//        for (int i = 0; i < books.length; i++) {
//            books[i] = 5 * i;
//            System.out.println(books[i]);
//        }



    public static void  myBooks(int[] booksOnShelf) {
        for(int i = 0; i < booksOnShelf.length - 1; i++){

                if(booksOnShelf[i] > booksOnShelf[i + 1]){
                    int temp = booksOnShelf[i];
                    booksOnShelf[i] = booksOnShelf[i + 1];
                     booksOnShelf[i+1] = temp;

                }
            }
                System.out.println(Arrays.toString(booksOnShelf));

    }

        }









