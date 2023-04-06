package paralell_inheritance_hierarchies.after;

public abstract class Shape2D implements AreaInterface{
	protected float width;
	protected float height;

	public Shape2D(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
}
