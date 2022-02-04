
public class Dashboard implements Comparable{

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

    public int compareTo(Object other) {
        Dashboard d = (Dashboard) other;
        int result = 0;

        if (odometer < d.odometer) {
            result = -1;
        } else if(odometer > d.odometer) {
            result = 1;
        } else if(odometer == d.odometer) {
            if(speedometer < d.speedometer) {
                result = -1;
            } else if(speedometer > d.speedometer) {
                result = 1;
            } else if(speedometer == d.speedometer) {
                if(checkEngine == false && d.checkEngine == true) {
                    result = -1;
                } else if(checkEngine == true && d.checkEngine == false) {
                    result = 1;
                } else if(checkEngine == true && d.checkEngine == true) {
                    result = 0;
                }
            }
        }

        return result;
    }

    public String race(Dashboard other, int acc1, int acc2) {
        Dashboard d2 = (Dashboard) other;
        String result = "";
        int a = acc1;
        int b = acc2;

        for(int c = 0; c < acc1; c++) {
            accelerate();
        }
        for(int d = 0; d < acc2; d++) {
            d2.accelerate();
        }

        if(checkEngine == true && d2.checkEngine == false) {
            result = "First car stalled out!\n\n" + toString() + "\n\n" + d2.toString() + "\n\nCar 2 has won the race!";
        }

        else if(checkEngine == false && d2.checkEngine == true) {
            result = "Second car stalled out!\n\n" + toString() + "\n\n" + d2.toString() + "\n\nCar 1 has won the race!";
        }

        else if(checkEngine == false && d2.checkEngine == false) {
            if(speedometer > d2.speedometer) {
                result = "\n" + toString() + "\n\n" + d2.toString() + "\n\nCar 1 has won the race!";
            }
            else if(speedometer == d2.speedometer) {
                result = "\n" + toString() + "\n\n" + d2.toString() + "\n\nIt's a tie!";
            }
            else if(speedometer < d2.speedometer) {
                result = "\n" + toString() + "\n\n" + d2.toString() + "\nCar 2 has won the race!";
            }
        }
        else if(checkEngine == true && d2.checkEngine == true) {
            result = "First car stalled out! \nSecond car stalled out!\n\n" + toString() + "\n\n" + d2.toString() + "\n\nIt's a tie!";
        }

        return result;
    }

    public String difference(Dashboard other){
        String result = "";
        if(odometer > other.odometer){
            result = "Second car will need to drive for "+( 60*(odometer - other.odometer)/other.speedometer) +" minutes to catch first car.";
        }
        if(odometer < other.odometer){
            result = "First car will need to drive for "+( 60*(other.odometer - odometer)/speedometer) +" minutes to catch second car.";
        }
        return result;
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
  