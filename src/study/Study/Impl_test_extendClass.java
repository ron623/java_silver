package study.Study;

public class Impl_test_extendClass extends impl_test{

	public Impl_test_extendClass() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void greet() {
		System.out.println("こんにちは、みなさん。お元気ですか");
	}

	public String StrTst(int a, int b) {

		// 引数をintからStringにする
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);

		// 文字列連結
		String str3 = "受け取った引数は" + str1 + "と" + str2 + "です";
		System.out.println(str3);

		// 連結した値を返す
		return str3;
	}

}
