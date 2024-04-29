
public class Triangle extends Shape {
	
	//variables for triangle class
	public double sideOne;
	public double sideTwo;
	public double sideThree;
	
	//parameterized constructor
	public Triangle (double sideOne, double sideTwo, double sideThree) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
		
	//Overridden methods for abstract area and perimeter functions of Shape
	//Area of a triangle with only three sides given is solved via Heron's formula:
	//Let half perimeter be calculated and stored as variable 's'
	//Square root of (s(s- side one)(s - side two) (s - side three))
	
	@Override
	public double area() {
		double s = (sideOne + sideTwo + sideThree) / 2;
		return Math.sqrt(s * (s- sideOne) * (s - sideTwo) * (s - sideThree));
	}
	
	@Override
	public double perimeter() {
		return sideOne + sideTwo + sideThree;
	}

	@Override
	public String toString() {
		return "For the given parameters, area = "+ area() + ", and perimeter = " + perimeter();
	}
}
