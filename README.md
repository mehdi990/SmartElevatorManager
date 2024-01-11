# SmartElevatorManager

## Description
SmartElevatorManager is an advanced elevator control system developed in Java, designed to simulate the operation of an elevator within a building. It utilizes object-oriented programming principles to manage elevator movements and respond to floor requests efficiently.

The system features two primary commands for elevator movement:
- `goUp()`: Moves the elevator up by one floor.
- `goDown()`: Moves the elevator down by one floor.

In addition to basic movements, the system has advanced functionalities:
- `addRequest(int floor)`: Adds a new floor request to the elevator's queue. It ensures that the requested floor is within the building's range and not already in the queue.
- `processRequests()`: Processes and executes all queued floor requests in an optimized order. It sorts the requests to minimize the travel distance, moving to each requested floor in sequence and handling each request efficiently.

## Installation
To install and run the SmartElevatorManager:
1. Ensure Java is installed on your system. If not, download and install it from [Oracle's official website].
2. Download the project files to your local machine.
3. Navigate to the project directory in your terminal or command prompt.
4. Compile the Java files using the command: `javac Elevator.java Controller.java`.
5. Run the application with: `java Controller`.

## Usage
Execute `Controller.java` to start the program. The application will simulate elevator movements based on predefined scenarios in the `main` method of the `Controller` class.

## Contact
For any inquiries or further information, feel free to contact me at [elmehdi.elmouden@uphf.fr].
