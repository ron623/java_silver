package chkDiff;

/*
 * インターフェース
 */


public interface InterfaceRoot {

	// 省略してもpublic static finalがつく
	int a = 1;

	// これはNG
	//private static int b = 2;
	static int b = 2;

	// finalは上書きNG
	public static final int c = 3;


	// 抽象メソッド
	void methodA();

	// 抽象メソッド(引数あり）
	void methodB(int i);

	// 明示的にabstractを書く
	abstract void methodC();

	// staticメソッドはOK
	public static void methodD(){

		System.out.println("aaa");
	};

	// 具象メソッドはNG
	/*void methodE(){

	}*/

}
