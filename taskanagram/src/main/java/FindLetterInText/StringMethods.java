package FindLetterInText;

import java.util.ArrayList;
import java.util.List;

public class StringMethods {

    public void findLetterInText(String text, char letterToFind) {

        List foundedLetters = new ArrayList();
        Character foundLetter = ' ';
        
        for(int i = 0; i<text.length(); i++) {

            if(text.charAt(i) == letterToFind){
                foundLetter = text.charAt(i);
                foundedLetters.add(foundLetter);
            }
            else {

            }
        }
        System.out.println("Suche nur KLEIN oder GROSS-SCHRIFT");
        System.out.println("In dem gesuchten Text wurde der Buchstabe " +
                            letterToFind + ", " + foundedLetters.size() + "mal gefunden");
    }

    public void findLetterAllCaseInText(String text, char letterToFind) {

       String text2 = text.toLowerCase();
        List foundedLetters = new ArrayList();
        Character foundLetter = ' ';
       char letterToFind2 = Character.toLowerCase(letterToFind);
        

        for(int i = 0; i<text2.length(); i++) {
           Character tempChar;

            if(text2.charAt(i) == letterToFind2){
                foundLetter = text2.charAt(i);
                foundedLetters.add(foundLetter);
            }
            else {

            }
        }
        System.out.println("Suche Alles");
        System.out.println("In dem gesuchten Text wurde der Buchstabe " +
                            letterToFind2 + ", " + foundedLetters.size() + "mal gefunden");
    }


    public void deleteLetterFromText(String text, String letterToDelete) {
        
        text.replaceAll(letterToDelete, "");

        
    
        System.out.println(text);

    }


}
