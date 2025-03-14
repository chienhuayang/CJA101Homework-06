package Hw2;

public class TestNineNine {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			int j = 1;
			while (j < 10) {
				System.out.print(String.format("%s*%s=%s \t", i, j, i * j));
				j++;
			}
			System.out.println();
		}

		System.out.println("===========");

		for (int i = 1; i < 10; i++) {
			int j = 1;
			do {
				System.out.print(String.format("%s*%s=%s \t", i, j, i * j));
				j++;
			} while (j <= 9);
			System.out.println();
		}

		System.out.println("===========");

		int i = 1;
		while (i < 10) {

			int j = 1;
			do {
				System.out.print(String.format("%s*%s=%s \t", i, j, i * j));
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		}
	}

}
