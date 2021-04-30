package old;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WordToolsOLD {


    public List automaticListInserter(){

    // Test: create List and add some test-data(words) to it (value of 4)
        List wordPool = new LinkedList<String>();

        wordPool.add("Race");
        wordPool.add("Care");
        wordPool.add("Tuff");
        wordPool.add("Water");

        return wordPool;
    
    }



    private boolean functionToCheck(String a, String b){

            char []a1 = a.toLowerCase().toCharArray();
            char []b1 = b.toLowerCase().toCharArray();
        
            Arrays.sort(a1);
            Arrays.sort(b1);
        
            String x = new String(a1), y = new String(b1);
        

            if(x.equals(y)){
                System.out.println("Match {\n" + a + "\n" + b + "\n}");
                return true;
            }else{
                return x.equals(y);
            }
    }


// Variante mit Übergabe Parameter(List) zum Testen
    public void startCheckingAnagrams(List<String> listToCheck) {
        int j = 1;
        boolean matched;
        String temporaryString1 =  "";
        String temporaryString2 = "";
        
            Scanner aScn = new Scanner(System.in);
            System.out.println("Zum starten des Prüfvorganges, bitte die [Enter-Taste] drücken!");
                    aScn.next();
                System.out.println();
                
            for(int count = 0; count<listToCheck.size(); count++){
                if(count == 0){
                    // Startwerte
                    temporaryString1 = listToCheck.get(0);
                    temporaryString2 = listToCheck.get(1);
                } else
                {

                        Iterator<String> listToCheckIterator = listToCheck.iterator();

                    matched = this.functionToCheck(temporaryString1, temporaryString2);
                    if(matched){
                        listToCheck.remove(temporaryString1);
                        listToCheck.remove(temporaryString2);
                        temporaryString1 = "";
                        temporaryString2 = "aaaaaaaaaa";
                        temporaryString1 = listToCheck.get(0);
                            
                    }else if(!matched){
                            temporaryString2 = listToCheckIterator.next();
                            if(temporaryString2.equals(temporaryString1))
                            {
                                temporaryString2 = listToCheckIterator.next();
                            }else{
                                if(count == listToCheck.size())
                                {
                                    System.out.println("UnMatched {\n");
                                        for (String string : listToCheck) {
                                            System.out.println(string);
                                        }
                                    System.out.println("\n}");
                                    break;
                                    
                                } else{}
                            }
                    
                    
                }
            }
           aScn.close();
        }   
    
    }
}
