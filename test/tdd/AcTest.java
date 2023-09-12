package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {
     Ac myAirconditioner = new Ac();
     boolean  isMyAcOn =  myAirconditioner.isMyAcOn;

    int temp = myAirconditioner.temperature;

   @Test
   public void acIsOnTest(){
       //given that my ac is off
      boolean  isMyAcOn =  myAirconditioner.isMyAcOn;

      //when i turn Ac on
       myAirconditioner.turnOnAc();

       //check that Ac is on
       boolean checkIfAcIsOn    = myAirconditioner.checkIfAcIsOn();
        assertTrue(checkIfAcIsOn, "it is on");
    }

    @Test
    public void acIsOffTest() {
       boolean iHaveAc = myAirconditioner.doIhaveAnAc;

       //Turning off my Ac
        myAirconditioner.turnOffAc();

        //check
        myAirconditioner.checkIfAcIsOff();

    }


    @Test
    public void increaseTemperatureTest(){
       myAirconditioner.increaseAcTemperature();
       assertEquals(temp + 1,  myAirconditioner.getTemperature());

       boolean hasTempIncreased =  myAirconditioner.checkIfTempHasIncreased();
        assertTrue(hasTempIncreased, "temperature has increased");
    }

   @Test
   public void decreaseTemperatureTest(){
       myAirconditioner.decreaseAcTemperature();
       assertEquals(temp -1,  myAirconditioner.getTemperature());

       boolean hasTempDecreased = myAirconditioner.checkIfTempHasdecreased();
       assertTrue(hasTempDecreased,"temperature has decreased ");
    }

    @Test
    public void increaseAcTempBeyond30Test(){
       myAirconditioner.increaseTempBeyond30(temp + 20);

        int tempIsStill30 = myAirconditioner.confirmThatTempIsStill30();
        assertEquals(30, tempIsStill30, "Temperature is still 30");
    }

    @Test
    public void decreaseAcTempBelow16Test(){
        myAirconditioner.decreaseAcTempBelow16(temp - 5);

        int tempIsStill16 =    myAirconditioner.confirmThatTempIsStill16();
        assertEquals(16, tempIsStill16, "Temperature is still 16");
    }



}

