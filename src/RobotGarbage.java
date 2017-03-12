import org.jointheleague.graphical.robot.Robot;

public class RobotGarbage {
	public static void main(String[] args) {
		Robot something = new Robot("mini");
		something.setSpeed(12);
		something.penDown();
		something.turn(45);
		something.move(60);
		something.turn(90);
		something.move(60);
		something.turn(180);
		something.move(30);
		something.turn(-45);
		something.move(40);
		something.penUp();
		something.setAngle(90);
		something.move(80);
		something.setAngle(180);
		something.penDown();
		something.move(45);
		something.turn(180);
		something.move(45);
		something.turn(45);
		something.move(25);
		something.turn(180);
		something.move(25);
		something.turn(90);
		something.move(25);

	}
}
