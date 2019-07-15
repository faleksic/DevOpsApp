package hr.faleksic.devopsapp;

import java.util.Locale;

public class StringManipulator {

    private StringManipulator() {}

    static String convertToReverseUpperCase(String data) {
        return data.toUpperCase(Locale.getDefault());
    }
}
