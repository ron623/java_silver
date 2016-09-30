package chkDiff;

public abstract class AbstractRoot {


/*
 * 抽象クラス
 */

	public AbstractRoot() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	// 省略してもpublic static finalがつく
	int a = 1;

	// これはNG
	//private static int b = 2;
	static int b = 2;

	// finalは上書きNG
	public static final int c = 3;

	// 抽象メソッド
	abstract void methodA();

	// 抽象メソッド(引数あり）
	abstract void methodB(int i);

	// 明示的にabstractを書く
	abstract void methodC();

	// staticメソッドはOK
	public static void methodD(){

		System.out.println("aaa");
	};

	// 具象メソッドもOK
	void methodE(){

	}

}
