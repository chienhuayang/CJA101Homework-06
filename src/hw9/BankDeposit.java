package hw9;

public class BankDeposit {
	
	private int stock = 0; // 庫存量

	synchronized public void produce(int qty) {
		while (stock > 3000) {
			System.out.println("媽媽看到餘額在3000元以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock += qty;
		System.out.println("媽媽存了" + qty + "帳戶共有：" + stock);
		notify();
	}

	synchronized public void consume(int qty) {
		while (stock < qty) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				System.out.println("熊大要流落街頭，要求媽媽匯款!");
				wait();
				System.out.println("熊大被告知媽媽匯錢了，免於流落街頭!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock -= qty;
		System.out.println("熊大領了" + qty + "，帳戶共有:" + stock);
		if (stock < 2000) {
			System.out.println("熊大看到餘額在2000元以下，要求匯款");
			notify();
			
		}
	}
}

class Producer extends Thread {
	BankDeposit depot;

	public Producer(BankDeposit depot) {
		this.depot = depot;
	}

	public void run() {
		while(!Consumer.finished)
			depot.produce(2000); // 每次存2000
		Producer.yield();
		System.out.println("媽媽不匯了");
		
	}
}

class Consumer extends Thread {
	BankDeposit depot;
	
	public static boolean finished = false;

	public Consumer(BankDeposit depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			depot.consume(1000); // 每次提款1000
		Consumer.finished=true;
		System.out.println("熊大領完了!");
	}
}

