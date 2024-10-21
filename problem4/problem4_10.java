package problem4;

public class problem4_10 {
    public static void main(String[] args) {
        int b = 1;
        // 無限ループ
        while (true) {
            int a = (int) (Math.random() * 100) + 1;
            System.out.println(a);
            b++;
            if (b == 6) {
                break; // ループから抜ける
            }
        }
        System.out.println("終了します");
    }
}
