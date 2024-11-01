package samples;

public class P8_10_1ChatGPT {
    public static void main(String[] args) {
        int max = 40; // フィボナッチ数列の最大値
        int[] fibonacci = new int[100]; // 仮の大きな配列を作成（必要なサイズに対応するため）
        int count = 2; // 初期の2つの値をセットするので、2つ目の要素から開始

        // 初期値を設定
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // フィボナッチ数列を計算して、40以下の値を配列に格納
        while (true) {
            int nextValue = fibonacci[count - 1] + fibonacci[count - 2];
            if (nextValue > max)
                break; // 次の値が40を超えたら終了
            fibonacci[count] = nextValue;
            count++;
        }

        // 数列の表示
        System.out.print("フィボナッチ数列 (40以下): ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
