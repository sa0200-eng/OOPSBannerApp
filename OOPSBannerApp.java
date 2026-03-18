import java.util.*;

public class OOPSBannerApp {

    // Map to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        String text = "OOPS"; // You can change this if needed

        renderBanner(text);
    }

    // Function to initialize patterns
    static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    // Function to render banner
    static void renderBanner(String text) {

        for (int i = 0; i < 7; i++) {
            for (char ch : text.toCharArray()) {

                if (patternMap.containsKey(ch)) {
                    System.out.print(patternMap.get(ch)[i] + "  ");
                } else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }
    }
}