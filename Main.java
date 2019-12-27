/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        //return text;
    }

    public static String normalizeText() {

        //removes all the spcaces from your text

        String letter = "a,?> b,. c;:/ d?? e";
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter text to be encrypted: ");
        String usrInput = input.nextLine();

        System.out.println("Please enter the alphabet 'shift' value: ");
        int SftValue = input.nextInt();

        System.out.println("Enter the number of characters per grouping for the code-sizing: ");
        int numChar = input.nextInt();

String normalizedText = encryptString(usrInput, SftValue, numChar );
System.out.println(normalizedText);

        //letter.replaceAll("\\s","");
        String[] letters = letter.replaceAll("[^a-zA-Z ]", "").toUpperCase().split("\\s+");
        System.out.println("This is some \\\"really\\\" great. (Text)!?" + letter + letters);
        return normalizeText();
        // removes any punctuation  (. , : ; ’ ” ! ? ( ) )
        // turn all lower cases letters into upper cases letters
        // return the result
        //**return normalizedText;
    }

    public static String obify() {
        return obifiedText;
    }

    public static String ceasarify() {
        return ceasarifiedText;
    }

    public static String groupify() {
        return groupifiedText;
    }

    public static String encryptString() {
        normalizeText(text);
        obify(normalizedText);
        ceasarify(obifiedText);
        groupify(cesarifiedText);
        print(groupifiedText);
    }

}*/
