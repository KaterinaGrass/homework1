package classstring;

import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String string = sc.nextLine();
        String[] words = string.split(" ");//method split object array String
        HashMap<String, Integer> wordToCount = new HashMap<>();// to simply counting the number of occurrence
        // of a word,use Has Map
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + "" + wordToCount.get(word));
        }
    }

}