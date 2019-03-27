package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static Robot[] bots = new Robot[5];
	static Random r = new Random();
	static boolean race = true;

	// 1. make a main method
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			bots[i] = new Robot();
		}
		for (int i = 0; i < bots.length; i++) {
			bots[i].moveTo(90 + 180 * i, 550);
		}
		while (race) {
			for (int i = 0; i < bots.length; i++) {
				bots[i].move(r.nextInt(50));
				if (bots[i].getY() < 0) {
					race = false;
					break;
				}
			}
		}
		// 2. create an array of 5 robots.
		// 3. use a for loop to initialize the robots.
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
