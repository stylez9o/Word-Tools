package old;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WordTools {

    // When String a equals to String b, it returns true
    boolean functionToCheck1(String a, String b) {

        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        String x = new String(a1), y = new String(b1);

        if (x.equals(y)) {

            return true;
        } else {
            return x.equals(y);
        }
    }

    // When String a equals to String b, it returns the Second String
    String functionToCheck2(String a, String b) {

        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        String x = new String(a1), y = new String(b1);

        if (x.equals(y)) {

            return b;
        } else {
            return " ";
        }
    }

}
