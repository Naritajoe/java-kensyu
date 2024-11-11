package problemex3;

public class PassengerPlane extends AirPlane {

    // 飛行する
    public PassengerPlane() {
        super("乗客を乗せて目的地まで飛行します。");
    }

    // 戦闘する
    public void movement() {
        System.out.println("乗客を目的地まで運びます。");
    }

}
