package HomeworkExt;

public class Pen {
	private int price;
	private String brand;
	
	public Pen() {}
	
	public Pen(int price,String brand) {
		this.price = price;
		this.brand = brand;
	}
	
	void setPrice(int price){
		this.price = price;
	}
	void setBrand(String brand){
		this.brand = brand;
	}
	
	public int getPrice(){
		return price;
	}
	public String getBrand(){
		return brand;
	}
	
	public void write() {};
}

abstract class PenA {
	// 抽象方法
	public abstract void write();

}
