package hw9;

public class Hw9 {
	public static void main(String[] args) {
//		hw9_1();
//		
		BankDeposit b = new BankDeposit();
		Producer mom = new Producer(b);
		Consumer bear = new Consumer(b);
		
		mom.start();
		bear.start();
		
	}

	public static void hw9_1() {
		System.out.println("----大胃王快食比賽開始!----");

		EatingThread e1 = new EatingThread("饅頭人");
		Thread t1 = new Thread(e1);
		EatingThread e2 = new EatingThread("詹姆士");
		Thread t2 = new Thread(e2);

		t1.start();
		t2.start();

		try {
			t1.join(); // 等待執行續終止
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("----大胃王快食比賽結束!----");
	}

}
