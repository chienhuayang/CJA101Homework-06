package HomeworkExt;

public class Pencil extends Pen {
	private int price;
	private String brand;
	
	
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public Pencil() {}
	
	public Pencil(int price,String brand) {
		super(price,brand);
		this.price = price;
		this.brand = brand;
	}
	
	public int getPrice(){
		return (int)(price * 0.8);
	}

}
