import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Boby"));
    }

    public static boolean isPalindrome(String value){
        char[] chars = value.toLowerCase(Locale.ROOT).toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left <= right){
            if(chars[left] != chars[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}