package problem3;

public class problem3_5 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100) + 1;
        System.out.println("a=" + a);
        if (a > 20 & a < 80) {
            System.out.println("20以上80未満です");
        } else {
            System.out.println("20以上80未満ではありません");
        }
    }

}