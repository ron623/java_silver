package study.Study;

public class ChildClass extends ParentClass{

	public ChildClass() {
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.println("子クラスのコンストラクター");
	}

	public void ParentMethod(){

		System.out.println("子クラスのメソッド");

		super.ParentMethod();

	}

	// これならＯＫ
	void sample(String s){

		int i = 0;

		i = Integer.valueOf(i);

		int j = 0;
		j = i * 100;

		System.out.println(i + "の１００倍は" + j + "です");
	}

	void showMessage(String s){

		System.out.println(s + " by 子クラス");
	}

	void message(){

		// 子クラスが呼ばれる
		showMessage("テスト");

		// 親クラスが呼ばれる
		super.showMessage("テスト");

	}
}
