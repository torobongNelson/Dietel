public class Bike {
    boolean iHaveABike = true;
    boolean isBikeOn = false;
    int gear = 0;
    int previousGear = gear;


    int speed = 15;
    int previousSpeed = speed;

    public int getGear() {
        return this.gear;
    }

    public void turnBikeOn() {
        isBikeOn = true;
    }

    public boolean confirmThatTBikeIsOn() {
        return isBikeOn;
    }

    public boolean turnBikeOff() {
        return isBikeOn = false;
    }

    public boolean confirmBikeIsOff() {
        return isBikeOn;
    }

    public int accelerateByOne(int gear) {
        return this.speed = this.speed + gear;
    }

    public int confirmThatBikeAcceleratesByOne() {
        int accelerateByone = this.speed - this.previousSpeed;
        if (accelerateByone == 1) {
            return 1;
        }
        return 0;
    }

    public int accelerateByTwo(int gear) {
        return this.speed = this.speed + gear;
    }

    public int confirmThatBikeAcceleratesByTwo() {
        int accelerateByTwo = this.speed - this.previousSpeed;
        if (accelerateByTwo == 2) {
            return 2;
        }
        return 0;
    }

    public int accelerateByThree(int gear) {
        return this.speed = this.speed + gear;
    }

    public int confirmThatBikeAcceleratesByThree() {
        int accelerateByThree = this.speed - this.previousSpeed;
        if (accelerateByThree == 3) {
            return 3;
        }
        return 0;
    }

    public int accelerateByFour(int gear) {
        return this.speed = this.speed + gear;
    }

    public int confirmThatBikeAcceleratesByFour() {
        int accelerateByFour = this.speed - this.previousSpeed;
        if (accelerateByFour == 4) {
            return 4;
        }
        return 0;

    }

    public int deccelerateByOne(int gear) {
        return this.speed = this.speed - gear;
    }

   public boolean confirmThatBikeDeceleratesByOne(){
       int decelerateByOne = this.previousSpeed - this.speed;
       if (decelerateByOne == 1) {
           return true;
       }
       return false;
    }

    public int deccelerateByTwo(int gear) {
        return this.speed = this.speed - gear;
    }

    public boolean confirmThatBikeDeceleratesByTwo(){
        int decelerateByTwo = this.previousSpeed - this.speed;
        if (decelerateByTwo == 2) {
            return true;
        }
        return false;
    }

    public int deccelerateByThree(int gear) {
        return this.speed = this.speed - gear;
    }

    public boolean confirmThatBikeDeceleratesByThree(){
        int decelerateByThree = this.previousSpeed - this.speed;
        if (decelerateByThree == 3) {
            return true;
        }
        return false;
    }

    public int deccelerateByFour(int gear) {
        return this.speed = this.speed - gear;
    }

    public boolean confirmThatBikeDeceleratesByFour(){
        int decelerateByThree = this.previousSpeed - this.speed;
        if (decelerateByThree == 4) {
            return true;
        }
        return false;
    }

}
