package ExceptionTest;

import java.util.ArrayList;

/*
 * 	例外時の挙動確認クラス
 */


public class ExceptionTest {

	public ExceptionTest() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	// IndexOutOfBoundsExceptionを発生させるメソッド
	public void Nullpo(ArrayList a){

		try{

		// リストの0番目の値をString型にする
		String str = a.get(0).toString();

		System.out.println(str);
		}
		catch (IndexOutOfBoundsException e){

			System.out.println("例外発生");
		}
	}


	// ぬるぽ発生メソッド
	public void Nul(String s){

		try{
		int length = s.length();
		System.out.println("文字列の長さは" + length + "です");
		}
		catch ( Exception e){
			System.out.println("文字列長さ取得時　例外発生");
		}
		// 上記のいずれの場合にも実行される
		finally{
			System.out.println("絶対行う処理");
		}
	}
}
