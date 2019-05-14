import java.util.*;

public class Palindrome{

    public Palindrome(){
        super();
    }

    public boolean palindromChecker(String... args){
        for(String s : args){
            StringBuilder str1 = new StringBuilder(s);
            if( !str1.equals(str1.reverse()) ) return false;                        
        }
        return true;
    }

    public boolean palindromeChecker(String... args){
        for(String s : args){
            StringBuilder str1 = new StringBuilder(s);
            if( !str1.equals(str1.reverse()) ) return false;                        
        }
        return true;
    }
}
