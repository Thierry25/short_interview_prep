public class Main {
    public static void main(String[] args) {
        System.out.println(whiteSpaceRemoval("Hello world!"));
    }

    public static String whiteSpaceRemoval(String value){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = value.toCharArray();

        for(char c: chars){
            if(!Character.isWhitespace(c)){
              stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}