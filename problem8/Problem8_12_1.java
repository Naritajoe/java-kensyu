package problem8;

public class Problem8_12_1 {
    public static void main(String[] args) {
        int a = 100;
        boolean[] n = new boolean[a + 1];

        // 初期化: すべての数値をtrueに設定（後で素数かどうか判定）
        for (int i = 2; i <= a; i++) {
            n[i] = true;
        }

        // エラトステネスのふるいアルゴリズム
        for (int i = 2; i * i <= a; i++) {
            if (n[i]) {
                // i の倍数をすべて false にする
                for (int j = i * i; j <= a; j += i) {
                    n[j] = false;
                }
            }
        }

        // 結果の表示
        System.out.println("100以下の素数:");
        for (int i = 2; i <= a; i++) {
            if (n[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

// n[1]に含まれる数値を倍数にして消していっていると思う。