package com.example.demo.models.exceptions;

/**
 * Исключение при отсутствии данных в БД.
 */
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}