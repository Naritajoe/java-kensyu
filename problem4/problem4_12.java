package problem4;

public class problem4_12 {
    public static void main(String[] args) {
        int i = 0;
        int min = Integer.MAX_VALUE;
        for (i = 0; i < 5; i++) {
            int a = (int) (Math.random() * 100) + 1;
            System.out.println("a = " + a);
            if (a < min) {
                min = a;
            }
        }
        System.out.println("最小値=" + min);
    }

}
