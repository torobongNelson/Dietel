package Assignments;

public class CreditCardValidator {

    private int getCardDetailsLength(String cardDetails){
        return cardDetails.length();
    }
    private boolean isCardDigitLengthValid(String cardDetails){
        if(cardDetails.length() >= 13 && cardDetails.length() <= 16){
            return true;
        }
        return false;
    }

    private String getCardType(String cardDetails){

       if(cardDetails.startsWith("4")){
           return "Visa Card";
       }
       else if(cardDetails.startsWith("5")){
            return  "Master Card";
       }
       else if (cardDetails.startsWith("6")){
           return "Discover Card";

       } else if (cardDetails.startsWith("37")) {
           return "American Express Card";
       }

       return "Invalid card type";
   }

    private String isCardDetailsValid(String cardDetails) {
       int sum = 0;
       boolean doubleDigit = false;

       for (int i = cardDetails.length() - 1; i >= 0; i--) {
           int digit = Character.getNumericValue(cardDetails.charAt(i));

           if (doubleDigit) {
               digit = digit *  2;
               if (digit > 9) {
                   digit = digit % 10 + digit / 10;
               }
           }

           sum += digit;
           doubleDigit = !doubleDigit;
       }

       if(sum % 10 == 0) {
           return "Valid";
       }else{
           return "Invalid";
       }
   }

    public void processedCardDetail( String cardDetails){
        boolean checkCardDetailLength =  isCardDigitLengthValid(cardDetails);

        if(checkCardDetailLength){
            System.out.print("***************************************" + "\n");
            System.out.print("**Credit Card Type: "            + this.getCardType(cardDetails) + "\n");
            System.out.print("**Credit Card Number: "          + cardDetails + "\n");
            System.out.print("**Credit Card Digit Length: "    + this.getCardDetailsLength(cardDetails) + "\n");
            System.out.print("**Credit Card Validity Status: " + this.isCardDetailsValid(cardDetails) + "\n");
            System.out.print("***************************************");
        }else{
            System.out.print("please be informed,Card Detail must be between 13 and 16 in length.");
        }

    }


}
