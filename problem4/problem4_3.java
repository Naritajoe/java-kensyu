package problem4;

public class problem4_3 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) + 1;
        int i = 1;
        while (i <= a) {
            System.out.print("■");
            i++;
        }
        System.out.println();
    }
}