


public class Dashboard {

    private int speed, milesTravelled, speedometer, odometer, miles;
    private boolean checkEngine;
    private String light, nodd;


    public Dashboard() {
        speedometer = 0;
        odometer = 0;
        // checkEngine --> off is false
        // checkEngine --> on is true
        checkEngine = false;
    }

    public Dashboard(int milesTravelled, int speed) {
        if (milesTravelled >= 0 && milesTravelled <= 99999) {
            odometer = milesTravelled;
        } else {
            odometer = 0;
            checkEngine = true;
        }
        if (speed >= 0 && speed <= 100) {
            speedometer = speed;
        } else {
            speedometer = 0;
            checkEngine = true;
        }
    }

    public void accelerate() {
        speedometer++;
        if (speedometer <= 100) {
            speedometer += speed;
        } else {
            speedometer = 0;
            checkEngine = true;
        }
    }

    public void drive(int numMinutes) {
        miles = ((speedometer * numMinutes) / 60);
        odometer += miles;
        if (odometer > 99999) {
            odometer = 0;
            checkEngine = true;
        }
    }

    public String toString() {
        if (checkEngine){
            light = "On";
        } else {
            light = "Off";
        }
        nodd = String.format("%05d", odometer);
        // Make the odometer have a format of 00000 instead of 0
        return "Speedometer: " + speedometer + " MPH\nOdometer: " + nodd + "\nCheck Engine: " + light;
    }
}
  