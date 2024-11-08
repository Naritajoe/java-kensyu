package problem8;

public class Problem8_13 {
    public static void main(String[] args) {
        // 配列の長さを定義。最大値と数値を動かすときのプレイスホルダーcもここで定義。
        int[] n = new int[10];
        int max = 1;
        int c = 1;

        // １００までの乱数を定義。
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 100) + 1;
        }

        // n内にあるコンテンツn1を１つづつ繰り返しで表示。
        System.out.println("数値： ");
        for (int n1 : n) {
            System.out.print(n1 + " ");
        }
        System.out.println();

        // 最大値を表示。
        for (int i = 0; i < n.length - 1; i++) {
            max = i;

            // 数値の１つ次にあたる数値jを定義、jの最大値はmaxに代入。プレイスホルダーcを使ってn[i]とn[max]を入れ替える。
            for (int j = i + 1; j < n.length; j++) {
                if (n[j] > n[max]) {
                    max = j;
                }
            }
            c = n[i];
            n[i] = n[max];
            n[max] = c;
        }

        // 最終結果の表示。
        System.out.println("大きい順の配列： ");
        for (int n1 : n) {
            System.out.print(n1 + " ");
        }
        System.out.println();
    }
}
