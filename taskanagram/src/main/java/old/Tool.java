package old;
import java.util.Arrays;

public class Tool {
        //When String a equals to String b, it returns true
        private boolean functionToCheck(String a, String b){

            char []a1 = a.toLowerCase().toCharArray();
            char []b1 = b.toLowerCase().toCharArray();
        
            Arrays.sort(a1);
            Arrays.sort(b1);
        
            String x = new String(a1), y = new String(b1);
        

            if(x.equals(y)){
                
                return true;
            }else{
                return x.equals(y);
            }
        }







}
