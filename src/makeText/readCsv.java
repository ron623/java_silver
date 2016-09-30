package makeText;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class readCsv {

    public void readCsvFile() {

        try {
            //ファイルを読み込む
            FileReader fr = new FileReader("c:\\Users\\shinozaki_h\\Desktop\\work\\test.csv");
            BufferedReader br = new BufferedReader(fr);

            //読み込んだファイルを１行ずつ処理する
            String line;
            StringTokenizer token;
            while ((line = br.readLine()) != null) {
                //区切り文字","で分割する
                token = new StringTokenizer(line, ",");

                //分割した文字を画面出力する
                while (token.hasMoreTokens()) {
                    System.out.println(token.nextToken());
                }
                System.out.println("**********");
            }

            //終了処理
            br.close();

        } catch (IOException ex) {
            //例外発生時処理
            ex.printStackTrace();
        }
    }

}