package palindromeFinder;

/**
 * PalindromeFinder
 * 
 * @author   Raffael Apitz & Frithjof Beims
 * @version  04.06.2024
 *
 */
public class PalindromeFinder {

    private String text;
    private String textKleineChars;

    public PalindromeFinder() {}

    public PalindromeFinder(String text) {
        this.text = text;
        textKleineChars = text.toLowerCase();
    }

    public void setText(String text) {
        this.text = text;
        textKleineChars = text.toLowerCase();
    }

    public String getText() {
        return text;
    }

    public String getLongestPalindrome() {
        String longestPalindrom = "";
        int indexVorne = 0; //Zeichen Vorne (Index)
        int indexHinten = textKleineChars.length() - 1;  //Zeichen Hinten (Index)
        boolean istPalindrom = false;

        do {
            while(!istPalindrom && indexHinten > indexVorne && (indexHinten - indexVorne) > longestPalindrom.length()) {
                //Durch Text itterien und gucken ob zeichen Vorne und Hinten gleich sindd
                //Wenn zeichen Vorne und Hinten gleich sind und das Palindrom länger als das aktuelle wäre dann prüfen ob Palindrom
                if(textKleineChars.charAt(indexVorne) == textKleineChars.charAt(indexHinten)) {
                    istPalindrom = testPalindrom(indexVorne, indexHinten);
                }

                if(istPalindrom) {
                    //Wenn der Abschnitt ein Palindrom ist - speichern wir den Abschnitt vom Text als Palindrom
                    longestPalindrom = textKleineChars.substring(indexVorne, indexHinten + 1);
                    istPalindrom = false;
                }else {
                    //ansonsten verringern wir unseren hinteren Index um die beiden nächsten Charaktere zu vergleichen
                    indexHinten--;
                }
            }

            //Index Hinten zurücksetzten da sonst schleifenbedingung gebrochen wird
            //wir starten gleich mit dem Index vorne einen weiter und dem hinteren erneut auf dem letzten möglichen Index
            indexHinten = textKleineChars.length() - 1;
            indexVorne++;
            //Wenn das neue Palindrom nur kleiner sein kann als das alte könne wir die Schleife abbrechen
            //oder wenn der vordere Index größer oder gleich dem hinteren ist
        } while(indexVorne < indexHinten && (indexHinten - indexVorne) > longestPalindrom.length());
        return longestPalindrom;
    }

    //testen ob text der zwischen gegebenen Indexen liegt ein Palindrom ist
    private boolean testPalindrom(int indexVorne, int indexHinten) {
        //kopieren der Indexe damit die äußeren nicht verändert werden
        int indexV = indexVorne;
        int indexH = indexHinten;

        while (indexV < indexH && textKleineChars.charAt(indexV) == textKleineChars.charAt(indexH)) {
            indexV++;
            indexH--;
        }
        //falls der vordere Index größer als der hintere ist > hat alles geklappt und der Text ist ein Palindrom (weil unsere Schleife erfolgreich bis zum Ende durchlief
        return (indexV >= indexH);
    }

}
