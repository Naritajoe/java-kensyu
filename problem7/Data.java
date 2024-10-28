package problem7;

public class Data {
    // メンバ変数number
    private int number = 0;
    // メンバ変数comment
    private String comment = "";

    // コンストラクタ(引数つき)
    public Data(String comment) {
        this.comment = comment;
    }

    // numberのセッター
    public void setNumber(int number) {
        this.number = number;
    }

    // numberのゲッター
    public int getNumber() {
        return this.number;
    }

    // numberのセッター
    public void setComment(String comment) {
        this.comment = comment;
    }

    // commentのゲッター
    public String getComment() {
        return this.comment;
    }
}
