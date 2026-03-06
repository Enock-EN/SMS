package utils;

public class Validation {
    public static boolean isEmailValid(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean isMarksValid(int marks) {
        return marks >= 0 && marks <= 100;
    }

    public static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }
}