
import java.util.StringTokenizer;




public class MyString implements IString {
    
    public boolean ifPalindrome(String s) {
        if (s.length()<2) return false;
        for (int i=0;i<s.length()/2;i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    
    public boolean duplicated(char a, String s) {
        for (int i=0;i<s.length();i++) {
            if (a==' ') return false;
            if (a==s.charAt(i)) return true; 
        }
        return false;
    }
    
    public int f1(String str) {
        int result = 0;
        StringTokenizer stk = new StringTokenizer(str);
        while (stk.hasMoreTokens()) {
            String temp = stk.nextToken();
            if (temp.length()>=2 && ifPalindrome(temp) == false) result += temp.length();
        }
        return result;
    }
    
    public String f2(String str) {
        String result = "";
        for (int i=0;i<str.length();i++) {
            if (duplicated(str.charAt(i),result)==false) result += str.substring(i,i+1);
        }
        return result;
    }
}
