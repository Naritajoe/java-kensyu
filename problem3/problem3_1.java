package problem3;

public class problem3_1 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 11) + 1;
        System.out.println("a=" + a);
        if (a > 5) {
            System.out.println("5以上です。");
        } else {
            System.out.println("5以上ではありません。");
        }
    }

}