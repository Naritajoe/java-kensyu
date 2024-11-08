package problem8;

public class Problem8_14_1 {
    public static void main(String[] args) {
        System.out.print("10000以下の友愛数の組み合わせ：");
        // メインの数値iを定義。また約数を求めるためにjの結果次第で加算され続けるs1も定義。
        for (int i = 1; i <= 10000; i++) {
            int s1 = 0;
            // iの約数になるjを定義。自身の数iを除くため、１もいらない。＝２からスタートするということから半分の範囲で処理をする。
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    s1 += j;
                }
            }

            // 合計数s１がiより大きく、１００００以下なら処理。
            if (s1 > i && s1 <= 10000) {
                int s2 = 0;
                // kがs１の半分以下なら処理。またs１をkで割れたらs２に加算。
                for (int k = 1; k <= s1 / 2; k++) {
                    if (s1 % k == 0) {
                        s2 += k;
                    }
                }

                // s２とiが同じものなら表示。
                if (s2 == i) {
                    System.out.print(i + " と " + s1 + " は友愛数である。 ");
                }
            }
        }
    }
}
