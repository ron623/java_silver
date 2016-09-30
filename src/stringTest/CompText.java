package stringTest;

/*
 * StringとStringBuilderの違いを確認するクラス
 */

public class CompText {

	public CompText() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void stringTest(){

		// String型変数の宣言
		String text = "aaa";

		String text2 = "aaa";

		// StringBuilder型変数の宣言
		StringBuilder sb = new StringBuilder("aaa");

		StringBuilder sb2 = new StringBuilder("aaa");


		 // ***  Stringの扱い　***
		System.out.println("\n***  Stringの扱い　***");

		// １．２つの変数が同じ参照先か比較
		// ※　文字列の比較はこれでは正しくできません！！
		if ( text.equals(text2)){

			System.out.println(sb + "と" + text2 + "は同じです");
		}
		else{
			System.out.println(sb + "と" + text2 + "は別物です");
		}

		// ２．２つの変数が同じ文字列か比較
		if ( text == text2){

			System.out.println(sb + "と" + text2 + "は同じです");
		}
		else{
			System.out.println(sb + "と" + text2 + "は別物です");
		}



		 // ***  StringBuilderの扱い　***
		System.out.println("\n***  StringBuilderの扱い　***");


		// ３．２つの変数が同じ参照先か比較
		if ( sb.equals(sb2)){

			System.out.println(sb + "と" + sb2 + "は同じです");
		}
		else{
			System.out.println(sb + "と" + sb2 + "は別物です");
		}

		// ４．２つの変数が同じ文字列か比較
		if ( sb.toString().equals(sb2)){

			System.out.println(sb + "と" + sb2 + "は同じです");
		}
		else{
			System.out.println(sb + "と" + sb2 + "は別物です");
		}

		// ５．２つの変数が同じ文字列か比較
		if ( (sb.toString()).equals((sb2).toString())){

			System.out.println(sb + "と" + sb2 + "は同じです");
		}
		else{
			System.out.println(sb + "と" + sb2 + "は別物です");
		}

		// ６．２つの変数が同じ参照先か比較
		if ( sb == sb2){

			System.out.println(sb + "と" + sb2 + "は同じです");
		}
		else{
			System.out.println(sb + "と" + sb2 + "は別物です");
		}

		// ７．２つの変数が同じ参照先か比較
		if ( (sb.toString()) == ((sb2).toString())){

			System.out.println(sb + "と" + sb2 + "は同じです");
		}
		else{
			System.out.println(sb + "と" + sb2 + "は別物です");
		}



		 // ***  StringとStringBilderの扱い　***
		System.out.println("\n***  StringとStringBilderの扱い　***");

		// ８．２つの変数が同じ参照先か比較
		// ※　文字列の比較はこれでは正しくできません！！
		if ( sb.equals(text)){

			System.out.println(sb + "と" + text + "は同じです");
		}
		else{
			System.out.println(sb + "と" + text + "は別物です");
		}

		// ９．２つの変数が同じ文字列か比較
		if ( sb.toString().equals(text)){

			System.out.println(sb + "と" + text + "は同じです");
		}
		else{
			System.out.println(sb + "と" + text + "は別物です");
		}

		// １０．２つの変数が同じ文字列か比較
		if ( sb.toString() == text){

			System.out.println(sb + "と" + text + "は同じです");
		}
		else{
			System.out.println(sb + "と" + text + "は別物です");
		}


		char ch = '\u0041';

		System.out.println(ch);

		char num = 0;
		num = (char) (num +1);

		long i = 2147483648L;

	}

	public void makeNewObj(){

		String str = new String("zzz");

		if ( str.equals(str)){

			System.out.println(str + "と" + "zzz" + "は同じです");
		}
		else{
			System.out.println(str + "と" + "zzz" + "は別物です");
		}


	}

}
