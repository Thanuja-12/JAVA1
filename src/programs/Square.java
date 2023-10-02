package programs;


public class Square extends Shape {
	
	float side;
	private float area;
	
	
//constructors
	public Square() {
		
		side = 2.0f;
	}

	public Square(float side) {
	
		this.side = side;
	}



	public void calArea() {
	 this.area=side*side;
		
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}

}


	

