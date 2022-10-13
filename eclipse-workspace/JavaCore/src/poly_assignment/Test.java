package poly_assignment;

public class Test {

	public static void main(String[] args) {
		Shape circle=new Circle("Red",5);
		Shape sqr=new Square("Blue",10);
		circle.calculateArea();
		sqr.calculateArea();
		Shape tri=new Triangle("Orange",10,10);
		tri.calculateArea();

	}

}
