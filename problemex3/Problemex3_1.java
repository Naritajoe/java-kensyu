package problemex3;

public class Problemex3_1 {
    public static void main(String[] args) {
        AirPlane a[] = new AirPlane[2]; // Birdクラスの変数の配列を生成
        a[0] = new FighterAiracraft(); // b[0]に、FighterAiracraftクラスのインスタンスを生成
        a[1] = new PassengerPlane(); // b[1]に、PassengerPlaneクラスのインスタンスを生成
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getfly());
            a[i].movement();
        }
    }
}
