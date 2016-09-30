package stringTest;

public class StringSample {

	/*
	 * Object型の比較、String型の比較の挙動確認クラス
	 */


	public StringSample() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void Text(){

		// オブジェクト型のequals
		Object obj1 = new Object();
		Object obj2 = new Object();

		// 比較
		boolean compResult = compare(obj1, obj2);
		System.out.println("オブジェクト型obj1,obj2の比較：" + compResult);

		// 参照先を同じにする
		obj1 = obj2;
		// 再度比較してみる
		compResult = compare(obj1, obj2);
		System.out.println("オブジェクト型obj1,obj2の比較：" + compResult);


		// String型のequals
		String str1 = new String();
		String str2 = new String();

		// 比較
		compResult = compare(str1, str2);
		System.out.println("String型str1,str2の比較：" + compResult);

		// 参照先を同じにする
		str1 = str2;
		// 再度比較してみる
		compResult = compare(obj1, obj2);
		System.out.println("String型str1,str2の比較：" + compResult);


		String str3 = "abc";
		String str4 = "abc";

		// 比較
		compResult = compare(str3, str4);
		System.out.println("String型str1,str2の比較(equals)：" + compResult);

		compResult = compare2(str3, str4);
		System.out.println("String型str1,str2の比較(==)：" + compResult);
	}


	// オブジェクト型の変数比較
	public boolean compare(Object o1, Object o2){

		boolean isEqual = false;

		if ( o1.equals(o2)){

			isEqual = true;
		}

		return isEqual;
	}

	// String型の変数比較(equals)
	public boolean compare(String s1, String s2){

		boolean isEqual = false;

		if ( s1.equals(s2)){

			isEqual = true;
		}

		return isEqual;
	}

	// String型の変数比較(==)
	public boolean compare2(String s1, String s2){

		boolean isEqual = false;

		if ( s1 == s2 ){

			isEqual = true;
		}

		return isEqual;
	}

}
