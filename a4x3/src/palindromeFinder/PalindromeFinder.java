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
        int wordLength = this.checkPalindrome.length()-1; //Position of right pointer for outer loop

        boolean isPalindrome;

        for (int i = wordLength; i > 0; i--) {

            for (int j = 0; j+i <= wordLength ; j++) {
                int posl = j;
                int posr = i+j;

                isPalindrome = validatePalidrome(posl, posr);

                if (isPalindrome) {
                    yourPalindrome = this.checkPalindrome.substring(posl,posr);
                    return yourPalindrome;
                }
            }
        }

        if (yourPalindrome.length() == 0) {
            return "Not a Palindrome";
        } return yourPalindrome;


    } // method getLongestPalindrom    


    private boolean validatePalidrome(int left, int right) {

        while (Character.toLowerCase(checkPalindrome.charAt(left)) == Character.toLowerCase(checkPalindrome.charAt(right)) && (left < right)) {
            left++;
            right--;
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
