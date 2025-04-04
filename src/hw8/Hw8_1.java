package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw8_1 {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(new Integer(100));
		li.add(new Double(3.14));
		li.add(new Long(21L));
		li.add(new Short("100"));
		li.add(new Double(5.1));
		li.add("Kitty");
		li.add(new Integer(100));
		li.add(new Object());
		li.add("Snoopy");
		li.add(new BigInteger("1000"));

		print(li);

		for (int i = 0; i < li.size(); i++) {
			if (!(li.get(i) instanceof Number)) {
				li.remove(i);
				i--; //移除後後者index往前遞補，不做i--會導致元素被跳過
			}
		}

		print(li);

	}

	public static void print(List li) {

		// 用迭代器印出
		Iterator iter = li.iterator();
		while (iter.hasNext()) {
			System.out.println((Train)iter.next());
		}
		System.out.println("---------------------");
		// for迴圈
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		System.out.println("---------------------");

		// for-each
		for (Object obj : li) {
			System.out.println(obj);
		}
		System.out.println("---------------------");
	}

}
