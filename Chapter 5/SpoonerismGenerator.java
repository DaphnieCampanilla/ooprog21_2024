import java.util.Scanner;

public class SpoonerismGenerator {

    public static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.print(prompt);
        word = scanner.nextLine().toLowerCase();
        return word;
    }

    public static int vowelIndex(String word) {
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                return i;  
            }
        }
        return -1;  
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
    
    
    public static void run() {
        String word1 = getWord("Word 1: ");
        String word2 = getWord("Word 2: ");
        
        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 == -1 || vowelIndex2 == -1 || vowelIndex1 == 0 || vowelIndex2 == 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            String firstPart1 = word1.substring(0, vowelIndex1);  
            String secondPart1 = word1.substring(vowelIndex1);    
            String firstPart2 = word2.substring(0, vowelIndex2);  
            String secondPart2 = word2.substring(vowelIndex2);   
            
            String spoonerizedWord1 = firstPart2 + secondPart1;
            String spoonerizedWord2 = firstPart1 + secondPart2;

           
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
    }
    
    public static void main(String[] args) {
        run(); 
    }
}


