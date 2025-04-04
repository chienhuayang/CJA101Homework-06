package Hw5;

import java.util.Scanner;

public class Hw5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// hw1
		int[] ans = new int[2];
		System.out.println("請輸入寬與高:");
		for (int i = 0; i < 2; i++) {
			ans[i] = sc.nextInt();
		}
		starSqare(ans[0], ans[1]);
		// hw2
		randAvg();

		// hw3
		int intArray[][] = { { 1, 6, 3 }, { 9, 5, 2 } };

		double doubleArray[][] = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		Cl05 s = new Cl05();
		System.out.println("Int Array Maximine: " + s.maxElement(intArray));
		System.out.println("Double Array Maximine: " + s.maxElement(doubleArray));

		// hw4
		MyRectangle r = new MyRectangle();
		r.setWidth(10);
		r.setDepth(20);
		System.out.println("Area = " + r.getArea());

		System.out.println("==========");

		MyRectangle r1 = new MyRectangle(10, 20);
		System.out.println("Area = " + r1.getArea());

		// hw5
		genAuthCode();

		sc.close();

	}

	public static void starSqare(int width, int height) {
		// TODO Auto-generated method stub

		String line = ""; // 存橫排字串

		// 製造橫排
		for (int i = 0; i < width; i++) {
			line += "*";
		}
		// 製造直排
		for (int i = 0; i < height; i++) {
			System.out.println(line);
		}

	}

	public static void randAvg() {
//		請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
		int[] randN = new int[10];
		int avg = 0;
		for (int i = 0; i < 10; i++) {
			randN[i] = (int) (Math.random() * 101); // 設置亂數存入陣列
			avg += randN[i]; // 加總亂數
			System.out.print(randN[i] + "\t"); // 打印亂數
		}
		avg = avg / 10;
		System.out.println();
		System.out.println("Average = " + avg);
	}

	public static void genAuthCode() {
//		身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//		genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//		與數字的亂數組合,如圖:

		// 建立陣列紀錄字母+數字ASCII共62個(26+26+10)
		int[] alphabet = new int[62];
		int start = 48, j = 0;

		while (start < 123) {
			if (start >= 48 && start < 58) {
				alphabet[j] = start; // 數字轉字元存入 //0~9
				j++;
			} else if (start >= 65 && start <= 90) {
				alphabet[j] = start; // 數字轉字元存入 //A~Z
				j++;
			} else if (start >= 97 && start <= 122) {
				alphabet[j] = start; // 數字轉字元存入 //a~z
				j++;
			}
			start++;
		}
		System.out.println();
		System.out.println("本次隨機產生驗證碼為:");

		for (int i = 0; i < 8; i++) {
			int k = (int) (Math.random() * 63); // 設置亂數存入陣列
			// System.out.print(k); // 打印亂數
			System.out.print((char) alphabet[k]); // 打印亂數
		}
	}
}
