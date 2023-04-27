public class WordUtils {
    public static String getWordInCapitalLettersd(String word) {
        if (word != null) {         //word. ( apare metoda fara m) sunt generate de intelijj (live template)
            return word.toUpperCase();
        }
        return null;
    }

    public static Double convertToDouble(String birthDayYear) {
        if (birthDayYear != null) {
            return Double.valueOf(birthDayYear);
        }
        return null;

    }
//
//    public static boolean getDefaultIfNull(String name, String defaultName) {
//        if (name == null) {
//            return defaultName;
//        }
//        else return name;


    //        //
//        return name==null ? defaultName: name;  // operator ternar " ? :
    public static boolean isNullOrBlankOrEmpty(String name) {
        return name == null || name.trim().length() == 0;
    }

    //concat multiple words into phrase
    //String[] words = {"Ana", "are", null, "mere" }
    public static String concat(String[] words) {
        String returnedString = null;
        if (words != null && words.length > 0) {
            //creare de Stringur
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                String myStringFromArray = words[i];

                if (myStringFromArray != null) {
                    stringBuilder.append(myStringFromArray);
                }

            }
            returnedString = stringBuilder.toString();
        }
        return returnedString;

    }

}



