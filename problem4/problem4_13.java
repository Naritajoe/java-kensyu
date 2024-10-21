package problem4;

public class problem4_13 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10) + 1;
        int i = 1;
        if (n >= 5) {
            while (i <= n) {
                System.out.print("★");
                ++i;
            }

        } else {
            System.out.print("発生した数値：" + n);
        }
    }
}
