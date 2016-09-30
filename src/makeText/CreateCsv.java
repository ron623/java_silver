package makeText;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateCsv {

	public void csvPrint() {

		try {
			// 出力先を作成する
			FileWriter fw = new FileWriter("c:\\Users\\shinozaki_h\\Desktop\\work\\test.csv", false); // ※１
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

			// 内容を指定する
			pw.print("あああ");
			pw.print(",");
			pw.print("いいい");
			pw.print(",");
			pw.print("ううう");
			pw.println();

			pw.print("001");
			pw.print(",");
			pw.print("002");
			pw.print(",");
			pw.print("003");
			pw.println();

			// ファイルに書き出す
			pw.close();

			// 終了メッセージを画面に出力する
			System.out.println("出力が完了しました。");

		} catch (IOException ex) {
			// 例外時処理
			ex.printStackTrace();
		}
	}

}