package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class hw7_main {
	public static void main(String[] args) throws IOException {
		hw1();
		hw2();

		File inputF = new File("Origin.txt");
		File outputF = new File("Copy.txt");

		copyFile(inputF, outputF);
	}

	public static void hw1() throws IOException {
		String i;
		int cntL = 1, cntC = 1, j;
		try {
			FileReader w1 = new FileReader("Sample.txt");
			System.out.print(String.format("Sample.txt檔案共有%s個位元組,", w1.read()));
			while ((j = w1.read()) != -1) { // read()到最後一個字元結束回傳-1
				cntC++;
			}
			System.out.print(cntC + "個字元,");

			BufferedReader r1 = new BufferedReader(w1);

			while ((i = r1.readLine()) != null) { // readLine()一次讀一整行資料
				cntL++;
				System.out.println(i);
			}
			System.out.println(cntL + "列資料");

			r1.close();
			w1.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void hw2() throws IOException {
		Set set = new HashSet(); // 使用hashSet排除重複

		FileWriter fos = new FileWriter("Data.txt");
		BufferedWriter w1 = new BufferedWriter(fos);
		PrintWriter p1 = new PrintWriter(w1);

		while (set.size() < 10) {
			int r = (int) (Math.random() * 1000 + 1);
			String str = "" + r + " ";
			set.add(r);
			p1.append(str);
		}

		p1.close();
		w1.close();
		fos.close();
	}

	public static void copyFile(File inputF, File outputF) throws IOException {
		FileReader fr = new FileReader(inputF); // 設置讀取要複製資料管道
		FileWriter fw = new FileWriter(outputF); // 設置要複製出去資料管道

		BufferedReader bfr = new BufferedReader(fr); // 包上緩衝區
		BufferedWriter bfw = new BufferedWriter(fw);

		String str = "";
		while ((str = bfr.readLine()) != null) {
			bfw.append(str+"\n"); // 將讀出的檔案再寫入至目標檔案中
//			System.out.println(str); // 確認寫入字串
		}
		
		bfw.close(); //關閉資料才會寫入
		bfr.close();
		fw.close();
		fr.close();
	}
}
