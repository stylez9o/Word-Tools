package old;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WordToolsOLD2 {

    List matched = new ArrayList<String>();
    List unmatched = new ArrayList<String>();

    // When String a equals to String b, it returns true
    private boolean functionToCheck(String a, String b) {

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

    // Variante mit Übergabe Parameter(List) zum Testen
    public void startCheckingAnagrams(List<String> listToCheck) {
        int j = 1;
        boolean matched;
        int endoflist;
        boolean hasNexxt;
        String temporaryString1 = "";
        String temporaryString2 = "";
        String lastIndexEntry = "";
        int countUnmatches = 0;
        int[] sizeOfList = new int[1];
        int sizeOfMatched = 0;
        int sizeOfUnmatched = 0;
        int sizeOfListToCheck = listToCheck.size();
        int endSize = 0;
        int max = 0;
        int startvariable = 0;

        this.matched.add("Matched List:");
        // this.unmatched.add("Unmatched List:");
        Scanner aScn = new Scanner(System.in);
        System.out.println("Zum starten des Prüfvorganges, bitte die [Enter-Taste] drücken!");
        aScn.nextLine();
        System.out.println("Start!");
        sizeOfList[0] = listToCheck.size();

        Iterator<String> listToCheckIterator = listToCheck.iterator();

        // Here starts the program work
        while (listToCheckIterator.hasNext()) {

            System.out.println(listToCheckIterator.next());

            sizeOfMatched = this.matched.size();
            sizeOfUnmatched = this.unmatched.size();

            endSize = sizeOfListToCheck - sizeOfMatched;

            if (endSize == sizeOfUnmatched) {
                max = 1;
            }

            if (startvariable == 0) {
                // Start-Parameters - only the first time when the program starts
                temporaryString1 = listToCheck.get(0);
                temporaryString2 = listToCheck.get(1);
                startvariable++;
            }

            // At this point the program runs everytime the loop isnt closed

            if (temporaryString1.equals(temporaryString2)) {
                temporaryString2 = (String) listToCheckIterator.next();
            } else {

                hasNexxt = listToCheckIterator.hasNext();
                if (hasNexxt) {
                    endoflist = 1;
                } else {
                    endoflist = 2;
                }

                switch (endoflist) {// Beginn of Switch Case

                    case 1:// End Of List
                        matched = this.functionToCheck(temporaryString1, temporaryString2);
                        // Matched

                        if (matched & (listToCheck.size() == 2)) {
                            int sizeOfMatchedList = this.matched.size() - 1;
                            // Iterator<String> matchedListIterator = this.matched.iterator();
                            lastIndexEntry = (String) this.matched.get(sizeOfMatchedList);

                            if (this.functionToCheck(temporaryString1, lastIndexEntry)) {
                                this.matched.add(temporaryString1);
                                this.unmatched.add(temporaryString2);
                                listToCheck.remove(temporaryString2);
                                listToCheck.remove(temporaryString1);
                            } else {
                                this.unmatched.add(temporaryString1);
                                this.unmatched.add(temporaryString2);
                                listToCheck.remove(temporaryString2);
                                listToCheck.remove(temporaryString1);
                            }
                            listToCheck.clear();
                        } else if (matched) {
                            this.matched.add(temporaryString1);
                            this.matched.add(temporaryString2);
                            listToCheck.remove(temporaryString2);
                            listToCheck.remove(temporaryString1);
                            listToCheck.clear();
                            listToCheck = this.unmatched;
                            this.unmatched.clear();

                        }

                        // Not Matched
                        if (!matched) {
                            int sizeOfMatchedList = this.matched.size() - 1;
                            // Iterator<String> matchedListIterator = this.matched.iterator();
                            lastIndexEntry = (String) this.matched.get(sizeOfMatchedList);

                            if (this.functionToCheck(temporaryString1, lastIndexEntry)) {
                                this.matched.add(temporaryString1);
                                this.unmatched.add(temporaryString2);
                                listToCheck.remove(temporaryString2);
                                listToCheck.remove(temporaryString1);
                            } else {

                                this.unmatched.add(temporaryString1);
                                this.unmatched.add(temporaryString2);
                                listToCheck.remove(temporaryString2);
                                listToCheck.remove(temporaryString1);
                            }
                            listToCheck.clear();
                            listToCheck = this.unmatched;
                            this.unmatched.clear();
                            countUnmatches++;
                        } else if (!matched & ((countUnmatches == sizeOfList[0]))) {
                            int sizeOfMatchedList = this.matched.size() - 1;
                            // Iterator<String> matchedListIterator = this.matched.iterator();
                            lastIndexEntry = (String) this.matched.get(sizeOfMatchedList);

                            if (this.functionToCheck(temporaryString1, lastIndexEntry)) {
                                this.matched.add(temporaryString1);
                                this.unmatched.add(temporaryString2);
                                listToCheck.remove(temporaryString2);
                                listToCheck.remove(temporaryString1);
                                this.matched.add("Ende der Liste");
                                this.unmatched.add("Ende der Liste");
                            } else {
                                this.unmatched.add(temporaryString1);
                                this.unmatched.add(temporaryString2);
                                listToCheck.remove(temporaryString2);
                                listToCheck.remove(temporaryString1);
                                this.unmatched.add("Ende der Liste");
                                this.matched.add("Ende der Liste");
                            }
                            listToCheck.clear();
                        }

                        break;

                    case 2:// NOT End of List(hasNext)
                        matched = this.functionToCheck(temporaryString1, temporaryString2);
                        if (matched) {

                            this.matched.add(temporaryString2);
                            listToCheck.remove(temporaryString2);
                            temporaryString2 = (String) listToCheckIterator.next();
                        } else

                        if (!matched) {
                            this.unmatched.add(temporaryString2);
                            listToCheck.remove(temporaryString2);
                            temporaryString2 = listToCheckIterator.next();
                        }
                        break;
                } // End of Switch Case

            }

            aScn.close();
        }

    }
}
