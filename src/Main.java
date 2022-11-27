import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> userMember = new HashMap<>();
        userMember.put(1,"三雲修。中学生。レイガスト使い");
        userMember.put(2,"空閑遊真。中学生。スコーピオン使い");
        userMember.put(3,"雨取千佳。小学生。スナイパー");
        userMember.put(4,"迅悠一。高校生。風刃使い");

        System.out.println(userMember.get(1));
        System.out.println(userMember.get(2));
        System.out.println(userMember.get(3));
        System.out.println(userMember.get(4));

        int id =5;

        try {
        if(id < 0 || 4 < id) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println(userMember.get(5));
        } catch (ArrayIndexOutOfBoundsException  e ){
           System.out.println("そのメンバーは存在しません");
        }
    }
}