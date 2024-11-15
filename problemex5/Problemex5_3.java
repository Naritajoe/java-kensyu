package problemex5;

//utilをインポート
import java.util.*;

public class Problemex5_3 {

    public static void main(String[] args) {
        // 新たなArrayListを作成。また数値nも定義。
        ArrayList<Integer> a = new ArrayList<>();

        int n;

        // 0~100までの乱数を代入。もし0が出たら乱数の生成を停止。
        while (true) {
            n = (int) (Math.random() * 101);
            System.out.println("0~100の値を入力:" + n);

            if (n == 0) {
                break;
            }

            // 出た乱数をArrayListに追加。（０は含めない）
            a.add(n);
            // 以下はaが蓄積されているのか確認する方法
            // for (int i = 0; i < 1; i++) {
            // System.out.println(a);
            // }
        }

        // 数値の番号と数値をMapに出力。9まで
        Map<Integer, ArrayList<Integer>> uMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            uMap.put(i, new ArrayList<>());
        }

        // 格納されている数値を１０で割った時に出る余りをunitに含めてArrayListに追加。
        for (int number : a) {
            int unit = number % 10;
            uMap.get(unit).add(number);
        }

        // 各列に表示する一の位が１〜9までの数値を表示。取得したuMapが空なら”なし”と表示。
        // それ以外の数値は各カテゴリに追加。
        for (int i = 0; i < 10; i++) {
            System.out.print("一の位が" + i + " : ");
            if (uMap.get(i).isEmpty()) {
                System.out.println("なし");
            } else {
                for (int v : uMap.get(i)) {
                    System.out.print(v + " ");
                }
                System.out.println();
            }
        }
    }
}
