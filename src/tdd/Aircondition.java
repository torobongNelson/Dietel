package tdd;

public class Aircondition {
    public boolean iHaveAircondition = true;
    public boolean isAirConditionOn = false;
    public int temperature = 25;
    public int previousTemperature = temperature;


    public boolean turnOnAc() {
        return isAirConditionOn = true;
    }

    public boolean CheckIfAcIsOn(){
        return this.isAirConditionOn;
    }

    public boolean turnAcOff(){
        return this.isAirConditionOn = false;
    }
    public boolean CheckIfAcIsOff(){
        return this.isAirConditionOn;
    }


    public int inreaseTemperature(){
        this.previousTemperature = this.temperature;
        return this.temperature ++;
    }

    public int getTemperature(){
        return this.temperature;
    }
    public boolean hasTemperatureIncreased(){
        if(this.temperature > this.previousTemperature){
           return true;
        }
        return false;
    }

    public int decreaseTemperature(){
        this.previousTemperature = this.temperature;
        return this.temperature --;
    }

    public boolean hasTemperatureDecreased() {
        if(this.temperature < this.previousTemperature){
            return true;
        }
        return false;
    }

    public int increaseTemperatureBeyond30(int increaseValue){
        int currentTemp = this.temperature + increaseValue;
        if(currentTemp > 30){
            this.temperature = 30;
        }else{
            this.temperature = currentTemp;
        }

        return this.temperature;
    }

    public int temperatureIsStill30(){
        return this.getTemperature();
    }

    public int decreaseTemperatureBelow16(int decreaseValue) {
        int currentTemp = this.temperature - decreaseValue;
        if(currentTemp < 16){
            this.temperature = 16;
        }else{
            this.temperature = currentTemp;
        }
        return this.temperature;
    }
    public int temperatureIsStill16() {
        return this.getTemperature();
    }
}