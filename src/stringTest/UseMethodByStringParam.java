package stringTest;

/*
 * 	String型とStringBuilder型の文字列連結の挙動比較クラス
 */

public class UseMethodByStringParam {

	public UseMethodByStringParam() {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	// String型文字列を引数とし、文字列連結をするメソッド。
	// 呼び出し元の文字列は変わらない。
	public void createString(String testString){

		// 文字列連結
		testString = testString + " メソッド内で付加した文字列";

		System.out.println(testString);
	}


	// StringBuilder型変数を引数とし、文字列連結をするメソッド。
	// 呼び出し元の文字列も変更される。
	public void createChangeString(StringBuilder sbr){

		// 文字列連結
		sbr = sbr.append(" メソッド内で付加した文字列");

		System.out.println(sbr);

	}

}
