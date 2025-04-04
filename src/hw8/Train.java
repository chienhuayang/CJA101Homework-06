package hw8;

public class Train implements Comparable<Train> {
	private int number;
	private String type,start,dest;
	private double price;
	
	public Train() {}
	
	public Train(int number,String type,String start,String dest,double price) {
		setTrain(number,type,start,dest,price);
	}
	
	public void setTrain(int number,String type,String start,String dest,double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public String getTrainInfo(){
		return "班次：" + number + "，車種：" + type + "，出發地：" + start + "，目的地：" + dest + "票價：" + price;
	}
	
	public int compareTo(Train t) {
		// 物件本身與 t 相比較，如果 return 正值，就表示比 t 大
		if(this.number < t.number )  //由大到小DESC
			return 1;
		else if(this.number == t.number) 
			return 0;
		else
			return -1;
		// 回傳正負值來代表兩者之間的"左右"關係
	}
	
	public boolean equals(Object obj) {
		if(this == obj) //門牌號相等 = 同物件 = equals回傳true
			return true;
		if( obj != null && getClass() == obj.getClass()) {
			Train t = (Train)obj;
			if(t.number == this.number && t.start == this.start && t.dest == this.dest) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;

		result = result * prime + number;
		// 用三元運算將start轉為數字運算(0或使用java原生hashCode產生值)
		result = result * prime + (start == null ? 0 : start.hashCode());
		result = result * prime + (dest == null ? 0 : dest.hashCode());

		return result;
	}
	
	
	public int getTrainNumber() {
		return number;
	}
	
	public String getTrainType() {
		return type;
	}
	
	public String getTrainStart() {
		return start;
	}
	
	public String getTrainDest() {
		return dest;
	}
	
	public double getTrainPrice() {
		return price;
	}
}
