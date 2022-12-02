public class Character {

    //フィールド
    private final String name;
    private final int age;
    private final String rank;
    private final String battleStyle;
    private final String triggerLevel;

    //コンストラクター
    public Character(String name, int age, String rank, String battleStyle, String triggerLevel) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.battleStyle = battleStyle;
        this.triggerLevel = triggerLevel;

    }


    //名前のみ表示
    public void dspName() {
        System.out.println(name);
    }

    //全表示
    public void dspCharacterDirectory() {
        System.out.println("名前：" + name + " " + "年齢" + age + "歳 " + "ランク" + rank + " " + "使用武器 " + battleStyle + " " + triggerLevel);
    }
}
