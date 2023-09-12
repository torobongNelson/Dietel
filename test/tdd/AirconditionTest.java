package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionTest {
    Aircondition aircondition = new Aircondition();
    @Test
    public void airconditionisOnTest(){
        //given
        boolean isAirConditionOn = aircondition.isAirConditionOn;

         //when
         aircondition.turnOnAc();

        //check
        boolean checkIfAcIsOn = aircondition.CheckIfAcIsOn();
        assertTrue(checkIfAcIsOn,"it is on" );
    }
    @Test
    public void airconditionisOffTest(){
        //given
        boolean iHaveAircondition = aircondition.iHaveAircondition;
        boolean isAirConditionOn = aircondition.isAirConditionOn;

         //when
        boolean turnAcOff = aircondition.turnAcOff();

        //check
        boolean checkIfAcIsOff = aircondition.CheckIfAcIsOff();
        assertFalse(checkIfAcIsOff,"It is off");

    }

    @Test
    public void inreaseTemperatureTest(){
        //given
        int temperature = aircondition.temperature;

        //when
        int increaseTemp = aircondition.inreaseTemperature();
        assertEquals(temperature + 1, aircondition.getTemperature(),"Temperature has increased by 1");

        //check
        boolean hasTempIncreased = aircondition.hasTemperatureIncreased();
        assertTrue(hasTempIncreased,"Temperature has increased");
    }

    @Test
    public void decreaseTemperatureTest(){
        //given
        int temperature = aircondition.temperature;

        //when
        int decreaseTemp = aircondition.decreaseTemperature();
        assertEquals(temperature - 1, aircondition.getTemperature(),"Temperature has decreased by 1");

        //check
        boolean hasTempDecreased = aircondition.hasTemperatureDecreased();
        assertTrue(hasTempDecreased,"Temperature has decreased");
    }

    @Test
    public void increaseTemperatureBeyond30Test(){
        //given
        int temperature = aircondition.temperature;

        //when
        int increseTempBeyond30 = aircondition.increaseTemperatureBeyond30( temperature + 4);

        //check
        int tempIsStill30 = aircondition.temperatureIsStill30();
        assertEquals(30, tempIsStill30, "Temperature is still 30");

    }
    @Test
    public void decreaseTemperatureBelow16Test(){
        //given
        int temperature = aircondition.temperature;

        //when
        int decreseTempBelow16 = aircondition.decreaseTemperatureBelow16( temperature - 10);

        //check
        int tempIsStill16 = aircondition.temperatureIsStill16();
        assertEquals(16, tempIsStill16, "Temperature is still 16");

    }

}




