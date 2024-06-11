package palindromeFinder;

public class PalindromeFinder {

    public boolean isPalindrome(char[] word) {
        //String wordString = new String(word);
        //Character.toLowerCase
        //char[] text_v1 = theText_v1.toLowerCase().toCharArray();    // String (geeignet) in char[] wandeln


        int left = 0;
        int right = word.length-1;
        while (Character.toLowerCase(word[left]) == Character.toLowerCase(word[right]) && left <= right) {            
            left++;
            right--;
        } // while
        
        return left > right;
        
    } // method isPalindrome    
    
}
