package problem3;

public class problem3_17 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100) + 1;
        System.out.println("a=" + a);
        if (a % 2 == 0 & !(a <= 50)) {
            System.out.println("偶数です。");
        } else if (a % 2 == 0 & a <= 50) {
            System.out.println("50以下の偶数です。");
        } else if (a <= 50 & !(a % 2 == 0)) {
            System.out.println("50以下です。");
        } else {
            System.out.println("どれでもないです。");
        }
    }

}
