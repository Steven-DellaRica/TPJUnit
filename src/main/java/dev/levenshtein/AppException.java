package dev.levenshtein;

public class AppException extends RuntimeException {
    public AppException(String message) {
        super(message);
    }
}