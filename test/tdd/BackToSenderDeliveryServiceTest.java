package tdd;

import Assignments.BackToSenderDeliveryService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackToSenderDeliveryServiceTest {
    @Test
    public void TestThatBackToSenderDeliveryServiceExist(){
//        given that i have BackToSenderDeliveryService
        BackToSenderDeliveryService deliveryService = new BackToSenderDeliveryService();
//        assert that DeliveryService is not null
        assertNotNull(deliveryService);
    }

    @Test
    public void TestThatICanCalculateRidersPaymentBelowFiftyPercent(){
//    given that BackToSenderDeliveryService exists
        BackToSenderDeliveryService deliveryService = new BackToSenderDeliveryService();
//    when i call a method,calculate riders payment method
        double ridersWage = deliveryService.calculateRidersPayment(40);
        assertEquals(11400,ridersWage );

    }

    @Test
    public void TestThatICanCalculateRidersPaymentBetweenFiftyToFiftynine(){


        BackToSenderDeliveryService deliveryService = new BackToSenderDeliveryService();
        double riderswage= deliveryService.calculateRidersPayment(55);
        assertEquals(16000,riderswage );

    }
    @Test
    public void TestThatICanCalculateRidersPaymentBetweenSixtyToSixtyNine(){

        BackToSenderDeliveryService deliveryService = new BackToSenderDeliveryService();
        double riderswage = deliveryService.calculateRidersPayment(69);
        assertEquals(22250,riderswage);

    }@Test
    public void TestThatICanCalculateRidersPaymentAboveSeventy(){

        BackToSenderDeliveryService deliveryService = new BackToSenderDeliveryService();
        double riderswage = deliveryService.calculateRidersPayment(70);
        assertEquals(40000,riderswage);

    }




    }
