package in.co.rays.OOPs;

public class Shape {
	int borderwidth;
	String color;
	public Shape(String color,int borderwidth) {
		this.color=color;
		this.borderwidth=borderwidth;
		}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	}
