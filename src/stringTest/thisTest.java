package stringTest;

/*
 * 	thisを使用したインスタンス変数へのアクセス確認クラス
 */

public class thisTest {

	public thisTest() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	// インスタンス変数
	String str = "インスタンス変数";


	public void disp(){

		String str = "ローカル変数";

		// インスタンス変数の表示
		System.out.println(this.str);

		// ローカル変数の表示
		System.out.println(str);

	}


	// これだとローカル変数に代入されしまう
	public String test(String str){

		str = str;
		System.out.println(str);
		return str;

	}


	// これならインスタンス変数に代入される
	public void test2(String str){

		this.str = str;
		System.out.println(str);

	}



	// stringの扱いには注意が必要
	public String callThis(String str){

		//str = "ローカル変数";

		return str;
	}


}
