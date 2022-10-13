package poly_assignment;

public class Triangle extends Shape{
	float base;
	float height;
	public Triangle(String color, float base, float height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	public  void calculateArea() {
		System.out.println("Area of "+color+" triangle "+base*height/2);
	}


}
