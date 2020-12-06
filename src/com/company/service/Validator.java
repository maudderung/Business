package com.company.service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String PHONE_PATTERN="\\d{10}";
    private static final String EMAIL_PATTERN =
            "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    private static final Pattern ePattern = Pattern.compile(EMAIL_PATTERN);
    private static final Pattern telPattern = Pattern.compile(PHONE_PATTERN);

    public static boolean isEmailValid(final String email) {
        Matcher matcher = ePattern.matcher(email);
        return matcher.matches();
    }
    public static boolean isPhoneValid(final String tel){
        Matcher matcher =telPattern.matcher(tel);
        return matcher.matches();
    }

}