package poly_assignment;

public class Circle extends Shape{
	float radius;
	
	public Circle(String color, float radius) {
		super(color);
		this.radius = radius;
	}
	public  void calculateArea() {
		System.out.println("Area of "+color+" circle "+3.14*radius*radius);
	}

	
	
	

}
