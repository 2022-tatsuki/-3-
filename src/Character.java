public class Character {

    //フィールド
    private final String name;
    private final int age;
    private final String rank;
    private final String battlestyle;
    private final String trigerlevel;

    //コンストラクター
    public Character(String name, int age, String rank, String battlestile, String trigerlevel) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.battlestyle = battlestile;
        this.trigerlevel = trigerlevel;
    }

    //ゲッター：値を入手し、Mainへ返す。
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getRank() {
        return this.rank;
    }

    public String getBattlestile() {
        return this.battlestyle;
    }

    public String getTrigerlevel() {
        return this.trigerlevel;
    }

    //名前のみ表示
    public void dispName() {
        System.out.println(getName());
    }

    //全表示
    public void dispCharacterDirectory() {
        System.out.println("名前：" + getName() + " " + "年齢" + getAge() + "歳 " + "ランク" + getRank() + " " + "使用武器 " + getBattlestile() + " " + getTrigerlevel());
    }
}
