
public class Rectangle implements Shape {
	
	private double width;
	private  double height;
	
	

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
        System.out.println("drawing rectangle");
	}

	@Override
	public double getArea() {
		return this.height*this.width;
	}

}
