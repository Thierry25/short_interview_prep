import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "abcabc";
        //System.out.println(getFirstNonRepeatedChar(s1));

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println(sum);
        System.out.println(arr.length * (arr.length + 1) / 2);
    }

    public static char getFirstNonRepeatedChar(String string){
      Map<Character, Integer> charsCount = new HashMap<>();
      for(char c : string.toCharArray()){
          charsCount.put(c, charsCount.containsKey(c) ? charsCount.get(c) + 1 : 1);
      }

      for(Map.Entry<Character, Integer> entry : charsCount.entrySet()){
          if(entry.getValue() == 1) return entry.getKey();
      }
      throw new RuntimeException("Skkr");
    }
}