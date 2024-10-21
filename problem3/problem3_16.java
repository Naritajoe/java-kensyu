package problem3;

public class problem3_16 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100) + 1;
        System.out.println("a=" + a);
        if (a % 2 == 0 & !(a % 3 == 0)) {
            System.out.println("2の倍数です。");
        } else if (a % 3 == 0 & !(a % 2 == 0)) {
            System.out.println("3の倍数です。");
        } else if (a % 2 == 0 & a % 3 == 0) {
            System.out.println("2と3の公倍数です。");
        } else {
            System.out.println("どれでもないです。");
        }
    }

}