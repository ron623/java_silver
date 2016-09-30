package stringTest;

/*
 *  String型の領域の使い方を学ぶためのクラス
 */

public class StringPoolTest {

	public StringPoolTest() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void makeNewString(){

		// ★★ Stringオブジェクトをnewして作成 ★★
			// 定数プールに同じ文字列が存在してもnewした場合は新しい
			// オブジェクトが作成されるので別物になるはず

		System.out.println("★★ Stringオブジェクトをnewして作成 ★★");

		String newStr1 = new String("aaa");
		String newStr2 = new String("aaa");

		// 参照先が同じかチェック
		if ( newStr1 == newStr2){
			System.out.println(newStr1 + " と " + newStr2 + "は同じ");
		}
		else{
			System.out.println(newStr1 + " と " + newStr2 + "は別物");
		}


		// ★★ newしないでStringオブジェクトを使用 ★★
			// 定数プールのオブジェクトを参照するので同じになるはず

		System.out.println("★★ newしないでStringオブジェクトを使用 ★★");

		String poolStr1 = "aaa";
		String poolStr2 = "aaa";

		// 参照先が同じかチェック
		if ( poolStr1 == poolStr2){
			System.out.println(poolStr1 + " と " + poolStr2 + "は同じ");
		}
		else{
			System.out.println(poolStr1 + " と " + poolStr2 + "は別物");
		}

	}


}
