package study.Study;

public class Test2 {

	// デフォルトコンストラクタ
	public Test2() {
	}

	// 自作コンストラクタ
	public Test2(String str) {

		System.out.println(str);
	}

	void stringTest(){

		System.out.println("test2のメソッド");

	}


	void test(){

		// 継承テスト
		ChildClass ch = new ChildClass();
		ch.ParentMethod();

	}

	void superCallTest(){

		ChildClass ch = new ChildClass();
		ch.message();

	}
}

