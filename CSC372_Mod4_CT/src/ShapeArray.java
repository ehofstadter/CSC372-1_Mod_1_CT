//ShapeArray functions as a test class for the Rectangle, Circle, and Triangle classes
public class ShapeArray {
	
	public static void main(String[] args) {
		
		//test triangle
		double sideOne = 8;
		double sideTwo = 4;
		double sideThree = 10; 
		Shape triangle = new Triangle(sideOne, sideTwo, sideThree); 

		//test circle
		double radius = 1;
		Shape circle = new Circle(radius);

		
		//test rectangle by printing as square
		double length = 3; 
		double width = 3;
		Shape square = new Rectangle(length, width); 

		
		//create array of abstract class Shape containing instantiated subclasses triangle, circle, square
		Shape[] shapeArray = new Shape[3];
		shapeArray[0] = triangle;
		shapeArray[1] = circle;
		shapeArray[2] = square;
		
		//loop through Shape array and print toString method of each instance
		for (int i = 1; i < shapeArray.length + 1; i++) {
			System.out.println(shapeArray[i-1].toString());
		}
		
	}

}
