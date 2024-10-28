package problem8;

public class Problem8_1 {
    // 定義付け
    public static void main(String[] args) {
        int n = 1;
        int a = 1;
        int b = 1;

        // forの二重構文でa*aとb＊bを計算
        for (a = 1; a <= 100; a++) {
            for (b = 1; b <= 100; b++) {
                n = a * a + b * b;
                // 結果を平方根で置き換え、整数かつ１００以下なら表示する。
                if (Math.sqrt(n) % 1 == 0) {
                    if (Math.sqrt(n) <= 100) {
                        System.out.println(
                                a + "*" + a + "+" + b + "*" + b + "=" + Math.sqrt(n) + "*" + Math.sqrt(n) + " 積は" + n);
                    }
                }
            }

        }

    }
}
