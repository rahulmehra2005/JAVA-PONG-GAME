# JAVA-PONG-GAME
This is a Java-based Pong Game built using Swing and AWT libraries. It features two-player gameplay with paddle control via keyboard, dynamic ball movement, collision detection, and real-time score tracking. 
The game demonstrates object-oriented principles like classes for Ball, Paddle, Score, and GamePanel, providing an interactive, visually appealing experience. Ideal for learning GUI programming, event handling, and basic game mechanics in Java.

Approach

Modular Design: Separate classes for Ball, Paddle, Score, GamePanel, and GameFrame.

Game Loop: Implemented using Runnable interface for smooth animation at 60 FPS.

Keyboard Control: KeyAdapter handles paddle movement for both players.

Collision Handling: Detects ball collisions with walls and paddles, updates velocity accordingly.

Functions Used

paint(Graphics g) – Custom rendering of game elements.

move() – Updates paddle and ball positions.

checkCollision() – Manages ball interactions and score updates.

draw(Graphics g) – Draws ball, paddles, and scores.

keyPressed & keyReleased – Captures user input for paddle movement.

Challenges & Solutions

Smooth Animation: Initially, flickering occurred; solved by implementing double buffering (createImage() and graphics).

Collision Accuracy: Ball sometimes passed through paddles; fixed by precise boundary checks and velocity adjustments.

Input Responsiveness: Ensured simultaneous key detection for both players using custom KeyAdapter.
