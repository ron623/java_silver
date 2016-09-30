package study.Study;

public class ParentClass {

	public ParentClass() {
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.println("親クラスのコンストラクター");

	}

	public void ParentMethod(){

		System.out.println("親クラスのメソッド");

	}

	void sample(String s){

		int i = 0;

		i = Integer.valueOf(i);

		System.out.println(i);
	}


	void showMessage(String s){

		System.out.println(s + " by 親クラス");
	}

}
