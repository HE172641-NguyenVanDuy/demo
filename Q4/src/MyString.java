
import java.util.Arrays;

public class MyString implements IString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }
     
    
    
    @Override
    public int f1(String str) {
       int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(checkPrime(c))
                count++;
        }
        return count;
    }
    public static boolean checkPrime(char c) {
        int n = Character.getNumericValue(c);
        if(n <= 1)
            return false;
        else {
            int squareRoot = (int)Math.sqrt(n);
            for (int j = 2; j <= squareRoot; j++) {
                if(n%j == 0)
                    return false;
            }
        }
            
        return true;
    }
    
    
    @Override
    public String f2(String str) {
        String word[]  = str.split("//s+");
        StringBuilder sb = new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            sb.append(word[i]).append(" ");
        }
        return sb.toString().trim();
    }
    
}
