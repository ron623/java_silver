package stringTest;

import java.util.ArrayList;

public class ArrayTest {

	public ArrayTest() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void createArray(){

		ArrayList array = new ArrayList();

		array.add(1);
		array.add("あいうえお");
		array.add(null);

		String str = array.get(0).toString();
		Object o = array.get(2);
	}

}
