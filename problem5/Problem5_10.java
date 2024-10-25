package problem5;

public class Problem5_10 {
    public static void main(String[] args) {
        int[] d = new int[7];

        System.out.print("");
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 10) + 1;
            System.out.print(" " + d[i]);

        }
        System.out.println(" ");

        for (int star : d) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
