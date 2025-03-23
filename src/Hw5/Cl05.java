package Hw5;

public class Cl05 {
	public int maxElement(int x[][]) {
//		利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//		可以找出二維陣列的最大值並回傳,如圖:
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public double maxElement(double x[][]) {
		double max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
}
