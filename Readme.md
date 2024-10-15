# Multithreaded Ball Simulation

This project simulates the movement of balls bouncing within a window, where each ball is managed by its own thread, demonstrating multithreading in Java.

## Features
- **Ball Movement**: Each ball moves autonomously and bounces off the window borders.
- **Multithreading**: Each ball is controlled by a separate thread, allowing concurrent movement of multiple balls.
- **Dynamic Ball Addition**: A button allows the user to add new balls dynamically, with each ball being managed by a new thread.

## Classes

### `ball` (Implements `Runnable`)
Handles the movement of individual balls. Each ball runs on a separate thread to enable parallel execution.

- **Attributes**:
  - `x`, `y`: Position of the ball.
  - `dx`, `dy`: Direction of the ball's movement.
  - `speed`: The speed of movement.
  - `speeds`: Possible speed values for the ball.
  - `drawPanel`: A reference to the drawing panel for rendering.

- **Methods**:
  - `move1()`: Updates the position of the ball based on its direction (`dx`, `dy`). Changes direction when a ball hits the borders of the window.
  - `run()`: An infinite loop that continuously updates the ball's position and redraws the panel.

### `draw`
Responsible for rendering the balls. It extends `JPanel` and handles the drawing of each ball in the list.

- **Attributes**:
  - `balls`: A list that holds the ball objects to be displayed.

- **Methods**:
  - `addBall(ball b)`: Adds a ball to the list for rendering.
  - `paintComponent(Graphics g)`: Redraws all the balls each time it is called.

### `Main`
The entry point for the program. It sets up the graphical interface and starts a thread for each ball added.

- **Components**:
  - `drawPanel`: The panel where the balls are drawn.
  - `button`: A button labeled `"Add"` to dynamically add new balls.

## How to Run

1. Run the `Main` class to start the application.
2. Click the "Add" button to add a new ball to the simulation. Each ball will appear at a random location and move independently, controlled by its own thread.
3. Watch as the balls bounce around within the window, changing direction when they hit the edges.

## Technologies Used
- **Java**: The primary language for implementing the logic and graphical interface.
- **Swing**: Used for the graphical user interface (GUI) and component management.

## License
This project is open-source and available under the [MIT License](LICENSE).

