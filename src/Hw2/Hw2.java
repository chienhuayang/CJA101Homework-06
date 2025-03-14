package Hw2;

public class Hw2 {

	public static void main(String[] args) {
		hw1();
		hw2();
		hw3();
		hw4();
		hw5();
		hw6();
		hw7();
		
		
	}
	
//	•請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	public static void hw1() {
		int sum = 0;
		for(int i = 1;i<=1000;i++)
		{
			if(i%2==0) { //除以2餘數為0即為偶數
				sum = sum+i;
//				System.out.print(String.format("%s ", sum));
			}
		}
		System.out.println(sum);
		System.out.println();
	}
	
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
	public static void hw2() {
		int sum = 1;
		for(int i=1;i<=10;i++) {
			sum *=i;
		}
		System.out.println(sum);
		System.out.println();
		
	}
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	public static void hw3() {
		int sum = 1,i=1;
		while(i<=10) {
			sum *=i;
			i++;
		}
		System.out.println(sum);
		System.out.println();
	}
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
	public static void hw4() {
		for(int i = 1; i<=10; i++) {
			int j = i;
			j = j*j;
			System.out.print(String.format("%s ",j));
		}
		System.out.println();
	}
//	•阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	public static void hw5() {
		int count = 0;
		for(int i = 1; i<=49;i++) {
			if( i%10==4 || i==4 || i>=40) {
				continue;
			}
			else {
				System.out.print(String.format("%s\t",i));
				count++;
			}
			if(count%10==0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println(String.format("總共可選%s個數字",count));
		System.out.println();
	}
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
	public static void hw6() {
		for(int i=0;i<10;i++) {
			int j = 10-i;
			for(int k=1;k<=j;k++) {
				System.out.print(k+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
//	請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
	public static void hw7() {
		
		for(int i=0; i<=5;i++) {
			int a = 'A';
			a = a+i;
			char c = (char)(a);
			for(int j=0;j<=i;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
