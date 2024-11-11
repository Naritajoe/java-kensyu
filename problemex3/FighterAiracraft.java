package problemex3;

public class FighterAiracraft extends AirPlane {

    // 飛行する
    public FighterAiracraft() {
        super("攻撃に出るために飛行します。");
    }

    // 戦闘する
    public void movement() {
        System.out.println("戦闘します。");
    }
}
