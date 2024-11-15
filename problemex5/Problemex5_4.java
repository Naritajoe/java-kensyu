package problemex5;

//今回.ioを使うことでコンソールに読み取り/書き出しを行っている。
import java.io.*;
import java.util.*;

public class Problemex5_4 {

    public static void main(String[] args) throws IOException {
        // IOExeptionはエラーをそのまま呼び出し側に投げるらしい、、、。
        // InputStreamReaderは書き込み、BufferedReaderは読み取り
        // 最初の文章も表示させる。

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        ArrayList<String> a = new ArrayList<>();
        String buf;

        System.out.println("文字を入力。空白で終了。");

        // コンソールから文字列の読み込み、Listに追加or追加を終了。

        while (true) {

            buf = br.readLine();

            if (buf.isEmpty()) {
                break;
            }

            a.add(buf);
        }

        System.out.println("入力された文字列：");
        for (String input : a) {
            System.out.print(input + ", ");
        }
    }

}
