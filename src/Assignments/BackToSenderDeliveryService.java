package Assignments;

public class BackToSenderDeliveryService {
    public double CalculateRidersPayment(int collectionRate) {
        double ridersWage = 0;
        
        if(collectionRate< 50){
            ridersWage = collectionRate*160+ 5000;
        } else if (collectionRate >=50 && collectionRate <= 59) {
            ridersWage =  collectionRate*200+ 5000;

        }else if (collectionRate >= 60 && collectionRate <= 69){
            ridersWage = collectionRate*250 + 5000;

        }else if (collectionRate >= 70 ) {
            ridersWage = collectionRate*500 + 5000;
        }
        return ridersWage;
    }
}
