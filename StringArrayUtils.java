
/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if (array.length > 1) {
            return array[1];
        } else {
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int lastIndex = array.length - 1;
        return array[lastIndex];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int secondToLastIndex = array.length - 2;
        if (secondToLastIndex >= 0) {
            return array[secondToLastIndex];
        } else {
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        Boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        Boolean isPalindromic = true;
        int forwardIndex = 0, backwardIndex = array.length - 1;
        while (forwardIndex != backwardIndex && backwardIndex > forwardIndex) {
            if (!array[forwardIndex].equals(array[backwardIndex])) {
                isPalindromic = false;
                break;
            }
            forwardIndex++;
            backwardIndex--;
        }
        return isPalindromic;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Boolean isPangramic = false;
        Boolean[] letterFoundArray = new Boolean[26];
        int uniqueLetterCount = 0;

        // Initial letterRoundArray to having all false.
        for (int i = 0; i < letterFoundArray.length; i++) {
            letterFoundArray[i] = false;
        }

        // Read each string in the array one by one.
        for (int i = 0; i < array.length; i++) {
            String sentence = array[i].toLowerCase();

            // Evaluate each character in the string to determine if it has
            // been found already and if not, change to the corresponding
            // value in the letterFoundArray to true.
            //
            // A better way would be to use Sets and Hashsets and then
            // determine if it contained all 26 alphabets from it's size.
            //
            // However, I wanted to strictly use arrays for this assignment.
            //
            // I could have also made some constants to refer letters to numbers
            // rather than hardcoding the index position of aletter in the array.
            // Refractoring this code into another function would have been nice too.
            for (int j = 0; j < sentence.length(); j++) {
                char letter = sentence.charAt(j);
                switch (letter) {
                    case 'a':
                        if (!letterFoundArray[0]) {
                            letterFoundArray[0] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'b':
                        if (!letterFoundArray[1]) {
                            letterFoundArray[1] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'c':
                        if (!letterFoundArray[2]) {
                            letterFoundArray[2] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'd':
                        if (!letterFoundArray[3]) {
                            letterFoundArray[3] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'e':
                        if (!letterFoundArray[4]) {
                            letterFoundArray[4] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'f':
                        if (!letterFoundArray[5]) {
                            letterFoundArray[5] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'g':
                        if (!letterFoundArray[6]) {
                            letterFoundArray[6] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'h':
                        if (!letterFoundArray[7]) {
                            letterFoundArray[7] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'i':
                        if (!letterFoundArray[8]) {
                            letterFoundArray[8] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'j':
                        if (!letterFoundArray[9]) {
                            letterFoundArray[9] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'k':
                        if (!letterFoundArray[10]) {
                            letterFoundArray[10] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'l':
                        if (!letterFoundArray[11]) {
                            letterFoundArray[11] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'm':
                        if (!letterFoundArray[12]) {
                            letterFoundArray[12] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'n':
                        if (!letterFoundArray[13]) {
                            letterFoundArray[13] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'o':
                        if (!letterFoundArray[14]) {
                            letterFoundArray[14] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'p':
                        if (!letterFoundArray[15]) {
                            letterFoundArray[15] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'q':
                        if (!letterFoundArray[16]) {
                            letterFoundArray[16] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'r':
                        if (!letterFoundArray[17]) {
                            letterFoundArray[17] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 's':
                        if (!letterFoundArray[18]) {
                            letterFoundArray[18] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 't':
                        if (!letterFoundArray[19]) {
                            letterFoundArray[19] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'u':
                        if (!letterFoundArray[20]) {
                            letterFoundArray[20] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'v':
                        if (!letterFoundArray[21]) {
                            letterFoundArray[21] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'w':
                        if (!letterFoundArray[22]) {
                            letterFoundArray[22] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'x':
                        if (!letterFoundArray[23]) {
                            letterFoundArray[23] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'y':
                        if (!letterFoundArray[24]) {
                            letterFoundArray[24] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    case 'z':
                        if (!letterFoundArray[25]) {
                            letterFoundArray[25] = true;
                            uniqueLetterCount++;
                        }
                        break;
                    default:
                        break;
                } // switch (letter)
            } // for (int j = 0; j < word.length(); j++)
        } // for (int i = 0; i < array.length; i++)

        if (uniqueLetterCount == 26) {
            isPangramic = true;
        }

        return isPangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int getNumberOfOccurrences = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                getNumberOfOccurrences++;
            }
        }

        return getNumberOfOccurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] removedValueArray = new String[array.length - 1];
        int currentStoringIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                removedValueArray[currentStoringIndex] = array[i];
                currentStoringIndex++;
            }
        }

        return removedValueArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence
     *         concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }

}
