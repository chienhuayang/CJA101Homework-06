package Hw5;

public class MyRectangle {
	private double width;
	private double depth;

	// 將收到的引數指定給width屬性
	void setWidth(double width) {
		this.width = width;

	}

	// 將收到的引數指定給depth屬性
	void setDepth(double depth) {
		this.depth = depth;
	}

	// 能計算該長方形的面積
	public double getArea() {
		double rec = width * depth;
		return rec;
	}

	public MyRectangle() {

	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
