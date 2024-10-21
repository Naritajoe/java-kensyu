package problem4;

public class problem4_14 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10) + 1;
        int i = 1;
        if (n % 2 == 0) {
            while (i <= n) {
                System.out.print("★");
                ++i;
            }

        } else {
            while (i <= n) {
                System.out.print("☆");
                ++i;
            }
        }
    }
}