package inlämning;

import java.util.Scanner;

public class mainclass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        inlämning.Logic logic = new inlämning.Logic();
        StringBuilder allText = new StringBuilder();

        System.out.println("skriv in din text, när du är nöjd avsluta med stop");

        while (true) {

            String text = sc.nextLine();

            if (logic.isStop(text)) {
                System.out.println("programmet avslutas.");
                break;
            }

            allText.append(text).append("\n");

        }
        String text = allText.toString();

        System.out.println("du skrev:\n " + text);
        System.out.println("Antal rader: " + logic.countLines(text));
        System.out.println("Antal ord: " + logic.wordCount(text));
        System.out.println("Antal bokstäver: " + logic.letterCount(text));
        System.out.println("Längsta ordet: " + logic.longestWord(text));

    }

}
