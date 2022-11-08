
public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius = 5.0;
		color = "Green";
	}
	public Circle(double radius) {
		if(radius > 0) {
			this.radius = radius;
		}
		else {
			System.out.println("You cannot have a radius value equal to zero or negative");
		}
	}
	public Circle(double radius,String color) {
		this.radius= radius;
		this.color=color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
}
