package Hw4;

import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args) {
//		hw1();
//		hw2();
//		hw3();
//		hw4();
		hw5();
//		hw6();
	}

	public static void hw1() {
//		有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)

		int[] li = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int[] big = new int[10];
		int sum = 0;

		for (int i = 0; i < li.length; i++) {
			sum += li[i]; // 先算出加總
		}

		int avg = sum / li.length; // 平均值
		System.out.println("Average is " + avg);

		for (int i = 0; i < li.length; i++) {
			if (li[i] > avg) {
				System.out.print(li[i] + " \t");
			}
		}
		System.out.println();

	}

	public static void hw2() {
//		• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
		String s = "Hello World";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	public static void hw3() {
//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		String[] vowel = {"a","e","i","o","u"};
		int count = 0, position = -1;
		for (int i = 0; i < planet.length; i++) {
//			for(int j=0;j<vowel.length;j++) {
//				if(planet[i].indexOf(vowel[j])>=0) {
//					count++;
//				} //無法計算重複出現母音
			// indexOf(查找字,查找開始位置) //前次出現位置+1才會超過前次出現位置
			while ((position = planet[i].indexOf('a', position + 1)) != -1) {
				count++;
			}

			while ((position = planet[i].indexOf('e', position + 1)) != -1) {
				count++;
			}

			while ((position = planet[i].indexOf('i', position + 1)) != -1) {
				count++;
			}

			while ((position = planet[i].indexOf('o', position + 1)) != -1) {
				count++;
			}

			while ((position = planet[i].indexOf('u', position + 1)) != -1) {
				count++;
			}
		}
		System.out.println("共有" + count + "個母音");
	}

	public static void hw4() {
//		• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//		請設計一個程式,可以讓阿文輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
		int[][] staff = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		String li = "";
		Scanner sc = new Scanner(System.in);
		int beg = 0, count = 0;

		while (beg <= 0) {
			System.out.println("今天想借多少錢?");
			beg = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			if (beg <= staff[i][1]) {
				li = li + staff[i][0] + " "; // 紀錄可借錢員工編號
				count++; // 計算可借錢人數
			}
		}
		if (count > 0) {
			System.out.println("有錢可借的員工編號: " + li + "共" + count + "人!");
		} else {
			System.out.println("借太多啦!沒人借的了，用搶得比較快!");
		}
	}

	public static void hw5() {
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天");
		int days = 0,yy=0,mm=0,dd = 0;
		
		do {
			yy = sc.nextInt();
			mm = sc.nextInt();
			dd = sc.nextInt();
			if(mm!=2 && (mm<=7 && mm%2==0 && dd>30)||(mm>7 && mm%2!=0 && dd>30)) {
				System.out.println("該月不超過30天!!請重新輸入年月日:");
				dd = 0;
			}else if(mm==2 && yy%4==0 && dd>29) {
				System.out.println("閏年2月也只有29天。重新輸入年月日:");
				dd = 0;
			}else if(mm==2 && yy%4!=0 && dd>28) {
				System.out.println("2月只有28天。請重新輸入年月日:");
				dd = 0;
			}
			
				
		}while(dd==0);
		
		int[] input = {yy,mm,dd};

		// 判斷是否為閏年
		if (input[0] % 4 == 0) {
			// 判斷大小月計算;2月29天
			if (input[1] < 2) {
				days = input[2];
			} else if (input[1] % 2 > 0) { // 奇數月份且超過7月
				days = 30 * ((input[1] - 2) / 2) + 31 * ((input[1]) / 2) + 29 + input[2];
			} else if (input[1] % 2 > 0 && input[1] <= 7) { // 奇數月份且不超過7月
				days = 30 * ((input[1] - 1) / 2) + 31 * ((input[1]) / 2) + 29;
			} else if (input[1] == 2) { // 2月份
				days = 31 + input[2];
			} else if (input[1] % 2 == 0 && input[1] > 7) { // 偶數月份且超過7月
				days = 30 * ((input[1] - 2) / 2) + 31 * (input[1] / 2) + 29 + input[2];
			} else if (input[1] % 2 == 0 && input[1] <= 7 && input[1] > 2) { // 偶數月份且不超過7月
				days = 30 * ((input[1] - 1) / 2) + 31 * (input[1] / 2) + 29 + input[2];
			}
//			
		} else {
			// 判斷大小月計算;2月28天
			if (input[1] < 2) {
				days = input[2];
			} else if (input[1] % 2 > 0 && input[1] > 7) { // 奇數月份且超過7月
				days = 30 * ((input[1] - 2) / 2) + 31 * ((input[1]) / 2) + 28 + input[2];
			} else if (input[1] % 2 > 0 && input[1] <= 7) { // 奇數月份且不超過7月
				days = 30 * ((input[1] - 1) / 2) + 31 * ((input[1]) / 2) + 28;
			} else if (input[1] == 2) { // 2月份
				days = 31 + input[2];
			} else if (input[1] % 2 == 0 && input[1] > 7) { // 偶數月份且超過7月
				days = 30 * ((input[1] - 2) / 2) + 31 * (input[1] / 2) + 28 + input[2];
			} else if (input[1] % 2 == 0 && input[1] <= 7 && input[1] > 2) { // 偶數月份且不超過7月
				days = 30 * ((input[1] - 1) / 2) + 31 * (input[1] / 2) + 28 + input[2];
			}
		}
		System.out.println(String.format("這是%s年的第%s天", input[0],days));

	}

	public static void hw6() {
//		班上有8位同學,他們進行了6次考試結果如下:
//		請算出每位同學考最高分的次數
		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 22, 99, 75 } };
		int champ = 0, st1 = 0, st2 = 0, st3 = 0, st4 = 0, st5 = 0, st6 = 0, st7 = 0, st8 = 0;

		for (int i = 0; i < 6; i++) {
			int topSc = 0;
			for (int j = 0; j < 8; j++) {
				if (test[i][j] > topSc) {
					champ = j + 1; // 紀錄目前最高分座號
					topSc = test[i][j]; // 更新最高分
				}
			}
			if (champ == 1) {
				st1++;
			} else if (champ == 2) {
				st2++;
			} else if (champ == 3) {
				st3++;
			} else if (champ == 4) {
				st4++;
			} else if (champ == 5) {
				st5++;
			} else if (champ == 6) {
				st6++;
			} else if (champ == 7) {
				st7++;
			} else if (champ == 8) {
				st8++;
			}
		}
		System.out.println(String.format("最高分次數: 1號:%s次, 2號:%s次, 3號:%s次, 4號:%s次", st1, st2, st3, st4));
		System.out.println(String.format("5號:%s次, 6號:%s次, 7號:%s次, 8號:%s次", st5, st6, st7, st8));
	}

}
