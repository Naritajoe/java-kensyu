package day6;

public class Sample601 {

    public static void main(String[] args) {
        SampleClass01 s = new SampleClass01(); // インスタンスの生成
        s.n = 100; // フィールドnに値を代入
        s.s = "Hello"; // フィールドsに値を代入
        String str = s.add("World"); // メソッドadd()を呼び出し
        int ans = s.add(1, 2); // メソッドadd()を呼び出し
        System.out.println(str); // 呼び出し結果の表示
        System.out.println(ans); // 呼び出し結果の表示
        s.showNum(); // メソッドshowNum()を呼び出し
    }
}