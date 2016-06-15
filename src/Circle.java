
public class Circle {

	private final double PI = 3.14159;
	private double radius;

	// constructor
	public Circle() {
		radius = 0.0;
	}

	// constructor
	public Circle(double r) {
		radius = r;
	}

	public void setRadius(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return PI * radius * radius;
	}

	public double getCircumference() {
		return 2 * PI * radius;
	}
}