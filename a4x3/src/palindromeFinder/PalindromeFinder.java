package palindromeFinder;

public class PalindromeFinder {

    // ---------- VARIABLES ----------
    private String checkPalindrome;


    //---------- CONSTRUCTOR ----------
    // Constructor with parameter
    public PalindromeFinder(String givenWord) {
        boolean valid = checkGivenWord(givenWord);

        assert valid : "String can't be null";

        if (valid) {
            this.checkPalindrome = givenWord;
        } //fi
    } //constructor PalindromeFinder

    // Constructor without parameter
    public PalindromeFinder() {
        this("demoomed");
    }


    //---------- METHODS ----------
    public String getLongestPalindrom() {

        int left = 0;
        int right = this.checkPalindrome.length()-1;

        for (int i=0; i<this.checkPalindrome.length()-1;i++) {
            
            left = 0;
            right = this.checkPalindrome.length()-1;
            
          //TODO noch mal richtig machen. 
            
            if (String.toLowerCase(this.checkPalindrome.charAt(i))) == String.toLowerCase(this.checkPalindrome.charAt(this.checkPalindrome.length()-1)) {
               
                // If letters same, create substring then check if palindrome
                String checkString = this.checkPalindrome.subString(left, right);
                
                while (String.toLowerCase(this.checkPalindrome.charAt[left]) == String.toLowerCase(this.checkPalindrome.charAt[right]) && left <= right) {
                    continue // weitermachen mit schleife wenn ungleich
                } //while
                return Palindrome;
            } //if
        
    } // for

} // method getLongestPalindrom    

//---------- REGULAR CLASS METHODS ----------
void setText( String newWord ) {
    boolean valid = checkGivenWord(newWord);

    if (valid) {
        this.checkPalindrome = newWord;
    }
}

String getText() {
    return this.checkPalindrome;
}


//CHECKS
private boolean checkGivenWord(String wordValid) {
    return wordValid != null;
}

}
