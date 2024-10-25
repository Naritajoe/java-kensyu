package problem5;

public class Problem5_3 {
    public static void main(String[] args) {
        int[] d = new int[10];

        System.out.print("");
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 100) + 1;
            System.out.print(" " + d[i]);

        }
        System.out.println(" ");

        System.out.print("偶数:");
        for (int i = 0; i < d.length; i++) {

            if (d[i] % 2 == 0) {
                System.out.print(" " + d[i]);
            }
        }
        System.out.println(" ");

        System.out.print("奇数:");
        for (int i = 0; i < d.length; i++) {

            if (d[i] % 2 == 1) {
                System.out.print(" " + d[i]);
            }
        }

    }
}
