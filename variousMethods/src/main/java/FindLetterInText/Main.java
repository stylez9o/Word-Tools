package FindLetterInText;
public class Main {
    
    public static void main(String[] args){


    // Erstelle eine Methode die Text nach gesuchten Buchstaben durchsucht
    // und diese ann zusammenfügt!


        String text = "Das Internet ist ein Zusammenschluss aus unzähligen " + 
                      "Computernetzwerken, die zu einem einzigen großen Netz" + 
                      " zusammengeschlossen sind und untereinander Daten austauschen. " + 
                      "Dadurch kann man E-Mails verschicken, Dateien herunterladen, " + 
                      "Filme streamen und auf Webseiten surfen.";


        String text2 = "aaaA";
        
        StringMethods method1 = new StringMethods();

        method1.findLetterInText(text2, 'a');
        System.out.print(" ");
        method1.findLetterAllCaseInText(text2, 'a');
        System.out.print(" ");
        method1.deleteLetterFromText("bbbB", "b");
        

    }
}
