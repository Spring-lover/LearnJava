package LeetCode.easy;

public class test125 {
    public static boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for(int i = 0; i < length; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("OP"));
    }
}
