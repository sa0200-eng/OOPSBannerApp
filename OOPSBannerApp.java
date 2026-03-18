public class OOPSBannerApp {

    // 🔹 Inner Static Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // 🔹 Pattern for O
        String[] OPattern = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        // 🔹 Pattern for P
        String[] PPattern = {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };

        // 🔹 Pattern for S
        String[] SPattern = {
            " *****",
            "*     ",
            "*     ",
            " *****",
            "     *",
            "     *",
            " *****"
        };

        // 🔹 Array of Objects
        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', OPattern),
            new CharacterPatternMap('O', OPattern),
            new CharacterPatternMap('P', PPattern),
            new CharacterPatternMap('S', SPattern)
        };

        // 🔹 Print Banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : patterns) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}