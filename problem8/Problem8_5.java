package problem8;

public class Problem8_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // 3で割れるか３を含むか
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                System.out.print(" " + i);
            }
        }
    }
}
