package Hw3;

import java.util.Arrays;
import java.util.Scanner; //輸入互動套件

public class Hw3_advance {
	public static void main(String[] args) {
		hw1();
		hw2();
		hw3();
	}

	public static void hw1() {
		// 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		Scanner sc = new Scanner(System.in); // 輸入物件宣告

		System.out.println("請輸入三個整數:");
		int[] lenOfT = new int[3];
		for (int i = 0; i < 3; i++) {
			lenOfT[i] = sc.nextInt();
			// System.out.println(lenOfT[i]);
		}

		Arrays.sort(lenOfT); // 排序

		// 判斷三角形是否成立: 兩邊和大於第三邊
		if (lenOfT[0] + lenOfT[1] > lenOfT[2]) {
			if (lenOfT[0] == lenOfT[1] && lenOfT[1] == lenOfT[2]) {
				System.out.println("正三角形");
			} else if (lenOfT[0] == lenOfT[1] && lenOfT[1] < lenOfT[2]) {
				System.out.println("等腰三角形");
			} else if (Math.pow(lenOfT[0], 2) + Math.pow(lenOfT[1], 2) == Math.pow(lenOfT[2], 2)) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}

		} else {
			System.out.println("不是三角形");
		}
		sc.close();

	}

	public static void hw2() {
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
		Scanner sc = new Scanner(System.in); // 輸入物件宣告
		int input = -1;

		System.out.println("開始猜數字吧!");

		int ans = (int) (Math.random() * 101); // 數字答案
		do {
			input = sc.nextInt();
			if (input == ans) {
				System.out.println(String.format("答對了!答案就是%s", ans));
			} else if (input < ans) {
				System.out.println("猜錯囉!猜大點");
			} else if (input > ans) {
				System.out.println("猜錯囉!猜小點");
			}

		} while (input != ans); // 答案跟輸入不相等就繼續猜
		sc.close();

	}

	public static void hw3() {
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
		Scanner sc = new Scanner(System.in); // 輸入物件宣告
		int count = 0;
		int dislike = 0;
		int[] li = new int[49];

		// 防止阿文打1-9以外的數字
		while (dislike >= 10 || dislike <= 0) {
			System.out.println("阿文...請問你討厭哪個數字?");
			dislike = sc.nextInt();
		}

		for (int i = 1; i <= 49; i++) {
			if (i % 10 == dislike || i == dislike || (i >= dislike * 10 && i < (dislike + 1) * 10)) {
				continue;
			} else {
				// System.out.print(String.format("%s\t", i));
				li[count] = i;
				count++;
			}
//			if (count % 10 == 0) {
//				System.out.println();
//			}
		}
		System.out.println();

		int choice = count;
		int[] finC = new int[6];
		int cnt = 0;
		while (cnt < 6) {
			int rn = (int) (Math.random() * choice); // 產生符合可選數字的隨機亂數
			if (li[rn] > 0) {
				finC[cnt] = li[rn];
				li[rn] = 0; // 確保不重複
				System.out.print(finC[cnt] + "\t");
				cnt++;
			}
		}

//		確認篩選機制無誤
//		System.out.println();
//		for (int i = 0; i <= count; i++) {
//			System.out.print(li[i]+"\t");
//			if (i % 10 == 0) {
//				System.out.println();
//			}
//		}
		System.out.println();
		System.out.println(String.format("總共可選%s個數字", count));
		System.out.println();
		sc.close();

	}
}
