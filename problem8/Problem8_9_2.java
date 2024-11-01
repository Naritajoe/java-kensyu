package problem8;

public class Problem8_9_2 {
    public static void main(String[] args) {
        // 全体の数字及び偶数、奇数の定義。eCount、oCountで全体の数字の配列を仕分ける。
        int[] n = new int[10];
        int[] evens = new int[10];
        int[] odds = new int[10];
        int eCount = 0;
        int oCount = 0;
        // 全体の数字配列の選択
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 100) + 1;
        }
        // ２で割れるものはevensに入ってeCountが入るたびに増える。またそれ以外（odds）はoCountに加算。
        for (int num : n) {
            if (num % 2 == 0) {
                evens[eCount++] = num;
            } else {
                odds[oCount++] = num;
            }
        }
        // 全体の数字をここで並べる。（int num:n）はnumがnに格納されているよって意味。nの変動でnumも動く。
        System.out.print("数値：");
        for (int num : n) {
            System.out.print(num + " ");
        }
        System.out.println();
        // 偶数の数字をここで並べる。
        System.out.print("偶数：");
        for (int i = 0; i < eCount; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();
        // 奇数の数字をここで並べる。
        System.out.print("奇数：");
        for (int i = 0; i < oCount; i++) {
            System.out.print(odds[i] + " ");
        }
        System.out.println();

    }

}

// System.out.print(" " + n[i]);
// 偶数を先に表示
// if (i < n.length; i % 1 == 0){
// System.out.print(" " + n[i]);