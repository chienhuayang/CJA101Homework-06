package HomeworkExt;

public class InkBrush extends Pen {
	private int price;
	private String brand;
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	public InkBrush() {}
	
	public InkBrush(int price,String brand) {
		super(price,brand);
		this.price = price ;
		this.brand = brand;
	}
	public int getPrice(){
		return (int)(price * 0.9);
	}
}
