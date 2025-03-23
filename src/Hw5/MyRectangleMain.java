package Hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle r = new MyRectangle();
		r.setWidth(10);
		r.setDepth(20);
		System.out.println("Area = "+r.getArea());
		
		System.out.println("==========");
		
		MyRectangle r1 = new MyRectangle(10,20);
		System.out.println("Area = "+r1.getArea());
	}

}
