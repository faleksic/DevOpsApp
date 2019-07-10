package hr.faleksic.devopsapp;

public class StringManipulator {
    public static String convertToReverseUpperCase(String data) {
        char[] reverseArr = data.toCharArray();
        char[] resultArr = new char[reverseArr.length];
        for(int i = reverseArr.length-1; i >= 0; i--) {
            resultArr[reverseArr.length-1-i] = reverseArr[i];
        }
        return new String(resultArr).toUpperCase();
    }
}
