
public class ShapeTest {

	public static void main(String[] args) {
           //programming for interface not implementation
		Shape shape =new Circle(10);
		
		Circle c =new Circle(10);
		
		shape.draw();
		System.out.println("Area=" +shape.getArea());
		
		//switching from one implementation to another easily
		
		shape =new Rectangle (10,10);
		shape.draw();
		System.out.println("Area=" +shape.getArea());
	}

}
