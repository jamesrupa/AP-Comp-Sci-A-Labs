import java.util.ArrayList;

public class FreightTrain {
    // An ArrayList that stores a train with multiple boxcars
    private ArrayList<Boxcar> train = new ArrayList<Boxcar>();


    // Default constructor that sets train to an ArrayList holding one
    // boxcar containing 5 gizmos, that is not in repair.
    public FreightTrain() {
        Boxcar boxcar = new Boxcar();
        train.add(boxcar);
    }

    // A constructor that sets train to an ArrayList of size n, holding
    // n boxcars, that are all hold 5 gizmos and are not in repair. If n <= 0,
    // then the train should be set to size one, with a single boxcar containing
    // 5 gizmos and not in repair.
    public FreightTrain(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                train.add(new Boxcar());
            }
        } else {
            train.add(new Boxcar());
        }
    }

    // This method returns a String representation of the
    // Boxcar objects in the ArrayList, one per line. For example,
    // here is the String returned when toString is called on a
    // FreightTrain with 5 boxcars:
    //
    // 3 gadgets    in service
    // 2 wadgets    in service
    // 0 gizmos    in repair
    // 7 gadgets    in service
    // 0 gadgets    in repair
    //
    // Note: there is one space between the number of units and
    // the cargo type, and a tab between the cargo type and
    // "in repair"/"in service".
    public String toString() {
        String string = "";
        for (Boxcar i: train) {
            string = string + i + "\n";
        }
        return string;
    }

    // This method sets the cargo type of all the boxcars in the entire train.
    public void setCargo(String c) {
        for (Boxcar a: train) {
            a.setCargo(c);
        }
    }

    // This method sets the boxcars to the pattern "gizmos", "gadgets", "widgets",
    // "wadgets", "gizmos", "gadgets", "widgets", "wadgets", ...
    // until the end of the train.
    public void setMultiCargo() {
        int flag = 0;
        for (Boxcar b: train) {
            if (flag == 0) {
                b.setCargo("gizmos");
                flag++;
            }
            else if (flag == 1) {
                b.setCargo("gadgets");
                flag++;
            }
            else if (flag == 2) {
                b.setCargo("widgets");
                flag++;
            }
            else {
                b.setCargo("wadgets");
                flag = 0;
            }
        }
    }

    // This method fills every boxcar in the train to max capacity of 10.
    // Each individual boxcar can only hold cargo if its
    // repair variable is false.
    public void fillTrain() {
        for (Boxcar c: train) {
            if (c.isFull() == false) {
                while (!c.isFull()) {
                    c.loadCargo();
                }
            }
        }
    }

    // This method sets the Boxcar at location i’s repair variable to true.
    public void callForRepair(int i) {
        train.get(i).callForRepair();
    }
}

