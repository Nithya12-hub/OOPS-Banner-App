public class OOPSBannerApp {

    // UC7: Static Inner Class for encapsulation
    static class CharacterPattern {
        private char character;
        private String[] lines;

        public CharacterPattern(char character, String[] lines) {
            this.character = character;
            this.lines = lines;
        }

        public String getLine(int index) {
            return lines[index];
        }

        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {
        // Initialize our "Library" of character objects
        CharacterPattern charO = new CharacterPattern('O', new String[]{
            " ***** ", "* *", "* *", "* *", " ***** "
        });
        CharacterPattern charP = new CharacterPattern('P', new String[]{
            "****** ", "* *", "****** ", "* ", "* "
        });
        CharacterPattern charS = new CharacterPattern('S', new String[]{
            " ***** ", "* ", " **** ", "     * ", "***** "
        });

        // The banner is now a collection of Objects
        CharacterPattern[] banner = { charO, charO, charP, charS };

        renderBanner(banner);
    }

    public static void renderBanner(CharacterPattern[] banner) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 5; i++) { // Loop through the 5 rows
            for (CharacterPattern cp : banner) {
                sb.append(cp.getLine(i)).append("  ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}