public class Controller {

    public static void main(String[] args) {

        ElevatorHardware hardware = new SpecificElevatorHardware();
        Elevator elevator1 = new Elevator(4,hardware);


        elevator1.goUp();
        elevator1.goDown();
        elevator1.addRequest(15);
        elevator1.processRequests();

        System.out.println("Elevator 1 is currently at floor " + elevator1.getCurrentFloor());



        Elevator elevator2 = new Elevator(hardware);

        elevator2.goUp();
        elevator2.goDown();
        elevator2.addRequest(5);
        elevator2.processRequests();
        System.out.println("Elevator 2 is currently at floor " + elevator2.getCurrentFloor());

    }

}
