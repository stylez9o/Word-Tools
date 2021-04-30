import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MainOLD {

  public static void main(String[] args) throws IOException {

    List listToCheck = new LinkedList<String>();
    List matched = new ArrayList<String>();
    List unmatched = new ArrayList<String>();
    WordTools tool1 = new WordTools();

    String temporaryString1 = "";
    String temporaryString2 = "";
    boolean isMatched = true;

    // temporaryString2 = tool1.functionToCheck2("Repte", "Peter");
    // System.out.println(temporaryString2);
    // isMatched = tool1.functionToCheck1("Repte", "Peter");
    // System.out.println(isMatched);

    listToCheck.add("Peter");
    listToCheck.add("Paul");
    listToCheck.add("Repte");
    listToCheck.add("Laup");
    listToCheck.add("Soll");

    Iterator<String> listToCheckIterator = listToCheck.iterator();
    Iterator<String> listToCheckIterator2 = listToCheck.iterator();
    while (listToCheckIterator.hasNext()) {
      System.out.println("---");
      // temporaryString1 = listToCheckIterator.next();
      // System.out.println("--[" + temporaryString1 + "]");
      System.out.println(listToCheckIterator.next());

      while (listToCheckIterator2.hasNext()) {
        temporaryString2 = tool1.functionToCheck2(listToCheckIterator.next(), listToCheckIterator2.next());
        if (!listToCheckIterator2.hasNext()) {

        } else {
          System.out.println(temporaryString2);
        }
        // temporaryString2 = listToCheckIterator.next();
        // isMatched = tool1.functionToCheck(temporaryString1, temporaryString2);

        // if (isMatched & listToCheckIterator2.hasNext()) {
        // System.out.println(listToCheckIterator.next());

        // } else {}

      }
      System.out.println("---");
    }

    // Test: How Iterator works with

    // for (Object object : listToCheck) {
    // System.out.println(object);
    // }

    // System.out.println("----\n" + listToCheck.iterator().next());

    // while(listToCheckIterator.hasNext()){
    // System.out.println(listToCheckIterator.next());

    // }
    // System.out.println("----\n" + listToCheckIterator.next());
    // System.out.println("----\n" + listToCheckIterator.next());
    // System.out.println("----\n" + listToCheckIterator.next());

    // listToCheck = Arrays.asList(a);

    // Read File and put content in list

    // try {
    // File myObj = new File("test.txt");

    // System.out.println("Readable " + myObj.canRead());
    // Scanner myReader = new Scanner(myObj);
    // while (myReader.hasNextLine()) {
    // String data = myReader.nextLine();
    // listToCheck.add(data);
    // }
    // myReader.close();
    // } catch (FileNotFoundException e) {
    // System.out.println("An error occurred.");
    // e.printStackTrace();
    // }

    // tool1.startCheckingAnagrams(listToCheck);
    // File unmatchedLog = new File("unmatched.txt");
    // File matchedLog = new File("matched.txt");

    // try {
    // FileWriter unmatchedWriter = new FileWriter("unmatched.txt");
    // FileWriter matchedWriter = new FileWriter("matched.txt");

    // for (Object entry : tool1.unmatched) {
    // unmatchedWriter.write(entry + "\n");
    // }
    // unmatchedWriter.close();
    // for (Object entry : tool1.matched) {
    // matchedWriter.write(entry + "\n");
    // }
    // matchedWriter.close();

    // System.out.println("Successfully wrote the files and saved them to your
    // project directory.");
    // } catch (IOException e) {
    // System.out.println("An error occurred.");
    // e.printStackTrace();
    // }

    // unmatchedLog.createNewFile();
    // matchedLog.createNewFile();
    // System.out.println("abc-pfad: " + abc.getAbsolutePath());
    // System.out.println("myobj path: " + myObj.getAbsolutePath());

  }

}
