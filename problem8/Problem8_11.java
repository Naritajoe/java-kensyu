package problem8;

public class Problem8_11 {
    public static void main(String[] args) {
        // 配列２つの定義、共通数（dual）と片方のみの数（semi）と各カウンターの定義
        int[] a = new int[10];
        int[] b = new int[10];
        int[] dual = new int[10];
        int[] semi = new int[10];
        int dualC = 0;
        int semiC = 0;
        // aとbのランダム数値配属
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
            b[i] = (int) (Math.random() * 10) + 1;
        }
        // 配列１の結果を表示
        System.out.print("配列1: ");
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();
        // 配列２の結果を表示
        System.out.print("配列2: ");
        for (int n : b) {
            System.out.print(n + " ");
        }
        System.out.println();
        // boolean（trueかfalseのみで定義できるintみたいなやつ）で両配列のjがiと等しくなったらループ解除
        for (int i = 0; i <= 10; i++) {
            boolean inA = false;
            boolean inB = false;

            for (int j = 0; j < 10; j++) {
                if (a[j] == i) {
                    inA = true;
                    break;
                }
            }

            for (int j = 0; j < 10; j++) {
                if (b[j] == i) {
                    inB = true;
                    break;
                }
            }
            // 両配列の数値が等しかったらdualにカウント
            if (inA && inB) {
                dual[dualC++] = i;
            }
            // 両配列の数値が等しく無かったらsemiにカウント
            if (inA || inB) {
                semi[semiC++] = i;
            }
        }
        // 結果の表示
        System.out.print("共通の数：");
        for (int i = 0; i < dualC; i++) {
            System.out.print(dual[i] + " ");
        }
        System.out.println();

        System.out.print("どちらかに入っている数");
        for (int i = 0; i < semiC; i++) {
            System.out.print(semi[i] + " ");
        }
    }
}
