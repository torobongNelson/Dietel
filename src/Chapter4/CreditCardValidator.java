package Chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCardValidator {
    public static void main(String[] args) {
            Customer nelson = new Customer(
                    "Nelson", 006675L,
                    50000,200000,
                    50000,100000 );

            Customer praise = new Customer("Praise",45678082L,
                    30000,15000,
                    150000,40000);

            Customer pexie = new Customer("Pixie",66656077L,
                    60000,50000,
                    30000,20000);

             List<Customer> customersList = Arrays.asList(nelson,pexie,praise);

        creditValidator(customersList);
    }

//    The program should input all these facts as integers, calculate the new balance (= beginning balance
//+ charges – credits), display the new balance and determine whether the new balance exceeds the
//    customer’s credit limit. For those customers whose credit limit is exceeded, the program should dis-
//    play the message "Credit limit exceeded".

    // int newBalance = beginingBalance + charges - credits;

    public static void creditValidator(List<Customer> customers){
        for(int i = 0; i< customers.size(); i++){
            Customer customer = customers.get(i);

            String customerName = customer.getName();
            int beginingBalance = customer.getBeginningOfTheMonthBalance();
            int customerCharges = customer.getTotalItemsChargedThisMonth();
            int customerCredits = customer.getTotalCreditsAppliedToCustomer();
            int creditLimit = customer.getCreditLimit();

            int newBalance = beginingBalance + customerCharges - customerCredits;

            if(newBalance > creditLimit){
                System.out.println(" Dear " + customerName + ", you have exceeded your Credit limit");
            }else{
                System.out.println("Good to shop " + customerName );
            }

        }

    }




}
