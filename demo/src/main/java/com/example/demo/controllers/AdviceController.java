package com.example.demo.controllers;

import com.example.demo.models.exceptions.ExceptionBody;
import com.example.demo.models.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

/**
 * Контроллер обработки исключений.
 */

@RestControllerAdvice
public class AdviceController {
    /**
     * Обработка исключения ResourceNotFoundException.
     * @param e объект исключения.
     * @return ответ оберткой исключения.
     */
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionBody resourceNotFound(ResourceNotFoundException e){
        ExceptionBody exceptionBody = new ExceptionBody();
        exceptionBody.setMessage(e.getMessage());
        exceptionBody.setLocalDateTime(LocalDateTime.now());
        return exceptionBody;
    }

    /**
     * Обработка исключения Exception
     * @param e объект исключения.
     * @return ответ оберткой исключения.
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionBody badCase(Exception e){
        ExceptionBody exceptionBody = new ExceptionBody();
        exceptionBody.setMessage("Что-то пошло не так...");
        exceptionBody.setLocalDateTime(LocalDateTime.now());
        return exceptionBody;
    }

}