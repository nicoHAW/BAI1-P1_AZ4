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
        boolean isPalindrome = false;
        String foundPalindrome ="";

        //Durchlaufe Buchstaben
        for (int i=0; i<this.checkPalindrome.length()-1;i++) {

            left = i;
            right = this.checkPalindrome.length()-1-i;

            for (int j=0; i<this.checkPalindrome.length()-1;j++) {

                //TODO noch mal richtig machen. 

                //searching for identical characters on the first right position
                if (Character.toLowerCase(this.checkPalindrome.charAt(left)) == Character.toLowerCase(this.checkPalindrome.charAt(right))) {

                    //checking if the next character is also identical with the next character on the right position. 
                    if (Character.toLowerCase(this.checkPalindrome.charAt(left+1)) == Character.toLowerCase(this.checkPalindrome.charAt(right-1))) {

                        //create a substring from the first letter to the last letter of identical characters
                        String checkSubString = this.checkPalindrome.substring(left,right);


                        // checks all letters of substring - wrong 
                        int subStringLeft = 0;
                        int subStringRight = checkSubString.length();

                        while (Character.toLowerCase(checkSubString.charAt(subStringLeft)) == Character.toLowerCase(checkSubString.charAt(subStringRight)) && (left <= right)) {
                            subStringLeft++;
                            subStringRight--;
                        } //while

                        isPalindrome = (left <= right);

                        if (isPalindrome) {
                            foundPalindrome = checkSubString;
                        }
                    } //if
                } //if
            }//for
        } // for

        if (isPalindrome) {
            return foundPalindrome;
        } else {
            return "No String found";
        }
        //if
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
