package Hw1;

public class Hw1 {
	public static void main(String[] args){
		h1();
		h2();
		h3();
		h4();
		h5();
		h6();
	}
	
	public static void h1() 
	{
		//請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12,b=6;
		int ans1 = a+b;
		int ans2 = a*b;
		System.out.println("12,6這兩個數值的和是"+ans1+"，積是"+ans2);
	}
	
	public static void h2()
	{
		//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		int ans = egg/12;
		int mod = egg%12;
		System.out.println("200顆蛋共是"+ans+"打"+mod+"顆蛋。");
	}
	
	public static void h3()
	{
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int time = 256559;
		int days = time/(60*60*24); //算出天數
		int sec = time - days*60*60*24; //扣除天數剩餘秒數
		int hrs = (int)(sec/Math.pow(60,2)); //剩餘秒數算出小時
		
		sec -= hrs*60*60; //扣除小時結果剩餘秒數
		
		int min = sec/60; //算出分鐘數
		sec -= min*60; //扣除分鐘數剩餘秒數
		
		System.out.printf(String.format("256559秒為%s天、%s小時、%s分與%s秒。\n",days,hrs,min,sec));
		
	}
	
	public static void h4()
	{
		//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415; //圓周率
		int r = 5; //半徑
		double area = r*r*PI; //圓面積 = 半徑平方*圓周率
		double rLong = r*2*PI; //圓周長 = 半徑*2*圓周率
		
		System.out.println(String.format("一個常數為3.1415(圓周率),半徑為5的圓面積是%s與圓周長是%s。\n", area, rLong));
	}
	
	public static void h5()
	{
		//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		//【複利公式】FV ＝ PV×（1 ＋ R）n 次方FV 為期末本利和，PV 為期初本金，R 為每期利率，n 為期數也就是--期末本利和＝期初本金×（1＋利率）期數次方。
		
		double PV = 1_500_000,R = 0.02;
		double ttMoney = PV*(1+R); //第一年本利和
		
		//每年利息都繼續存入銀行，本金隨每年利息增加而增加，因此使用迴圈不用單純n平方計算
		for(int n = 1;n <= 10;n++)
		{
			ttMoney *= (1+R);
		}
		
		System.out.println("本金加利息共有"+(int)(ttMoney)+"元");
		
	}
	
	public static void h6()
	{
		/*
		 * 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
			5 + 5
			5 + ‘5’
			5 + “5”
			並請用註解各別說明答案的產生原因
		 * 
		 */
		//宣告三種5
		int i = 5; //常數
		char c = '5'; //單引號為字元
		String s = "5"; //雙引號為字串
		
		System.out.println(i+i); //常數相加5+5=10
		System.out.println(i+c); //5的ASCII為53 因此相加為58
		System.out.println(i+s); //i轉為字串方式結合 變成55
		
	}
}
