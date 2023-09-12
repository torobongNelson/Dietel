package tdd;

public class Ac {
    public boolean doIhaveAnAc = true;
   public boolean isMyAcOn = false;

   public int temperature = 15;

   public int previousTemperature = temperature;

    public void turnOnAc(){
         //i am checking if the ac is off before turning it on
              if( isMyAcOn == false){
                 isMyAcOn = true;
             }
        }
     public boolean checkIfAcIsOn(){
           return isMyAcOn;
     }

     public void turnOffAc(){
        if(isMyAcOn == true){
            isMyAcOn = false;
        }
     }

     public boolean checkIfAcIsOff(){
        return isMyAcOn;
     }

     public int getTemperature( ){
        return  temperature;
     }
     public int increaseAcTemperature(){
        return temperature ++;
     }

     public boolean checkIfTempHasIncreased(){
        if(temperature > previousTemperature){
            return true;
        }else{
            return false;
        }
     }

    public int decreaseAcTemperature() {
        return temperature--;
    }

    public boolean checkIfTempHasdecreased() {
        if(temperature < previousTemperature){
            return true;
        }else{
            return false;
        }
    }

    public int increaseTempBeyond30(int increaseBy) {
        int currentTemperature = temperature + increaseBy;
        if(currentTemperature > 30){
           return  temperature = 30;
        }
        return temperature;

    }

    public int confirmThatTempIsStill30() {
        return this.getTemperature();
    }

    public int decreaseAcTempBelow16(int decreaseBy) {
        int currentTemp = temperature - decreaseBy;
        if(currentTemp < 16){
            return temperature = 16;
        }

        return temperature;
    }

    public int confirmThatTempIsStill16() {
        return this.getTemperature();
    }
}



