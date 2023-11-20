package DS;

import java.util.Arrays;

public class TheArrays  {
    public static void main(String[] args) {
        String[] colors = new String[5];
        //i know the size of my array
        colors[0] = "134567";
        colors[1] = "pink";
        colors[2] = "black";
        // I am fixing stuff into my array

        System.out.println(Arrays.toString(colors));
        //this is printing all the items in an array
        System.out.print(colors[2]);
        //this is printing an item by its index
    }


}
