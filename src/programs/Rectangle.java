package programs;

public class Rectangle extends Shape {

	float width, height;
	private float area;

	// Constructors
	public Rectangle() {

		width = 3.2f;
		height = 2.0f;
	}

	public Rectangle(float width, float height) {

		this.width = width;
		this.height = height;
	}

	public void calArea() {
	this.area=width*height;

	}

	public void show() {
		// TODO Auto-generated method stub
		
	}

}
