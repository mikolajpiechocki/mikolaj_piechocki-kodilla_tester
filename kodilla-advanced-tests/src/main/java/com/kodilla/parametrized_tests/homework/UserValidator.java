package com.kodilla.parametrized_tests.homework;

public class UserValidator {
    public boolean validateUsername(String username) {
        return username.matches("^[a-zA-Z0-9._-]{3,}$\n");
    }

    public boolean validateEmail(String email) {
        if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
            java.util.regex.Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }
}
