package LeetCode.easy;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-02 21:25
 **/

public class test771 {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < J.length(); i++) {
            if (S.contains(Character.toString(J.charAt(i)))) {
                result += 1;
            }
        }
        return result;
    }
}
