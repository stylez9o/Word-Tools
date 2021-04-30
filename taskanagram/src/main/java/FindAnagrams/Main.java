package FindAnagrams;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) {

    List linkedList = new LinkedList<String>();

    try {
      File myObj = new File("test.txt");

      // System.out.println("Readable " + myObj.canRead());
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        linkedList.add((String) data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    Scanner giveInst = new Scanner(System.in);

    for (int i = 0; i < 1; i++) {
      System.out.println("Choose:\nShow Anagrams [1]   Show all that isnt a Anagram [2]");
      String input = giveInst.nextLine();
      Integer zahl = Integer.valueOf(input);
      switch (zahl) {

        case 1:
          System.out.println("Anagram's':");
          AnagramProofer.isAnAnagram(linkedList);
          System.out.println("\n------\n");
          break;

        case 2:
          System.out.println("NO Anagrams:");
          AnagramProofer.isNotAnAnagram(linkedList);
          System.out.println("\n------\n");
          break;

        default:
          System.out.println("What have you done? You should type only the offered options!\nTry again!");
          break;
      }
    }

  }
}
