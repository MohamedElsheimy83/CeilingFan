
package ceilingfan;

/**
 * 08-08-2022
 * @author Mohamed Elsheimy
 */
public class Fan {
    private int speed = 0;
    private String direction = "Forward";
    
    //setters and getters
    
    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    // constructor
    public Fan(int speed, String direction) {
        this.speed = speed;
        this.direction = direction;
    }
    
    /**
     * Increasing Fan speed
     */
    public void increaseSpeed() {
        if (this.speed == 3) {
            this.speed = 0;
        } else {
            this.speed++;
        }
    }// increaseSpeed

    /**
     * Reversing Fan direction
     */
    public void reverseDirection() {
        if (this.direction.equals("Forward")) {
            this.direction = "Backward";
        } else {
            this.direction = "Forward";
        }
    }// reverseDirection

    @Override
    public String toString(){
        return "Speed: "+this.speed+'\t'+"Direction: "+this.direction;
    }// toString
}
