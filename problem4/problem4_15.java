package problem4;

public class problem4_15 {
    public static void main(String[] args) {
        int n = 1;
        // 無限ループ
        while (n <= 100) {

            System.out.print(n + " ");
            ++n;
            if (n % 10 == 1) {
                System.out.println(" ");
            }
            if (n == 100) {
                System.out.println(100);
                break; // ループから抜ける
            }
        }
    }
}
