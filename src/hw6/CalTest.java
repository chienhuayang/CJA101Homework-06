package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) throws CalException {
		boolean correct = true;

		while (correct) {

			try {
				Scanner sc = new Scanner(System.in); // 要放在try內宣告輸錯才能重新輸入
				System.out.println("請輸入x值: ");
				int x = sc.nextInt();
				System.out.println("請輸入y值: ");
				int y = sc.nextInt();
				correct = false;

				Calculator c = new Calculator(x, y);

				c.powerXY(x, y);

				sc.close();
			} catch (InputMismatchException e) { // 輸入格式錯誤
				correct = true;
				System.out.println("輸入格式不正確");
			}
		}
	}

}
