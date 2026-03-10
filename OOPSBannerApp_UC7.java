public class OOPSBannerApp_UC7 {

    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
            
        }

        char getCharacter() {
            return character;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    static class CharacterPatternMap {

        static CharacterPattern[] patterns = {
                new CharacterPattern('O', new String[]{
                        " *** ",
                        "*   *",
                        "*   *",
                        "*   *",
                        " *** "
                }),
                new CharacterPattern('P', new String[]{
                        "**** ",
                        "*   *",
                        "**** ",
                        "*    ",
                        "*    "
                }),
                new CharacterPattern('S', new String[]{
                        " ****",
                        "*    ",
                        " *** ",
                        "    *",
                        "**** "
                })
        };

        static String[] getPattern(char c) {
            for (CharacterPattern cp : patterns) {
                if (cp.getCharacter() == c) {
                    return cp.getPattern();
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";

        String[][] banner = new String[word.length()][];

        for (int i = 0; i < word.length(); i++) {
            banner[i] = CharacterPatternMap.getPattern(word.charAt(i));
        }

        for (int i = 0; i < banner[0].length; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < banner.length; j++) {
                line.append(banner[j][i]).append("  ");
            }
            System.out.println(line);
        }
    }
}