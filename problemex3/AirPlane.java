package problemex3;

public abstract class AirPlane {
    //   名前フィールド
    private String fly;

    //   引数つきコンストラクタ
    AirPlane(String fly) {
        this.fly = fly;
    }

    //   名前の取得
    public String getfly() {
        return fly;
    }

    //   鳴く（抽象メソッド）
    abstract void movement();
}
