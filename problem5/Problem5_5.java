package problem5;

public class Problem5_5 {
    public static void main(String[] args) {
        int[] d = new int[10];

        System.out.print("");
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 10) + 1;
            System.out.print(" " + d[i]);

        }
        System.out.println(" ");

        System.out.print("3の倍数:");
        for (int i = 0; i < d.length; i++) {

            if (d[i] % 3 == 0) {
                System.out.print(" " + d[i]);
            }
        }
        System.out.println(" ");

        System.out.print("3の倍数以外の数:");
        for (int i = 0; i < d.length; i++) {

            if (!(d[i] % 3 == 0)) {
                System.out.print(" " + d[i]);
            }
        }

    }

}
