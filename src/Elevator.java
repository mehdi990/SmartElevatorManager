import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Elevator {

    private int currentFloor;

    private final int minFloor=0;

    private final int maxFloor = 10;

    private List<Integer> requests;


    private ElevatorHardware hardware;


    // Constructor to initialize the elevator at a specific floor
    public Elevator(int currentFloor, ElevatorHardware hardware ) {
        this.currentFloor = currentFloor;
        this.hardware=hardware;
        this.requests = new ArrayList<>();
    }

    // Default constructor initializes the elevator at ground floor
    public Elevator(ElevatorHardware hardware) {
        this(0,hardware);
    }

    // Method to move the elevator up by one floor
    public void goUp() {
        if (currentFloor < maxFloor) {
            System.out.println("Elevator going up, now at floor " + currentFloor);
            currentFloor++;
        } else {
            System.out.println("Elevator is already at the top floor.");
        }
    }
    // Overloaded method to move the elevator up by multiple floors
    public void goUp(int floors) {
        int newFloor = currentFloor + floors;
        if (newFloor <= maxFloor) {
            currentFloor = newFloor;
            System.out.println("Elevator going up, now at floor " + newFloor);
        } else {
            System.out.println("Elevator cannot go beyond the top floor.");
        }
    }

    // Method to move the elevator down by one floor
    public void goDown() {
        if (currentFloor > minFloor) {
            currentFloor--;
            System.out.println("Elevator going down, now at floor " + currentFloor);
        } else {
            System.out.println("Elevator is already at the ground floor.");
        }
    }

    // Overloaded method to move the elevator down by multiple floors
    public void goDown(int floors) {
        int newFloor = currentFloor - floors;
        if (newFloor >= minFloor) {
            currentFloor = newFloor;
            System.out.println("Elevator going down, now at floor " + newFloor);
        } else {
            System.out.println("Elevator cannot go below the ground floor.");
        }
    }


    // Method to add a floor request to the elevator
    public void addRequest(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            if (!requests.contains(floor)) {
                requests.add(floor);
                System.out.println("Request added: Elevator to go to floor " + floor);
            } else {
                System.out.println("Request already present: Elevator already has a request for floor " + floor);
            }
        } else {
            System.out.println("Request ignored: Requested floor " + floor + " is outside the valid floor range.");
        }
    }

    // Method to process all floor requests
    public void processRequests() {

        // Sort requests in ascending order
        Collections.sort(requests);

        for (Integer request : requests) {
            if (currentFloor < request) {
                goUp(request - currentFloor);
            } else if (currentFloor > request) {
                goDown(currentFloor - request);
            }

            System.out.println("Elevator arrived at floor " + currentFloor);
        }
        requests.clear();// Clear all processed requests
    }

    // Getter method for the current floor
    public int getCurrentFloor() {
        return currentFloor;
    }
}