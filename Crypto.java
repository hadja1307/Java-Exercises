import java.util.*;
public class Crypto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your text for encryption.");
        String textIn = input.nextLine();
        System.out.println("Please enter shift key for encryption.");
        int shiftKey = input.nextInt();
        System.out.println("Please enter chunk value for encryption.");
        int chunkNo = input.nextInt();

        //String encryptString(textIn,shiftKey,chunkNo) ;

System.out.println(textIn + shiftKey + chunkNo);
    }


    public static String normalizeText(String text) {
        boolean check = false;
        String[] punctation = {" ", " ", ".", ",", ":", ";", "’", "”", "!", "?", "(", ")", "\""};
        for (int i = 0; i < punctation.length; i++) {
            if (text.contains(punctation[i])) {
                check = true;
                StringBuffer b = new StringBuffer(text);
                b.deleteCharAt(text.indexOf(punctation[i]));
                text = b.toString();
            }
            if (check) {
                check = false;
                i = 0;
            }
        }
        text = text.toUpperCase();
        System.out.println(text);
        return text;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for (; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if (result.length() < 26) {
            for (currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
}

        /* Main method;
         Scanner input = new Scanner(System.in); System.out.println("Please enter your text for encryption.");
        String textIn = input.nextLine();
         System.out.println("Please enter shift key for encryption.");
        int shiftKey = input.nextInt();
        System.out.println("Please enter chunk value for encryption.");
        int chunkNo = input.nextInt();
         encryptString(textIn,shiftKey,chunkNo); }
        public static String normalizeText(String text){ // method for returning Normalized string
        text = text.replaceAll("\\s","");
        text = text.replaceAll("\\p{Punct}","");
        text =text.toUpperCase(); return text; }
        public static String obify(String textNorm){ // method for returning obfuscated text
        if (textNorm.equals("")) { return "";}
         else if ("AEIOUY".indexOf(textNorm.charAt(0))>=0){ return "OB"+textNorm.charAt(0)+obify(textNorm.substring(1)); }
        else {return textNorm.charAt(0)+ obify(textNorm.substring(1));} } public static String shiftAlphabet(int shift) { // method for returning Shifted alphabet
        int start = 0;
         if (shift < 0) { start = (int) 'Z' + shift + 1; }
         else { start = 'A' + shift; } String result = ""; char currChar = (char) start;
         for(; currChar <= 'Z'; ++currChar) { result = result + currChar; }
        if(result.length() < 26) { for(currChar = 'A'; result.length() < 26; ++currChar) { result = result + currChar; } } return result; }
        public static String caesarify (String obs, int key){ // method for Caesar Cipher String
        shiftedAlp = shiftAlphabet(key);
        String alp ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (obs.equals("")) { return "";}
         else{ return shiftedAlp.charAt(alp.indexOf(obs.charAt(0)))+caesarify(obs.substring(1),key); } }
        public static String groupify(String caesarText, int chunk)
        { // method for returning grouped string
             if (caesarText.length()>=chunk){ return caesarText.substring(0,chunk)+" "+groupify(caesarText.substring(chunk), chunk); }
        else if(caesarText.equals("")){ return ""; } else{ while(caesarText.length()!=chunk){ caesarText = caesarText+"x"; } return groupify(caesarText, chunk); }

    }
        public static void encryptString(String text, int key, int group){ // method for returning complete encrypted text
        String normalizedText = normalizeText(text);
        String obifiedText = obify(normalizedText);
        String caesarifiedText = caesarify(obifiedText, key);
        String groupifiedText = groupify(caesarifiedText, group);
        System.out.println(groupifiedText);
    }

    }
*/

