import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(containsVowel("Hll wrld!"));
    }
    public static boolean containsVowel(String input){
       return input.toLowerCase(Locale.ROOT).matches(".*[aeiou].*");
    }
}