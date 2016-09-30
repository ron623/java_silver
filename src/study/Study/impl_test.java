package study.Study;

public class impl_test implements Interface_test,Interface_test2{

	public impl_test() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void greet() {
		System.out.println("こんにちは");
	}

	@Override
	public void sleep() {
		System.out.println("ｚｚｚ");
	}

	@Override
	public int intTst(int a, int b) {
		return 0;
	}

	@Override
	public String StrTst(int a, int b) {

		// 引数をintからStringにする
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);

		// 文字列連結
		String str3 = str1 + str2;

		// 連結した値を返す
		return str3;
	}
}
