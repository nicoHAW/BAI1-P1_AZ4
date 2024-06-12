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
        this("This is your default not palindrome");
    }


    //---------- METHODS ----------
    public String getLongestPalindrome() {
        String yourPalindrome = "";
        String currentPalindrome = "";

        int outerRight = this.checkPalindrome.length()-1;
        boolean isPalindrome=false;

        for (int i = 0; i < outerRight; i++) {
     /*       isPalindrome = validatePalidrome(this.checkPalindrome.substring(i,outerRight+1));

            if (isPalindrome) {
                currentPalindrome = this.checkPalindrome.substring(i,outerRight+1);
                
                if (currentPalindrome.length() > yourPalindrome.length()) {
                    yourPalindrome = currentPalindrome;
                }
            }
*/
            int innerRight = this.checkPalindrome.length()-1;
            for (int j = i; j < innerRight; innerRight--) {

                if ((Character.toLowerCase(this.checkPalindrome.charAt(j)) == Character.toLowerCase(this.checkPalindrome.charAt(innerRight))) && (Character.toLowerCase(this.checkPalindrome.charAt(j+1)) == Character.toLowerCase(this.checkPalindrome.charAt(innerRight-1)))) {

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
