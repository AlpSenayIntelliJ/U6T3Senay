public class ArrayAlgorithms {
    /** Returnes the longest String(s) in an array of Strings.
     *      *  If multiple strings are tied for longest length, return the last
     *      *  element in th list with that length.
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: stringList.length > 0
     */
    public static String longestString(String[] stringList) {
        String longStr = "";
        for (String str : stringList) {
            if (str.length() >= longStr.length()) {
                longStr = str;
            }
        }
        return longStr;
    }

    /** Returns true if ANY of the ints in numList are positive, otherwise,
     *  returns false; use an early return to improve efficiency!
     *  note: 0 is not considered positive
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: numList.length > 0
     */
    public static boolean containsPositive(int[] numList)
    {
        for (int num : numList) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }

    /** Returns a NEW array of Strings that contains all words from the original
     *  array of strings in lowercase (use the toLowerCase() string method)
     *
     *  This method does NOT modify the original array
     *  PRECONDITION: wordList.length > 0
     */
    public static String[] makeLowercase(String[] wordList) {
        String[] arr = new String[wordList.length];
        for (int i = 0; i < wordList.length; i++) {
            arr += wordList[i].toLowerCase();
        }
    }

}
