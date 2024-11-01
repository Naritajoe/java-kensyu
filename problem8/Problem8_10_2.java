package problem8;

public class Problem8_10_2 {
    public static void main(String[] args) {
        // 最大の数値４０と、絶対にフィボナッチ数列的に４０まで到達するであろう[]の数、カウンターの定義
        int max = 30;
        int[] n = new int[max * 2];
        int c = 3;
        // 最初のフィボナッチ数列2つを定義
        n[0] = 1;
        n[1] = 1;
        n[2] = 2;
        // カウンターを以前２に当てはめているのでその前にある2つの数字を足す。その結果をvに当てはめmaxの４０を超えたらbreak、超えなければ数列に当てはめる。その後、次の数列の順番に。
        while (true) {
            int v = n[c - 1] + n[c - 2] + n[c - 3];
            if (v > max)
                break;
            n[c] = v;
            c++;
        }
        // フィボナッチ数列の表示
        System.out.println("トリボナッチ数列：");
        for (int i = 0; i < c; i++) {
            System.out.print(" " + n[i]);
        }
    }
}
