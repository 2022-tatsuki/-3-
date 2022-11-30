public class OriginalException extends Exception {
    //フィールド
    public String Error;

    //コンストラクター
    public OriginalException(String Error) {
        this.Error = Error;
    }

    //ゲッター：値を入手し、メインに返す。
    public String getError() {
        return this.Error;
    }
}
