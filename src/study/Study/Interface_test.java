package study.Study;

/*
 * インターフェースクラスには実際の処理は書かない。
 * 実装する際はインターフェースクラスのすべてのメソッドを実装する必要がある。
 */


public interface Interface_test {

	// あいさつ
	abstract void greet();

	// 寝る
	void sleep();

	// test
	int intTst(int a, int b);


	// 以下のように記述しても、自動的にpublic static finalが付与される
	int a = 1;

	// 省略しないで書くとこう
	public static final int b = 2;

}
