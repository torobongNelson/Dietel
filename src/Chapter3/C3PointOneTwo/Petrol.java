package Chapter3.C3PointOneTwo;

public class Petrol
{
    public static void main(String[] args) {
        PetrolPurchase purchase = new PetrolPurchase ("marian","PMS",50,30000.000,10.00 );
        double totalAmount = purchase.getPurchaseAmount();
        double discountRate = purchase.getPercentageDiscount();
        System.out.println(totalAmount);
        System.out.println(discountRate);
    }

}
