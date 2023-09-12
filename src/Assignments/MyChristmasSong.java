package Assignments;

import java.util.Scanner;

public class MyChristmasSong {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                                  \"Welcome Champ !\"
                 ENJOY THE TWELVE DAYS OF CHRISTMAS MEDLEY
                Pick between 1 t0 12 to see all its stanzas.
                
                    pick ---->1       pick ---->2          pick ---->3

                    pick ---->4      pick --->5          pick ---->6
                
                   pick ---->7       pick ----->8        pick --->9

                   pick ---->10       pick ----->11       pick ---->12
 
                
                      """);
        int input = scanner.nextInt();

//        while (input <= 12){


            switch (input){
                case 1 :
                    System.out.println("""
                        [Verse 1]
                        On the first day of Christmas, my true love sent to me
                        A partridge in a pear tree
                                                
                        """);
                    break;

                case 2:
                    System.out.println("""
                                        
                         [Verse 2]
               On the second day of Christmas, my true love sent to me
               Two turtle doves, and
                    A partridge in a pear tree
                        """);
                    break;

                case 3:
                    System.out.println("""
                   [Verse 3]
                 On the third day of Christmas, my true love sent to me
                Three french hens
                Two turtle doves, and
                 A partridge in a pear tree
                          """);
                    break;

                case 4:
                    System.out.println("""
                                [Verse 4]
                                On the fourth day of Christmas, my true love sent to me
                                Four calling birds
                                Three french hens
                                Two turtle doves, and
                                A partridge in a pear tree
                                            """);
                    break;

                case 5:
                    System.out.println("""
              
                                                    [Verse 5]
                                                     On the fifth day of Christmas, my true love sent to me
                                                     Five golden rings
                                                     Four calling birds
                                                     Three french hens
                                                     Two turtle doves, and
                                                     A partridge in a pear tree
                                
                                                    """ );
                    break;
                case 6:
                    System.out.println("""
                                                  [Verse 6]
                                                  On the sixth day of Christmas, my true love sent to me
                                                  Six geese a-laying
                                                  Five golden rings
                                                  Four calling birds
                                                  Three french hens
                                                  Two turtle doves, and
                                                  A partridge in a pear tree
                                                 """);
                    break;
                case 7:
                    System.out.println("""
                                                                  [Verse 7]
                                                                  On the seventh day of Christmas, my true love sent to me
                                                                  Seven swans a-swimming
                                                                  Six geese a-laying
                                                                  Five golden rings
                                                                  Four calling birds
                                                                  Three french hens
                                                                  Two turtle doves, and
                                                                  A partridge in a pear tree
                                                                  """);
                    break;
                case 8:
                    System.out.println("""  
                                                                  [Verse 8]
                                                               On the eighth day of Christmas, my true love sent to me
                                                               Eight maids a-milking
                                                                Seven swans a-swimming
                                                                Six geese a-laying
                                                                Five golden rings
                                                                 Four calling birds
                                                                Three french hens
                                                                Two turtle doves, and
                                                               A partridge in a pear tree              
                                                                 """);
                    break;

                case 9:
                    System.out.println("""
                            [Verse 9]
                            On the ninth day of Christmas, my true love sent to me
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five golden rings
                            Four calling birds
                            Three french hens
                            Two turtle doves, and
                            A partridge in a pear tree    
                                          """);
                    break;

                case 10:
                    System.out.println("""
                        [Verse 10]
                        On the tenth day of Christmas, my true love sent to me
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                                                
                                                
                        """);
                    break;

                case 11:
                    System.out.println("""
                        [Verse 11]
                        On the eleventh day of Christmas, my true love sent to me
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                    break;

                case 12:
                    System.out.println("""
                        [Verse 12]
                        On the twelfth day of Christmas, my true love sent to me
                        Twelve drummers drumming
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                    break;
                default:
                    System.out.println("oops! \n So sorry, This medley has just 12 stanzas. " +
                            "so kindly input between the numbers i told you to enter");


            }


            }
        }













