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

    } //constructor

    // Constructor without parameter
    public PalindromeFinder() {
        this("This is your default not palindrome");
    }//constructor


    //---------- METHODS ----------
    public String getLongestPalindrome() {
        String yourPalindrome = "";     //OutputPalindrome
        String lowerCaseCheckPalindrome = this.checkPalindrome.toLowerCase(); //
        

        // Outer for-loop moves the left pointer to the right. 
        int outerRight = this.checkPalindrome.length()-1; //Position of right pointer for outer loop
        boolean isPalindrome=false;
        for (int i = 0; i < outerRight; i++) {

         // inner for-loop moves the right pointer towards the left pointer 
            int innerRight = this.checkPalindrome.length()-1;
            for (int j = i; j < innerRight; innerRight--) {

             // checks if letters are the same. 
                if ((lowerCaseCheckPalindrome.charAt(j) == lowerCaseCheckPalindrome.charAt(innerRight)) && (lowerCaseCheckPalindrome.charAt(j+1) == lowerCaseCheckPalindrome.charAt(innerRight-1))) {

                 // checks if the next letter is also the same.  
                    if ((innerRight+1-j) > yourPalindrome.length()) {
                        String checkSubString = this.checkPalindrome.substring(j,innerRight+1);
                        isPalindrome = validatePalidrome(checkSubString);

                        if (isPalindrome) {
                            yourPalindrome = checkSubString;
                        }
                    }
                }
            } //for inner
        } // for outer

        if (yourPalindrome.length() == 0) {
            return "Not a Palindrome";
        } return yourPalindrome;


    } // method getLongestPalindrom    

    private boolean validatePalidrome(String checkPalindrome) {
        int left = 0;
        int right = checkPalindrome.length()-1;

        while (Character.toLowerCase(checkPalindrome.charAt(left)) == Character.toLowerCase(checkPalindrome.charAt(right-left)) && (left < right)) {
            left++;
        } //while

        return (left >= right);
    }




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

    int getTextLength() {
        return this.checkPalindrome.length();
    }

    String getSmallLetters() {
        return this.checkPalindrome.toLowerCase();
    }

    //CHECKS
    private boolean checkGivenWord(String wordValid) {
        return wordValid != null;
    }

}
