package hw6;

public class Calculator {
	private int x,y;
	public Calculator() {};
	
	public Calculator(int x,int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public int powerXY(int x,int y) {
		
		try {
			if(x==0 && y==0) {
				throw new CalException("0的0次方沒有意義!");
			}else if(y<0) {
				throw new CalException("次方為負值，回傳不為整數!");
			}else {
				System.out.println("x的y次方為"+(int)(Math.pow(x, y)));
			}
		}catch(CalException e) {
			System.out.println(e.getMessage());
			}
		return (int)(Math.pow(x, y));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
