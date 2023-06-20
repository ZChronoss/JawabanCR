package paralell_inheritance_hierarchies.after;

public class Triangle extends Shape2D {

	public Triangle(float width, float height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return width * height / 2;
	}
}