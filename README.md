### Elevator Simulation Report

#### **Project Overview:**
This project simulates how an elevator works. It handles requests from different floors, moves the elevator, and tracks statistics like time taken and how often each floor calls the elevator.

#### **Design Choices:**
1. **Classes:**
   - **Elevator:** This class handles the elevator's current floor, processes floor requests, and calculates the time taken for each trip.
   - **Simulation:** Manages the simulation, generates random calls, and tracks call frequencies for each floor.
   - **Main:** Collects user input, starts the simulation, and shows the results.

2. **Data Structures:**
   - **Queue:** Stores the floor requests. It makes sure the elevator processes calls in the order they come in.
   - **Map:** Keeps track of how many times each floor has called the elevator.
   - **Array:** Used to track how many times each floor is called during the simulation.

3. **Algorithm:**
   - **Random Call Generation:** The simulation creates random calls for a set duration and stores them in the elevator's queue.
   - **Request Processing:** The elevator moves to each requested floor and calculates the time taken for each trip.

4. **Input/Output:**
   - **Input:** The user provides the number of floors, max passengers, and the simulation duration.
   - **Output:** The program shows the total time taken and the frequency of calls for each floor.

#### **Challenges:**
1. **Random Calls:** Generating random calls and managing them effectively.
2. **Call Processing:** Ensuring the elevator processes requests in the correct order.
3. **Performance:** Ensuring the simulation runs smoothly for longer durations.

#### **Improvements:**
1. **Call Frequency Tracking:** Added a map to track how often each floor calls the elevator.
2. **Clear Output:** Improved the output format to display results clearly.

#### **Data Structures and Algorithms:**
1. **Queue:** Used to handle floor requests in the order they are made.
2. **Map:** Tracks call frequency for each floor.
3. **Array:** Tracks how often each floor is called.
4. **Random Numbers:** Used to generate random floor requests.

#### **Future Improvements:**
1. **Elevator Capacity:** Limit the number of passengers per trip.
2. **Prioritize Requests:** Handle more important or urgent calls first.
3. **Graphical Interface:** Add a simple visual for the elevator’s movement.
4. **Real-Time Simulation:** Add real-time delays to make the simulation more realistic.
