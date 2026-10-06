package inlämning;

// räknar ord, rader och kollar stop
public class Logic {

    public int wordCount(String text) {
        if (text.isBlank()) return 0;
        return text.trim().split("\\s+").length;
    }

    public int letterCount(String text) {
        return text.replaceAll("\\s+", "").length();
    }

    public String longestWord(String text) {
        String[] words = text.trim().split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public int countLines(String text) {
        if (text.isBlank()) return 1;
        return text.split("\n").length;
    }

    public boolean isStop(String text) {
        return text.equals("stop");
    }
}