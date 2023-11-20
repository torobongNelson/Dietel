package PersonalPractice.Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class GeoPoliticalZoneDetector {
    //Available globally so that any method within this can access it
    //our northCentral List: available globally within this class
    private static final List<String> northCentral = northCentral();
    private static final List<String> northEast    = northEast();
    private static final List<String> northWest    = northWest();
    private static final List<String> southEast   = southEast();
    private static final List<String> southSouth  = southSouth();
    private static final List<String> southWest   = southWest();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi, what state are you from? : ");
        String userState = scanner.nextLine();
        userState = userState.toLowerCase();

        if (northCentral.contains(userState)) {
            System.out.println("Hello there\uD83D\uDE0A" + "\n" + "you belong in the North Central Political Zone");

        } else if (northEast.contains(userState)) {
            System.out.println("Hello there\uD83D\uDE0A" + "\n" + "you belong in the North East Political Zone");

        } else if (northWest.contains(userState)) {
            System.out.println("Hello there\uD83D\uDE0A" + "\n" + "you belong in the North West Political Zone");

        } else if (southEast.contains(userState)) {
            System.out.println("Hello there\uD83D\uDE0A" + "\n" + "you belong in the South East Political Zone");

        } else if (southSouth.contains(userState)) {
            System.out.println("Hello there\uD83D\uDE0A" + "\n" + "you belong in the South-South Political Zone");

        } else if (southWest.contains(userState)) {
            System.out.println("Hello there\uD83D\uDE0A" + "\n" + "you belong in the south-West Political Zone");

        } else {
            System.out.println("Sorry, your input doesn't match any of the geo-political zones in Nigeria" + "\n" +
                    "Go through the options to see the list of states in each zone. ");

        }


        System.out.println();
        while (true) {
            System.out.println("PRESS 0 If you'd love to see the list of geo-political zones in Nigeria");
            System.out.println("PRESS 1 for states in the North Central geo-political zone");
            System.out.println("PRESS 2 for states in the North East geo-political zone");
            System.out.println("PRESS 3 for states in the North West geo-political zone");
            System.out.println("PRESS 4 for states in the South East geo-political zone");
            System.out.println("PRESS 5 for states in the South South geo-political zone");
            System.out.println("PRESS 6 for states in the South West geo-political zone");
            System.out.println("PRESS 7 to exit");
            int userCheck = scanner.nextInt();

            switch (userCheck) {
                case 0:
                    System.out.println("""
                            > North Central
                            > North East
                            > North West
                            > South East
                            > South West
                            > South-South
                            """);

                case 1:
                    northCentralStates(northCentral());
                    break;
                case 2:
                    northEastStates(northEast());
                    break;
                case 3:
                    northWestStates(northWest());
                    break;
                case 4:
                    SouthEastStates(southEast());
                    break;
                case 5:
                    southSouthStates(southSouth());
                    break;
                case 6:
                    southWestStates(southWest());
                    break;
                case 7:
                    scanner.close();
                    exit(0);
                    System.out.println("Exited");

                default:
                    System.out.println("The provided state doesn't exist. Kindly go through the options to see the list of states in each zone.");
            }
        }

    }

    public static List<String> northCentral () {
        List<String> northCentral = new ArrayList<>();

        northCentral.add("benue");
        northCentral.add("fct");
        northCentral.add("kogi");
        northCentral.add("kwara");
        northCentral.add("nasarawa");
        northCentral.add("niger");
        northCentral.add("plateau");

        return northCentral;
    }
    public static void northCentralStates(List<String> northCentral){
        for(int i = 0; i < northCentral.size(); i++){
            System.out.println(">>" + northCentral.get(i));
        }
        System.out.println();
    }


    public static List<String> northEast () {
        List<String> northEast = new ArrayList<>();
        northEast.add("adamawa");
        northEast.add("bauchi");
        northEast.add("borno");
        northEast.add("gombe");
        northEast.add("taraba");
        northEast.add("yobe");

        return northEast;
    }
    public static void northEastStates(List<String> northEast){
        for (int i = 0; i < northEast.size(); i++){
            System.out.println(">>" + northEast.get(i));
        }
        System.out.println();
    }



    public static List<String> northWest () {
        List<String> northWest = new ArrayList<>();
        northWest.add("kaduna");
        northWest.add("kastina");
        northWest.add("kano");
        northWest.add("kebbi");
        northWest.add("sokoto");
        northWest.add("jigawa");
        northWest.add("zamfara");

        return northWest;
    }
    public static void northWestStates(List<String> northWest){
        for(int i = 0; i < northWest.size(); i++){
            System.out.println(">>" + northWest.get(i));
        }
        System.out.println();
    }



    public static List<String> southEast () {
        List<String> southEast = new ArrayList<>();
        southEast.add("abia");
        southEast.add("anambra");
        southEast.add("ebonyi");
        southEast.add("enugu");
        southEast.add("imo");

        return southEast;
    }
    public static void SouthEastStates(List<String> southEast){
        for (int i = 0; i < southEast.size(); i++) {
            System.out.println(">>" + southEast.get(i));
            System.out.println();
        }
    }


    public static List<String> southSouth() {
        List<String> southSouth = new ArrayList<>();
        southSouth.add("akwa ibom");
        southSouth.add("bayelsa");
        southSouth.add("cross river");
        southSouth.add("delta");
        southSouth.add("edo");
        southSouth.add("rivers");

        return southSouth;
    }
    public static void southSouthStates(List<String> southSouth){
        for(int i = 0; i < southSouth.size(); i++ ){
            System.out.println(">>" + southSouth.get(i));
        }
        System.out.println();
    }


    public static List<String> southWest () {
        List<String> southWest = new ArrayList<>();
        southWest.add("ekiti");
        southWest.add("lagos");
        southWest.add("osun");
        southWest.add("ondo");
        southWest.add("ogun");
        southWest.add("oyo");

        return southWest;

    }

    public static void southWestStates(List<String> southWest){
        for(int i = 0; i < southWest.size(); i++){
            System.out.println(">>" + southWest.get(i));
        }
        System.out.println();
    }



}







