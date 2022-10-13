package poly_assignment;

public class Square extends Shape{
	float side;
	public Square(String color, float side) {
		super(color);
		this.side = side;
	}
	public  void calculateArea() {
		System.out.println("Area of "+color+" square is "+side*side);
	}
	
	
	

}
