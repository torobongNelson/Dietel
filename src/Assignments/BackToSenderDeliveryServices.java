package Assignments;

public class BackToSenderDeliveryServices {
    public static void main(String[] args) {
       ridersAllocation(25);
    }

    public static void ridersAllocation(int collectionRate){
        int result=0;
        if(collectionRate < 50 ){
            result = collectionRate*160 + 5000;
            System.out.println(result);
        } else if (collectionRate >=50 && collectionRate<=59 ) {
            result = collectionRate * 200 + 5000;
            System.out.println(result);
        } else if (collectionRate >= 60 && collectionRate <= 69) {
            result = collectionRate*250 + 5000;
            System.out.println(result);
        }else if (collectionRate >=70){
            result = collectionRate * 500 + 5000;
            System.out.println(result);


            }

    }

}
