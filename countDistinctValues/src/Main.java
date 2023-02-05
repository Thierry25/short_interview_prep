import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str1 = "abcdABCDabcd";

        char[] chars = str1.toCharArray();
        Map<Character, Integer> charsCount = new HashMap<>();
        for(char c: chars){
            if(charsCount.containsKey(c)) charsCount.put(c, charsCount.get(c) + 1);
            else charsCount.put(c, 1);
        }
        System.out.println(charsCount);
    }


}