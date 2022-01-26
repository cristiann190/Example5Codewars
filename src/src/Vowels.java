package src;

public class Vowels {
    protected static int getCount(String word) {
        int vowelsCount = 0;
        for (char letter : word.toCharArray()) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    ///////////////////////////////////////BEST OPTIMIZED EXAMPLE////////////////////////////////////////////////

    public static int getCountOptimized(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}