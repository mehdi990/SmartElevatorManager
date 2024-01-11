public class SpecificElevatorHardware implements ElevatorHardware {

    @Override
    public void goUp() {
        // In a real application, this would contain the code to interact with the physical elevator hardware to go up.
        System.out.println("Specific hardware is moving the elevator up.");
    }

    @Override
    public void goDown() {
        // Similarly, this would contain the code to interact with the physical elevator hardware to go down.
        System.out.println("Specific hardware is moving the elevator down.");
    }
}
