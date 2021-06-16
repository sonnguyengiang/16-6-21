public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";
    public Fan(){

    }
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan{" +
                    "slow=" + slow +
                    ", medium=" + medium +
                    ", fast=" + fast +
                    ", speed=" + speed +
                    ", on= fan is on" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan{" + "fan is off" +
                    '}';
        }
    }
}
