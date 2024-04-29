
public class Rectangle extends Shape{

	//variables for rectangle sides
	public final double length;
	public final double width;
	
	//parameterized constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width; 
	}
	
	//toString method prints area and perimeter of Rectangle object
	@Override
	public String toString() {
		return "For the given parameters, area = "+ area() + ", and perimeter = " + perimeter();
	}
	
	
	//Overridden methods for abstract area and perimeter functions of Shape
	@Override
	public double area() {
		return width*length;
	}
	
	@Override
	public double perimeter() {
		return (width + length) * 2;
	}
}
