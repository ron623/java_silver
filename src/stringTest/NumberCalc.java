package stringTest;


/*
 * 数値の連結
 */

public class NumberCalc {

	public NumberCalc() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void numberToString(){

		int i = 100;
		int j = 200;
		String s = "test";

		// ①数値の計算がなされる
		System.out.println(i + j);

		// ②数値＋文字列
		System.out.println(i + s);

		// ③文字列＋数値
		System.out.println(s + i);

		// ④全て文字列として連結される
		System.out.println(s + i + j);

		// ⑤i＋jの計算結果とsが連結される
		System.out.println(i + j + s);

		// ⑥sとi＋jの計算結果が連結される（②と同じ結果）
		System.out.println(s + (i + j));

	}

}
