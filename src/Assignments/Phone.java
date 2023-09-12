//package Assignments;
//
//import java.util.Scanner;
//public class Phone {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("""
//                pick an number to choose an action
//
//
//                1 -----> Phone book
//                2 ----->Messages
//                3 -----> Chat
//                4 ----->Call Register
//                5 -----> Tones
//                6 -----> Settings
//                7 -----> Call Divert
//                8 ----->Games
//                9 ----->Calculator
//                10 -----> Reminders
//                11 -----> Clock
//                12 ----->Profiles
//                13 -----> SIM services
//                :
//                 """);
//
//        int input = scanner.nextInt();
//
//        switch (input) {
//            case 1:
//                System.out.println("""
//                        pick an number to choose an action
//
//                        1 -----> Search
//                        2 ----->Service Nos
//                        3 -----> Add name
//                        4 ----->Erase
//                        5 -----> Edit
//                        6 -----> Assign tone
//                        7 -----> send b' card
//                        8 -----> Options
//                        9 ----->Speed dials
//                        10 -----> voice tags
//
//                         """);
//                int userInput2 = scanner.nextInt();
//                switch (userInput2) {
//                    case 1:
//                        System.out.println("Search");
//                        break;
//
//                    case 2:
//                        System.out.println("Service Nos");
//                        break;
//
//                    case 3:
//                        System.out.println("Add name");
//                        break;
//                    case 4:
//                        System.out.println("Erase");
//                        break;
//                    case 5:
//                        System.out.println("Edit");
//                        break;
//                    case 6:
//                        System.out.println("Assign tone");
//                        break;
//                    case 7:
//                        System.out.println("send b' card");
//                        break;
//                    case 8: {
//                        System.out.println("options");
//                        System.out.println("""
//                                  for option
//                                press\s
//                                1.Type of view
//                                2. Memory status
//                                 """);
//                        int myInput = scanner.nextInt();
//                        switch (myInput) {
//                            case 1:
//                                System.out.println("Type of view");
//                                break;
//                            case 2:
//                                System.out.println("memory status");
//                                break;
//                            case 9:
//                                System.out.println("Speed dial");
//                                break;
//                            case 10:
//                                System.out.println("Voice tags");
//                                break;
//                        }
//
//                        System.out.println();
//                        switch (input){
//
//                        case 2:
//                            System.out.println("""
//                                    messages:
//                                    1-> Write messages
//                                    2-> inbox
//                                    3-> outbox
//                                    4-> picture messages
//                                    5-> Templates
//                                    6->  Smileys
//                                    7-> Message setting
//                                    8-> info service
//                                    9-> Voice mailbox number
//                                    10-> Service command editor
//
//                                    """);
//                            int message = scanner.nextInt();
//                            switch (message) {
//                                case 1:
//                                    System.out.println("Write a message");
//                                    break;
//                                case 2:
//                                    System.out.println("inbox");
//                                    break;
//                                case 3:
//                                    System.out.println("outbox");
//                                case 4:
//                                    System.out.println("picture messages");
//                                case 5:
//                                    System.out.println("Templates");
//                                case 6:
//                                    System.out.println("Smileys");
//                                case 7:
//                                    System.out.println("Message settings");
//                                    System.out.println("""
//                                            1--->  Set
//                                            2---> Common
//                                            """);
//                                    int messageSettingsInput = scanner.nextInt();
//                                    switch (messageSettingsInput) {
//                                        case 1:
//                                            System.out.println("""
//                                                    1--> Message centre number
//                                                    2--> Messages sent as
//                                                    3--> Message validity
//                                                    """);
//                                            int messages = scanner.nextInt();
//                                            switch (messages) {
//                                                case 1:
//                                                    System.out.println("message centre number");
//                                                    break;
//                                                case 2:
//                                                    System.out.println("message sent as");
//                                                    break;
//                                                case 3:
//                                                    System.out.println("message validity");
//                                                    break;
//                                            }
//                                        case 2:
//                                            System.out.println("Common");
//                                            System.out.println("""
//                                                    1 --> Delivery reports
//                                                    2 --> Reply  via same centre
//                                                    3---> Character support
//                                                                                 """);
//
//                                            int myMessages = scanner.nextInt();
//                                            switch (myMessages) {
//                                                case 1:
//                                                    System.out.println("delivery reports");
//                                                    break;
//                                                case 2:
//                                                    System.out.println("reply via same centre");
//                                                    break;
//                                                case 3:
//                                                    System.out.println("character support");
//                                                    break;
//
//
//                                                case 8:
//                                                    System.out.println("info service");
//                                                    break;
//                                                case 9:
//                                                    System.out.println("voice mailbox number");
//                                                    break;
//                                                case 10:
//                                                    System.out.println("service command editor");
//                                                    break;
//                                            }
//                                    }
//
//                            }
//
//                            int chat = scanner.nextInt();
//                            switch (chat) {
//                                case 1:
//                                    System.out.println("chat");
//                                    break;
//                            }
//
//
//                    }
//
//
//                    int callRegister = scanner.nextInt();
//                    switch (callRegister) {
//                        case 1:
//                            System.out.println("""
//                                    1---> Missed calls
//                                    2---> Received calls
//                                    3--> Dialed numbers
//                                    4--> Erase recent call lists  """);
//
//                            int call = scanner.nextInt();
//                            switch (call) {
//                                case 1:
//                                    System.out.println("1. Missed call");
//                                    break;
//                                case 2:
//                                    System.out.println("2. Received calls");
//                                    break;
//                                case 3:
//                                    System.out.println("3. Dialled numbers");
//                                    break;
//                                case 4:
//                                    System.out.println("Erase resent call lists");
//
//
//                                    int showCallDuration= scanner.nextInt();
//                                    switch (showCallDuration){
//                                        case 1:
//                                            System.out.println("""
//                                                    1.last call duration
//                                                    2.all calls duration
//                                                    3.received calls duration
//                                                    4. dialed calls duration
//                                                    5. clear  timers
//                                                    """);
//
//                                            int callDuration = scanner.nextInt();
//                                            switch (callDuration) {
//                                                case 1:
//                                                    System.out.println("last call duration");
//                                                    break;
//                                                case 2:
//                                                    System.out.println("all calls duration");
//                                                    break;
//                                                case 3:
//                                                    System.out.println("received calls duration");
//                                                    break;
//                                                case 4:
//                                                    System.out.println("dialed calls duration");
//                                                    break;
//                                                case 5:
//                                                    System.out.println("clear timers");
//                                                    break;
//
//                                                    int showCallCosts = scanner.nextInt();
//                                                    switch (showCallCosts){
//                                                        case 1:
//                                                            System.out.println("""
//                                                                    1. Last call cost
//                                                                    2. All calls cost
//                                                                    3. Clear counters
//                                                                    """);
//
//                                                            int showCallCosts = scanner.nextInt();
//                                                            switch (showCallCosts){
//                                                                case 1:
//                                                                    System.out.println("last call cost");
//                                                                    break;
//                                                                case 2:
//                                                                    System.out.println("all calls cost");
//                                                                    break;
//                                                                case 3 :
//                                                                    System.out.println("clear counters");
//                                                                    break;
//
//                                                                    int callCostSettings = scanner.nextInt();
//                                                                    switch (callCostSettings){
//                                                                        case 1:
//                                                                            System.out.println("""
//                                                                                    1. call cost limit
//                                                                                    2. show costs in
//                                                                                    """);
//
//                                                                            int CostSettings = scanner.nextInt();
//                                                                            switch (CostSettings){
//                                                                                case 1:
//                                                                                    System.out.println("call cost limit");
//                                                                                    break;
//                                                                                case 2:
//                                                                                    System.out.println("show costs in");
//                                                                                    break;
//
//                                                                                    int prepaidCredit
//
//
//
//                                                                            }
//                                                                    }
//
//
//
//
//                                                            }
//
//
//
//                                                    }
//
//
//
//
//                    }
//
//
//
//
//                                    }
//                            }
//                    }
//
//                    }
//
//                }
//        }
//    }
//}
//
