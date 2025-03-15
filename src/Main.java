import java.util.*;

class Elevator {
    private int currentFloor;
    private int maxPassengersPerTrip;
    private int totalTimeTaken;
    private Queue<Integer> requests;
    private Map<Integer, Integer> callFrequency;

    public Elevator(int numFloors, int maxPassengers) {
        this.currentFloor = 0;
        this.maxPassengersPerTrip = maxPassengers;
        this.totalTimeTaken = 0;
        this.requests = new LinkedList<>();
        this.callFrequency = new HashMap<>();
    }

    public void callElevator(int floor) {
        requests.offer(floor);
        callFrequency.put(floor, callFrequency.getOrDefault(floor, 0) + 1);
    }

    public void processRequests() {
        while (!requests.isEmpty()) {
            int destination = requests.poll();
            moveToFloor(destination);
            unloadPassengers();
        }
    }

    private void moveToFloor(int targetFloor) {
        totalTimeTaken += Math.abs(currentFloor - targetFloor);
        currentFloor = targetFloor;
    }

    private void unloadPassengers() {
        // Simulate unloading passengers
    }

    public void displayStatistics() {
        System.out.println("Total time taken: " + totalTimeTaken + " minutes");
        System.out.println("Call Frequency by Floor:");
        for (Map.Entry<Integer, Integer> entry : callFrequency.entrySet()) {
            System.out.println("Floor " + entry.getKey() + ": " + entry.getValue() + " calls");
        }
    }

    public int getTotalTimeTaken() {
        return totalTimeTaken;
    }
}

class Simulation {
    private int numFloors;
    private int maxPassengers;
    private int duration;
    private Elevator elevator;
    private int[] callFrequencies;

    public Simulation(int numFloors, int maxPassengers, int duration) {
        this.numFloors = numFloors;
        this.maxPassengers = maxPassengers;
        this.duration = duration;
        this.elevator = new Elevator(numFloors, maxPassengers);
        this.callFrequencies = new int[numFloors];
    }

    public void startSimulation() {
        generateRandomCalls();
        elevator.processRequests();
    }

    private void generateRandomCalls() {
        Random random = new Random();

        for (int i = 0; i < duration * 10; i++) {  // Random calls over the specified duration
            int randomFloor = random.nextInt(numFloors);
            elevator.callElevator(randomFloor);
            trackFloorCalls(randomFloor);
        }
    }

    private void trackFloorCalls(int floor) {
        callFrequencies[floor]++;
    }

    public void displayResults() {
        elevator.displayStatistics();
        System.out.println("Frequency of Calls per Floor:");
        for (int i = 0; i < numFloors; i++) {
            System.out.println("Floor " + i + ": " + callFrequencies[i] + " calls");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read simulation parameters from the user
        System.out.println("Welcome to Elevator Simulation!");
        System.out.println("Initializing elevator system...");

        System.out.print("Enter number of floors: ");
        int numFloors = scanner.nextInt();
        System.out.print("Enter maximum passengers per trip: ");
        int maxPassengers = scanner.nextInt();
        System.out.print("Enter simulation duration (in minutes): ");
        int duration = scanner.nextInt();

        Simulation simulation = new Simulation(numFloors, maxPassengers, duration);
        simulation.startSimulation();

        System.out.println("\nSimulation completed.");
        simulation.displayResults();

        System.out.println("\nThank you for using Elevator Simulation!");
        scanner.close();
    }
}
