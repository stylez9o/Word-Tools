package FindAnagrams;
import java.util.Arrays;
import java.util.List;

public class AnagramProofer {

    static void isNotAnAnagram(List<String> liste) {
        System.out.println("No Anagram matches:");
        for (int i = 0; i < liste.size(); i++) {
            String text1 = liste.get(i);

            String t1 = text1.replaceAll("\\s", "");

            boolean is;
            // if (t1.length() != t2.length()) {
            // is = false;
            // } else {
            // char[] Text1array = t1.toLowerCase().toCharArray();
            // char[] Text2array = t2.toLowerCase().toCharArray();
            // Arrays.sort(Text1array); Arrays.sort(Text2array);

            // is = Arrays.equals(Text1array, Text2array);
            // }

            for (String object : liste) {

                String t2 = object.replaceAll("\\s", "");
                if (t1.length() != t2.length()) {
                    is = false;
                } else {
                    char[] Text1array = t1.toLowerCase().toCharArray();
                    char[] Text2array = t2.toLowerCase().toCharArray();
                    Arrays.sort(Text1array);
                    Arrays.sort(Text2array);

                    is = Arrays.equals(Text1array, Text2array);
                }

                if (!is) {
                    System.out.println(object);
                } else {
                }
            }
            System.out.println("----");

        }

        System.out.println("\nEnde der Überprüfung!");

    }

    static void isAnAnagram(List<String> liste) {
        System.out.println("Anagram matches:");
        for (int i = 0; i < liste.size(); i++) {
            String text1 = liste.get(i);

            String t1 = text1.replaceAll("\\s", "");

            boolean is;
            // if (t1.length() != t2.length()) {
            // is = false;
            // } else {
            // char[] Text1array = t1.toLowerCase().toCharArray();
            // char[] Text2array = t2.toLowerCase().toCharArray();
            // Arrays.sort(Text1array); Arrays.sort(Text2array);

            // is = Arrays.equals(Text1array, Text2array);
            // }

            for (String object : liste) {

                String t2 = object.replaceAll("\\s", "");
                if (t1.length() != t2.length()) {
                    is = false;
                } else {
                    char[] Text1array = t1.toLowerCase().toCharArray();
                    char[] Text2array = t2.toLowerCase().toCharArray();
                    Arrays.sort(Text1array);
                    Arrays.sort(Text2array);

                    is = Arrays.equals(Text1array, Text2array);
                }

                if (is) {
                    System.out.println(object);
                } else {
                }
            }
            System.out.println("----");

        }

        System.out.println("\nEnde der Überprüfung!");

    }

}