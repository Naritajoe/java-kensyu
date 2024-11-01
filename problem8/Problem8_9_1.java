package problem8;

public class Problem8_9_1 {
    public static void main(String[] args) {

        // 比較する数値iを定義
        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            // 比較に使う約数jを定義。sumを使って数値を蓄積していく。
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i + " ");
            }
        }
    }
}