import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        String answer = "";
        HashMap<String, String> morseToAlphabet = new HashMap<>();
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.",
        "--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",
        ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",             "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y",         "z"};
        for (int i = 0; i < morseCodes.length; i++) {
            morseToAlphabet.put(morseCodes[i], alphabets[i]);
        }
        String[] letter1 = letter.split(" ");
        for(String s:letter1)
        {
            answer += morseToAlphabet.get(s);
        }
        return answer;
    }
}