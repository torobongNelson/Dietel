package Chapter4;

import java.util.Arrays;
import java.util.List;

public class CitizensTaxCalculator {
    public static void main(String[] args) {
        Citizens alex = new Citizens("Alex",50000);
        Citizens amara = new Citizens("Amara",30000);
        Citizens maxwell = new Citizens("Maxwell",40000);
        Citizens daniel = new Citizens("Daniel",22000);

        List<Citizens> citizensList = Arrays.asList(alex,amara,maxwell, daniel);
        calculateTax(citizensList);
    }



//4.20 (Tax Calculator) Develop a Java application that determines the total tax for each of three
//    citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
//    earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
//    a given year. Your program should input this information for each citizen, then determine and dis-
//    play the citizen’s total tax. Use class Scanner to input the data.

    public static void calculateTax(List<Citizens> citizens ){
       for(int i = 0; i< citizens.size(); i++){
           Citizens citizen = citizens.get(i);

           int earnings = citizen.getEarnings();
           String name = citizen.getName();

           int aboveThirtyKTaxRate = 20;
           int belowThirtyKTaxRate = 15;
           int taxTotal;

           if( earnings > 30000){
               taxTotal = earnings / 100 * aboveThirtyKTaxRate;
               System.out.println("Your tax for this year is " + taxTotal );
           }

           if (earnings <= 30000){
               taxTotal = earnings / 100 * belowThirtyKTaxRate;
               System.out.println("Your tax for this year is " + taxTotal );
           }
           }
       }

    }

