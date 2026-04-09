package com.joseronildo.UsuarioApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleNotFound(ResourceNotFoundException ex) {
        Map<String, String> error = new HashMap<>();
        error.put("status", "404");
        error.put("mensagem", ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleGeral(Exception ex) {
        Map<String, String> error = new HashMap<>();
        error.put("status", "500");
        error.put("mensagem", ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}