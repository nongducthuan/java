import java.util.*;

class EIALPHABET {
    
    public static String checkPangram(String phrase) {
        Set<Character> alphabet = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.add(ch);
        }
        
        Set<Character> phraseSet = new HashSet<>();
        for (char ch : phrase.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                phraseSet.add(ch);
            }
        }
        
        alphabet.removeAll(phraseSet);
        if (!alphabet.isEmpty()) {
            StringBuilder missingLetters = new StringBuilder();
            for (char ch : alphabet) {
                missingLetters.append(ch);
            }
            return "missing " + missingLetters.toString();
        } else {
            return "pangram";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            String phrase = scanner.nextLine();
            System.out.println(checkPangram(phrase));
        }
        scanner.close();
    }
}

