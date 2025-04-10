package hw9;

public class EatingThread implements Runnable {
	int counter = 10;
	String name;

	public EatingThread() {
	} // 建構者函數

	public EatingThread(String name) {
		this.name = name;
	}

	public void run() {
		int i = 1;
		while (i <= counter) {
			System.out.println(name + "吃第" + i + "碗拉麵");
			i++;
			try {
				if ((i - 1) == counter) {
					System.out.println(name + "吃完了!");
				}
				// (random()*(max-min))+min 設定區間
				Thread.sleep((int) ((Math.random() * (3000 - 500)) + 500)); // 隨機暫停500-3000毫秒
			} catch (Exception e) {
			}
		}

	}

}
