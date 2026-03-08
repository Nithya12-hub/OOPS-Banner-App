public class OOPSBannerApp {

    public static void main(String[] args) {
        // UC6: Modular array initialization using static methods
        // Each method call returns a String[] representing the 5 rows of that letter
        String[][] banner = {
            getPatternO(),
            getPatternO(),
            getPatternP(),
            getPatternS()
        };

        renderBanner(banner);
    }

    // Helper method for Letter O
    public static String[] getPatternO() {
        return new String[] {
            " ***** ",
            "* *",
            "* *",
            "* *",
            " ***** "
        };
    }

    // Helper method for Letter P
    public static String[] getPatternP() {
        return new String[] {
            "****** ",
            "* *",
            "****** ",
            "* ",
            "* "
        };
    }

    // Helper method for Letter S
    public static String[] getPatternS() {
        return new String[] {
            " ***** ",
            "* ",
            " **** ",
            "     * ",
            "***** "
        };
    }

    // Reusable rendering logic
    public static void renderBanner(String[][] banner) {
        for (int i = 0; i < 5; i++) { // For each of the 5 rows
            for (String[] letter : banner) { // For each letter in our O-O-P-S sequence
                System.out.print(letter[i] + "  "); // Print the specific row of that letter
            }
            System.out.println(); // Move to next line
        }
    }
}