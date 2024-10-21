package problem4;

public class problem4_9 {
    public static void main(String[] args) {
        // 無限ループ
        while (true) {
            int a = (int) (Math.random() * 100) + 1;
            System.out.println(a);
            if (a % 10 == 0) {
                break; // ループから抜ける
            }
        }
        System.out.println("終了します");
    }
}
