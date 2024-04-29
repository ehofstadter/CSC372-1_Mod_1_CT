
public class Circle extends Shape{
	
	//Class variables to calculate area
	public double radius;
	public final double pi = Math.PI;
	
	//parameterized constructor
	public Circle (double radius) {
		this.radius = radius;
	}
	
	
	@Override
	public String toString() {
		return "For the given radius, area = "+ area() + ", and perimeter = " + perimeter();
	}
	
	//Overridden methods for abstract area and perimeter functions of Shape 
	//Area of a circle is pi * radius squared
	@Override
	public double area() {
		return Math.pow(radius,2) * pi;
	}
	
	//Perimeter of a circle is 2pi*r
	@Override
	public double perimeter() {
		return 2*pi*radius;
	}

}
