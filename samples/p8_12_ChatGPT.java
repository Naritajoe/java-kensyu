package samples;

public class p8_12_ChatGPT {
    public static void main(String[] args) {
        int limit = 100;
        boolean[] n = new boolean[limit + 1];

        // 初期化: すべての数値をtrueに設定（後で素数かどうか判定）
        for (int i = 2; i <= limit; i++) {
            n[i] = true;
        }

        // エラトステネスのふるいアルゴリズム
        for (int i = 2; i * i <= limit; i++) {
            if (n[i]) {
                // i の倍数をすべて false にする
                for (int j = i * i; j <= limit; j += i) {
                    n[j] = false;
                }
            }
        }

        // 結果の表示
        System.out.println("100以下の素数:");
        for (int i = 2; i <= limit; i++) {
            if (n[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
