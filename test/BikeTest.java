/** import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
   Bike bike = new Bike();

   @Test
   public void bikeIsOnTest(){
        //given that i have a bike and its off
        boolean  iHaveABike;
        boolean isBikeOn ;


    //when i turn on my bike
        bike.turnBikeOn();

      //check that my bike is on
      boolean confirmBikeIsOn =   bike.confirmThatTBikeIsOn();
         assertTrue(confirmBikeIsOn, "The bike on" );
    }
    @Test
    public void bikeIsOffTest(){
       boolean  turnBikeOff = bike.turnBikeOff();
        boolean confirmBikeIsOff = bike.confirmBikeIsOff();
        assertFalse(confirmBikeIsOff,"The bike is off");
    }

    @Test
    public void bikeAcceleratesInIncrementOfOne(){
     //when bike is on gear one
     bike .accelerateByOne(1);

     //check that it accelerates by one
     int doesBikeAccByOne = bike.confirmThatBikeAcceleratesByOne();
     assertEquals(1, doesBikeAccByOne );

    }

    @Test
    public void bikeAcceleratesInIncrementOfTwo(){
        //when bike is on gear two
       bike.accelerateByTwo(2);

       //check that the bike accelerates by two
       int doesBikeAccByTwo  = bike.confirmThatBikeAcceleratesByTwo();
     assertEquals(2, doesBikeAccByTwo );

    }
   @Test
   public void bikeAcceleratesInIncrementOfThree(){
     //when bike is on gear three
     bike.accelerateByThree(3);

     //check that the bike accelerates by three
     int doesBikeAccByThree = bike.confirmThatBikeAcceleratesByThree();
     assertEquals(3, doesBikeAccByThree );

    }
    @Test
    public void bikeAcceleratesInIncrementOfFour(){
     //when bike is on gear four
     bike.accelerateByFour(4);

     //check that the bike accelerates by four
     int doesBikeAccByFour= bike.confirmThatBikeAcceleratesByFour();
     assertEquals(4, doesBikeAccByFour );

    }

    @Test
     public void bikeDecceleratesInDecrementsOfOne(){
        //when bike is on gear one
        bike.deccelerateByOne(1);

     //check that the bike decelerates by one
     boolean doesBikeDeccByOne=  bike.confirmThatBikeDeceleratesByOne();
     assertTrue( doesBikeDeccByOne,"Bike decelerates by exactly one" );

    }
   @Test
   public void bikeDecceleratesInDecrementsOfTwo(){
        //when bike is on gear two
        bike.deccelerateByTwo(2);

        //check that the bike decelerates by two
        boolean doesBikeDeccByTwo=  bike.confirmThatBikeDeceleratesByTwo();
        assertTrue( doesBikeDeccByTwo,"Bike decelerates by exactly two" );

    }
   @Test
   public void bikeDecceleratesInDecrementsOfThree(){
        //when bike is on gear three
        bike.deccelerateByThree(3);

        //check that the bike decelerates by three
        boolean doesBikeDeccByThree=  bike.confirmThatBikeDeceleratesByThree();
        assertTrue( doesBikeDeccByThree,"Bike decelerates by exactly three" );

    }
   @Test
   public void bikeDecceleratesInDecrementsOfFour(){
        //when bike is on gear four
        bike.deccelerateByFour(4);

        //check that the bike decelerates by four
        boolean doesBikeDeccByFour=  bike.confirmThatBikeDeceleratesByFour();
        assertTrue( doesBikeDeccByFour,"Bike decelerates by exactly four" );

    }
    public void bikeSpeedIsTwenty(){
        bike.
    }
    public void bikeSpeedHasIncreasedFromTwentyOneToThirty(){

    }
    public void bikeSpeedHasIncreasedFromThirtyOneToFourty(){

    }
    public void bikeSpeedHasIncreasedToFourtyOne(){

    }


}
*/