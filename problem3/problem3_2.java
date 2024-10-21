package problem3;

public class problem3_2 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 11) + 1;
        System.out.println("a=" + a);
        if (a == 1) {
            System.out.println("1です。");
        } else {
            System.out.println("1ではありません。");
        }
    }

}
