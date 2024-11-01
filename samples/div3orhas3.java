package samples;

public class div3orhas3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // 条件: 3で割り切れる または 数値に"3"が含まれている
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                System.out.print(" " + i);
            }
        }
    }
}
