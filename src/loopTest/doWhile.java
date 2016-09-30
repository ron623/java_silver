package loopTest;

/*
 * 	do-while文の挙動確認クラス
 */

public class doWhile {

	public doWhile() {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	// 5になるまでループして現在の値を表示するメソッド
	public void dododo(){

		int i = 0;

		do{
			i++;

			System.out.println("現在のiの値は " + i + "です");
		}
		while( i < 5);

		System.out.println("ループを抜けました");
	}


	//
	public void doWhileTest(String str){

		boolean isCat = false;

		do{

			// 渡された引数が"cat"じゃなかったらループを抜ける
			if (! ("cat".equals(str))){
				System.out.println("猫じゃない");
				break;
			}

			System.out.println("渡された引数は " + str + "です");

			isCat = true;
		}
		while(isCat = false );

		System.out.println("ループを抜けました");
	}

}
