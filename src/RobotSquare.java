import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot scrapsandtrash = new Robot("batman");
		// 3. Put the robot's pen down
		scrapsandtrash.penDown();

		// 6. Make the robot move as fast as possible
		scrapsandtrash.setSpeed(12);
		// 5. Do everything below here 4 times
		for (int i = 0; i < 4.; i++) {
			System.out.println("Keit shi yi ge pi gu");
			scrapsandtrash.move(200);
			// 4. Turn the robot 90 degrees to the right (90 degrees)
			scrapsandtrash.turn(90);
		}
		// 2. Move your robot 200 pixels

	}
}
