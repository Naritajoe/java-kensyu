package problem5;

public class Problem5_9 {
    public static void main(String[] args) {
        int[] d = new int[10];

        System.out.print("");
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 100) + 1;
            System.out.print(" " + d[i]);

        }
        System.out.println(" ");

        System.out.print("50以上の数:");
        for (int i = 0; i < d.length; i++) {

            if (d[i] >= 50) {
                System.out.print(" " + d[i]);
            }
        }
        System.out.println(" ");

        System.out.print("50未満の数:");
        for (int i = 0; i < d.length; i++) {

            if (d[i] < 50) {
                System.out.print(" " + d[i]);
            }
        }

    }
}
