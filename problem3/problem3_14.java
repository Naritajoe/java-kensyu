package problem3;

public class problem3_14 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) + 1;
        System.out.println("a=" + a);
        int b = (int) (Math.random() * 10) + 1;
        System.out.println("b=" + b);
        if (a > b) {
            System.out.println("aの方が大きいです");
        } else if (a == b) {
            System.out.println("等しいです");
        } else {
            System.out.println("bの方が大きいです");
        }
    }
}