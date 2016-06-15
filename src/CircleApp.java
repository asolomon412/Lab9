import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		// Create a Scanner object for user input.
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Circle Tester!");
		System.out.println();

		int count = 1;
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Ask user to input circle radius
			System.out.print("Enter the radius: ");
			double radius = scan.nextDouble();

			// Create a Circle object passing in user input
			Circle circle = new Circle(radius);

			// Display circle information
			System.out.println("Area: " + circle.getArea());
			System.out.println("Circumference: " + circle.getCircumference());

			// Ask user if they want to continue
			System.out.println();
			System.out.print("Would you like to continue? (y/n) ");

			// Garbage scan used to prevent the scanner from missing user input
			scan.nextLine();

			// Actual scan that grabs user response for input test
			choice = scan.nextLine();
			if (choice.equalsIgnoreCase("y")) {
				// Used this empty line for spacing purposes if the user wishes
				// to continue
				System.out.println();
				count++;
				continue;

			} else {
				System.out.println();
				System.out.println("Goodbye! You created " + count + " Circle Objects!");
				scan.close();
				break;
			}

		}

	}

}
