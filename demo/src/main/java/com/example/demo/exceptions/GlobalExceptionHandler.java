package com.example.demo.exceptions;

import jdk.jshell.spi.ExecutionControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(ExecutionControl.UserException.class)
//    public ResponseEntity<MyErorDetails> userExceptionHandler(ExecutionControl.UserException ce, WebRequest req) {
//
//
//        MyErorDetails err = new MyErorDetails();
//        err.setTimeStamp(LocalDateTime.now());
//        err.setMessage(ce.getMessage());
//        err.setHttpStatus(HttpStatus.NOT_FOUND);
//        err.setDetails(req.getDescription(false));
//
//        return new ResponseEntity<MyErorDetails>(err, HttpStatus.NOT_FOUND);
//    }


}
