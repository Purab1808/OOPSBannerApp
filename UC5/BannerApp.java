package OOPSBanner.UC5;
import java.util.*;
public class BannerApp {

    public static Map<Character, String[]> buildCharacterMap() {
        Map<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        charMap.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        charMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return charMap;
    }

    public static void displayBanner(String word, Map<Character, String[]> charMap) {
        int rows = charMap.get(word.charAt(0)).length;

        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = charMap.get(c);
                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                } else {
                    line.append("       ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> charMap = buildCharacterMap();
        String word = "OOPS";
        displayBanner(word, charMap);
    }
}
