package Assignments;

public class UnifiedTertiaryMatriculationExamination {

    public double calculateUTMECopiesPrice(int numbersOfUTMECopies) {

         double priceOfCopies = 0;
        if(numbersOfUTMECopies >= 1 && numbersOfUTMECopies<= 4){
            priceOfCopies = numbersOfUTMECopies * 2000;

        }
        if(numbersOfUTMECopies >= 5 && numbersOfUTMECopies <= 9){
            priceOfCopies = numbersOfUTMECopies * 1800;
        }
        if(numbersOfUTMECopies >= 10 && numbersOfUTMECopies <= 29){
            priceOfCopies = numbersOfUTMECopies * 1600;
        }
        if(numbersOfUTMECopies >= 30 && numbersOfUTMECopies<= 49) {
            priceOfCopies = numbersOfUTMECopies * 1500;
        }

        if(numbersOfUTMECopies >= 50 && numbersOfUTMECopies<= 99) {
            priceOfCopies = numbersOfUTMECopies * 1300;
        }
        if(numbersOfUTMECopies >= 100 && numbersOfUTMECopies<= 199) {
            priceOfCopies = numbersOfUTMECopies * 1200;
        }
        if(numbersOfUTMECopies >= 200 && numbersOfUTMECopies<= 499) {
            priceOfCopies = numbersOfUTMECopies * 1100;
        }
        if(numbersOfUTMECopies >= 500 ) {
            priceOfCopies = numbersOfUTMECopies * 1000;
        }



        return priceOfCopies;


    }



}
