import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        ReadWord("the");
    }

    public static void ReadWord(String word) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();

        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int count = 1;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        for (String number : lines) {
            int period1 = number.indexOf(".");

            if (period1 > 0) {
                sentences.add(number.substring(0, period1 + 1));
            }

            int period2 = number.indexOf(".", period1 + 1);

            if (period2 > 0) {
                sentences.add(number.substring(period1 + 1, period2));
            }

            if (sentences.get(sentences.size() - 1).endsWith("(e")) {
                sentences.remove(sentences.size() - 1);
                period2 = number.indexOf(".", period2 + 4);
                sentences.add(number.substring(period1 + 1, period2));
            }


            int period3 = number.indexOf(".", period2 + 1);

            if (period2 == -1) {
                period3 = -1;
            }

            if (period3 > 0) {
                sentences.add(number.substring(period2 + 1, period3));

            }
            if (sentences.get(sentences.size() - 1).endsWith("(e")) {
                sentences.remove(sentences.size() - 1);
                period3 = number.indexOf(".", period3 + 4);
                sentences.add(number.substring(period2, period3));
            }

            int period4 = number.indexOf(".", period3 + 1);

            if (period3 == -1) {
                period4 = -1;
            }

            if (period4 > 0) {
                sentences.add(number.substring(period3 + 1, period4));
            }

            if (sentences.get(sentences.size() - 1).endsWith("(e")) {
                sentences.remove(sentences.size() - 1);
                period4 = number.indexOf(".", period4 + 4);
                sentences.add(number.substring(period3, period4));
            }


            int period5 = number.indexOf(".", period4 + 1);
            if (period4 == -1) {
                period5 = -1;
            }

            if (period5 > 0) {
                sentences.add(number.substring(period4 + 1, period5));
            }


            if (sentences.get(sentences.size() - 1).endsWith("(e")) {
                sentences.remove(sentences.size() - 1);
                period5 = number.indexOf(".", period5 + 4);
                sentences.add(number.substring(period4, period5));
            }

            if (number.contains(word)) {
                System.out.println("Word: " + word + " appears in line: " +  count);
            }
            count++;

        }

        for (int i = 1; i < sentences.size(); i++) {
            ArrayList<Integer> sentenceIndex = new ArrayList<>();

            if (sentences.get(i-1).contains(word)) {
                System.out.println("Word: " + word + " appears in sentence: " + i);
            }
            int count1 = 0;
            int indexPos = 0;
            while (indexPos != -1){

                if (sentences.get(i-1).contains(word)){
                    indexPos = sentences.get(i-1).indexOf(word,indexPos + 1);
                    sentenceIndex.add(indexPos);
                }
                if (indexPos == -1){
                    sentenceIndex.remove(sentenceIndex.size()-1);

                }
                if (indexPos == 0){
                    indexPos =-1;
                }
                if (indexPos != -1 && sentenceIndex.size() > 0){
                    System.out.println("Word: " +word + " appears at index: " + sentenceIndex.get(count1) + " in sentence: " + i);
                    count1++;
                }

            }
        }
        br.close();

    }
}



