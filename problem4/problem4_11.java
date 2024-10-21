package problem4;

public class problem4_11 {
    public static void main(String[] args) {
        int i = 0;
        int max = Integer.MIN_VALUE;
        for (i = 0; i < 5; i++) {
            int a = (int) (Math.random() * 100) + 1;
            System.out.println("a = " + a);
            if (a > max) {
                max = a;
            }
        }
        System.out.println("最大値=" + max);

    }

}
