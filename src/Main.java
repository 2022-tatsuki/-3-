//mapの使用を宣言

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //mapを設定
        Map<Integer, Character> Characterlist = new HashMap<>();
        Characterlist.put(1, new Character("三雲　修", 15, "B級", "レイガスト使い", "ノーマルトリガー"));
        Characterlist.put(2, new Character("空閑　遊真", 15, "B級", "スコーピオン使い", "ブラックトリガー"));
        Characterlist.put(3, new Character("雨取　千佳", 13, "B級", "イーグレット使い", "ノーマルトリガー"));
        Characterlist.put(4, new Character("迅　悠一", 19, "S級", "風刃使い", "ブラックトリガー"));

        //名前のみ表示
        for (int i = 1; i < 5; i++) {
            Characterlist.get(i).dispName();
        }
        //mapを全て表示させる。
        for (int i = 1; i < 5; i++) {
            Characterlist.get(i).dispCharacterDirectory();
        }


        //例外を意図的に表示　
        try {
            if (Characterlist.get(0) == null) {
                throw new OriginalException("そのメンバーは存在しません");
            }

        } catch (OriginalException e) {
            System.out.println(e.getError());
        }
    }
}
