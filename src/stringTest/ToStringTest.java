package stringTest;

import java.util.ArrayList;
import java.util.HashMap;



public class ToStringTest {

	public ToStringTest() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void toStringTest(){

		Object obj = new Object();

		System.out.println(obj);

		String str = new String();

		str = obj.toString();

		System.out.println(str);
	}

	public void arrayTest(){

		// ジェネリックを使用しない場合の宣言
		ArrayList list = new ArrayList();

		list.add(123);

		list.add("hello!");

		// printlnするとtoStringメソッドが呼ばれて文字列として出力される
		System.out.println(list.get(0));


	}

	public void hashTest(){

		HashMap map = new HashMap();

		map.put(1, "1番目の値");
		map.put("aaa", "AAA");



		// 以下の二つって何が違うの？？？
		String mapValue1 = map.get(1).toString();
		System.out.println(mapValue1);

		String mapValue2 = (String) map.get(1);
		System.out.println(mapValue2);

	}

}
