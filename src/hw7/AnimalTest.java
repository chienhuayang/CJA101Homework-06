package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AnimalTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Animal[] a = new Animal[4];

		a[0] = new Cat("Mimi");
		a[1] = new Dog("Hana");
		a[2] = new Cat("Pipi");
		a[3] = new Dog("Doggy");

		String filepath = "C:\\data";

		File f = new File(filepath);

		if (!f.exists()) {
			f.mkdir(); // 若不存在則建立資料夾
		}

		filepath = "C:\\data\\Object.ser";
		File obj = new File(filepath);

		// 建立寫入管道物件
		FileOutputStream fos = new FileOutputStream(obj);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < a.length; i++)
			oos.writeObject(a[i]); // 逐筆寫入
		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream(obj);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(obj.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();

	}

}
